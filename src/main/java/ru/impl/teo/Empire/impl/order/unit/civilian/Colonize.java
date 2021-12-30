package ru.impl.teo.Empire.impl.order.unit.civilian;

import lombok.extern.slf4j.Slf4j;
import ru.impl.teo.Empire.core.order.UnitOrder;
import ru.impl.teo.Empire.core.player.Player;
import ru.impl.teo.Empire.core.unit.Unit;
import ru.impl.teo.Empire.impl.unit.civilian.Colonist;

@Slf4j
public class Colonize extends UnitOrder {

    @Override
    public void executeOrder(Unit unit) {
        if (!(unit instanceof Colonist)) {
            //TODO: handle exception
        }
        //TODO: find way to update available orders
        if (this.isAvailable()) {
            Player owner = unit.getOwner();
            unit.getCurrentPosition().setOwner(owner);
        }
    }
}
