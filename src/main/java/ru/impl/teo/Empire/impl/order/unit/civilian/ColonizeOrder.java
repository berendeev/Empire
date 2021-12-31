package ru.impl.teo.Empire.impl.order.unit.civilian;

import ru.impl.teo.Empire.core.map.Territory;
import ru.impl.teo.Empire.core.order.UnitOrder;
import ru.impl.teo.Empire.core.player.Player;
import ru.impl.teo.Empire.core.unit.Unit;
import ru.impl.teo.Empire.impl.unit.civilian.Colonist;

import java.util.List;
import java.util.Objects;
import java.util.function.Function;


public class ColonizeOrder extends UnitOrder {

    public ColonizeOrder() {
        this(List.of(
                (unit) -> unit instanceof Colonist,
                (unit) -> Objects.isNull(unit.getCurrentPosition().getOwner())
        ));
    }

    public ColonizeOrder(List<Function<Unit, Boolean>> orderExecutionPossibilities) {
        super(orderExecutionPossibilities);
    }


    @Override
    protected void executeOrder(Unit unit, List<?> args) {
        colonizeTerritory(unit);
    }

    protected void colonizeTerritory(Unit unit){
        Territory territory = unit.getCurrentPosition();

        Player owner = unit.getOwner();
        territory.setOwner(owner);

        unit.destroy();
    }
}
