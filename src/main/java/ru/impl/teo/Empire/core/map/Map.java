package ru.impl.teo.Empire.core.map;

import ru.impl.teo.Empire.core.timer.Timer;

import java.util.List;

public abstract class Map implements Timer {

    protected final List<Territory> territories;

    protected Map(List<Territory> territories) {
        this.territories = territories;
    }
}
