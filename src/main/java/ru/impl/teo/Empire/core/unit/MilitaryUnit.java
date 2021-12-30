package ru.impl.teo.Empire.core.unit;

import ru.impl.teo.Empire.core.map.Territory;
import ru.impl.teo.Empire.core.order.UnitOrder;
import ru.impl.teo.Empire.core.player.Player;

import java.util.List;

public abstract class MilitaryUnit extends Unit {

    public MilitaryUnit(Player owner, Stats stats, List<UnitOrder> allAvailableUnitOrders, Territory currentPosition) {
        super(owner, stats, allAvailableUnitOrders, currentPosition);
    }
}
