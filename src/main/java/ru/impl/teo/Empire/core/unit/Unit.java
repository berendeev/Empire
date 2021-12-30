package ru.impl.teo.Empire.core.unit;

import lombok.Getter;
import lombok.Setter;
import ru.impl.teo.Empire.core.map.Territory;
import ru.impl.teo.Empire.core.order.UnitOrder;
import ru.impl.teo.Empire.core.player.Player;
import ru.impl.teo.Empire.core.timer.Timer;

import java.util.List;
import java.util.Objects;

@Getter
@Setter
public abstract class Unit implements Timer {
    private Player owner;
    private Stats stats;
    private List<UnitOrder> allAvailableUnitOrders;
    private Territory currentPosition;

    public Unit(Player owner, Stats stats, List<UnitOrder> allAvailableUnitOrders, Territory currentPosition) {
        this.owner = owner;
        this.stats = stats;
        this.allAvailableUnitOrders = allAvailableUnitOrders;
        this.currentPosition = currentPosition;
    }

    private UnitOrder order;

    @Override
    public void onTick() {
        if (Objects.nonNull(order)) {
            order.executeOrder(this);
        }
    }
}
