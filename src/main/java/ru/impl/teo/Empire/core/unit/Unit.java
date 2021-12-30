package ru.impl.teo.Empire.core.unit;

import ru.impl.teo.Empire.core.order.UnitOrder;
import ru.impl.teo.Empire.core.player.Player;
import ru.impl.teo.Empire.core.timer.Timer;

public abstract class Unit implements Timer {
    private Player owner;

    private UnitOrder order;

    private Stats stats;



}
