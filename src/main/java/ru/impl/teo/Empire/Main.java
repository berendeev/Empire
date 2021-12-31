package ru.impl.teo.Empire;

import ru.impl.teo.Empire.core.context.Context;
import ru.impl.teo.Empire.core.map.Map;
import ru.impl.teo.Empire.core.map.Territory;
import ru.impl.teo.Empire.core.player.Player;
import ru.impl.teo.Empire.impl.map.DefaultMap;
import ru.impl.teo.Empire.impl.map.territory.Empty;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        initializeMap();

        initializePlays();

    }

    private static void initializePlays() {

    }

    private static Map initializeMap() {

        List<Territory> territories = initializeTerritories();
        DefaultMap defaultMap = new DefaultMap(territories);

        Context.map = defaultMap;

        return defaultMap;
    }

    private static List<Territory> initializeTerritories() {
        ArrayList<Territory> territories = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            territories.add(new Empty());
        }

        for (int i = 1; i < territories.size() - 2; i++) {
            Territory territory = territories.get(i);
            territory.getConnectedTerritories().add(territories.get(i + 1));
            territory.getConnectedTerritories().add(territories.get(i - 1));
        }
        return territories;
    }
}
