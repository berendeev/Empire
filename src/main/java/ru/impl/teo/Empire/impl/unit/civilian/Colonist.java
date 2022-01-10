package ru.impl.teo.Empire.impl.unit.civilian;

import ru.impl.teo.Empire.core.map.Territory;
import ru.impl.teo.Empire.core.order.UnitOrder;
import ru.impl.teo.Empire.core.player.Country;
import ru.impl.teo.Empire.core.unit.CivilianUnit;
import ru.impl.teo.Empire.core.unit.Stats;

import java.util.List;

public class Colonist extends CivilianUnit {

    public Colonist(Country owner, Stats stats, List<UnitOrder> allAvailableUnitOrders, Territory currentPosition) {
        super(owner, stats, allAvailableUnitOrders, currentPosition);
    }


}
