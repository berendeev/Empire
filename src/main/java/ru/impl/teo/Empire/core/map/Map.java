package ru.impl.teo.Empire.core.map;

import lombok.Getter;
import ru.impl.teo.Empire.core.timer.Timer;

import java.util.List;

public abstract class Map implements Timer {

    @Getter
    protected final List<Territory> territories;

    protected Map(List<Territory> territories) {
        this.territories = territories;
    }
}
