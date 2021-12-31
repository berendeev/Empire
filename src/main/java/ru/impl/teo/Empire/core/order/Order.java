package ru.impl.teo.Empire.core.order;

import java.util.List;
import java.util.function.Function;

public abstract class Order<T> {

    private final List<Function<T, Boolean>> orderExecutionPossibilities;

    public Order(List<Function<T, Boolean>> orderExecutionPossibilities) {
        this.orderExecutionPossibilities = orderExecutionPossibilities;
    }

    protected abstract void executeOrder(T t, List<?> args);

    public final void execute(T t) {
        execute(t, List.of());
    }

    public final void execute(T t, List<?> args) {
        boolean isExecutionAvailable = orderExecutionPossibilities.stream()
                .allMatch(tBooleanFunction -> tBooleanFunction.apply(t));

        if (isExecutionAvailable) {
            executeOrder(t, args);
        }
    }

}
