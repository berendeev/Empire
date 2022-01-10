package ru.impl.teo.Empire.ui.ascii;

import ru.impl.teo.Empire.core.context.Context;
import ru.impl.teo.Empire.core.map.Map;
import ru.impl.teo.Empire.core.map.Territory;
import ru.impl.teo.Empire.core.player.Country;
import ru.impl.teo.Empire.impl.map.DefaultMap;
import ru.impl.teo.Empire.impl.map.territory.Empty;
import ru.impl.teo.Empire.impl.player.DefaultCountry;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Map map = initializeMap();

        Country country = initializePlays();

        map.getTerritories().get(0).setOwner(country);

        Context context = Context.INSTANCE;
        context.setMap(map);
        context.setPlayers(List.of(country));

        MapPrinter mapPrinter = new MapPrinter(context);
        mapPrinter.print();
    }

    private static Country initializePlays() {
        return new DefaultCountry();
    }

    private static Map initializeMap() {

        List<Territory> territories = initializeTerritories();
        DefaultMap defaultMap = new DefaultMap(territories);

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
