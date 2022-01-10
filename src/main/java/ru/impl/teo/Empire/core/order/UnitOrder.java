package ru.impl.teo.Empire.core.order;

import lombok.Getter;
import lombok.Setter;
import ru.impl.teo.Empire.core.context.Context;
import ru.impl.teo.Empire.core.unit.Unit;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Getter
@Setter
public abstract class UnitOrder extends Order<Unit> {
    private static final List<Function<Unit, Boolean>> orderExecutionPossibilities = List.of(
            (unit) -> Context.INSTANCE.currentPlayer == unit.getOwner()
    );

    public UnitOrder(List<Function<Unit, Boolean>> orderExecutionPossibilities) {
        super(Stream.of(UnitOrder.orderExecutionPossibilities.stream(), orderExecutionPossibilities.stream())
                .flatMap(Function.identity())
                .collect(Collectors.toList()));
    }
}
