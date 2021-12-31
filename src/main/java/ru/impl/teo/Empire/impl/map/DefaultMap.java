package ru.impl.teo.Empire.impl.map;

import ru.impl.teo.Empire.core.map.Map;
import ru.impl.teo.Empire.core.map.Territory;

import java.util.List;

public class DefaultMap extends Map {

    public DefaultMap(List<Territory> territories) {
        super(territories);
    }

    @Override
    public void onTick() {
        for (Territory territory : territories) {
            territory.onTick();
        }
    }
}
