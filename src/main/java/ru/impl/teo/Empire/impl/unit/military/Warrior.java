package ru.impl.teo.Empire.impl.unit.military;

import ru.impl.teo.Empire.core.map.Territory;
import ru.impl.teo.Empire.core.order.UnitOrder;
import ru.impl.teo.Empire.core.player.Country;
import ru.impl.teo.Empire.core.unit.MilitaryUnit;
import ru.impl.teo.Empire.core.unit.Stats;

import java.util.List;

public class Warrior extends MilitaryUnit {
    
    public Warrior(Country owner, Stats stats, List<UnitOrder> allAvailableUnitOrders, Territory currentPosition) {
        super(owner, stats, allAvailableUnitOrders, currentPosition);
    }
    
}
