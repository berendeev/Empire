package ru.impl.teo.Empire.impl.order.unit.common;

import ru.impl.teo.Empire.core.map.Territory;
import ru.impl.teo.Empire.core.order.UnitOrder;
import ru.impl.teo.Empire.core.unit.Unit;

import java.util.List;
import java.util.Objects;
import java.util.function.Function;

public class MoveOrder extends UnitOrder {

    public MoveOrder(Territory dest) {
        this(List.of(
                // ok if dest is free territory
                (unit) -> Objects.isNull(dest.getOwner())
                // TODO: check dest is near
//                (unit) -> Objects.isNull(dest.getOwner())
                // ok if allies
                //(unit) ->, TODO: when allies logic applied
                // of if enemy
//                (unit) ->
        ));
    }

    public MoveOrder(List<Function<Unit, Boolean>> orderExecutionPossibilities) {
        super(orderExecutionPossibilities);
    }

    // args[0] should be dest Territory
    @Override
    protected void executeOrder(Unit unit, List<?> args) {
        Territory currentPosition = unit.getCurrentPosition();
        currentPosition.removeUnit(unit);

        Territory dest = (Territory) args.get(0);

        dest.addUnit(unit);
    }
}
