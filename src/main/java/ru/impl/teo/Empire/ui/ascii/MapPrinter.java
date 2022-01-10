package ru.impl.teo.Empire.ui.ascii;

import ru.impl.teo.Empire.core.context.Context;
import ru.impl.teo.Empire.core.map.Territory;

import java.util.List;
import java.util.Map;

public class MapPrinter {
    private final Context context;

    public MapPrinter(Context context) {
        this.context = context;
    }

    public void print() {
        List<Territory> territories = context.getMap().getTerritories();


        for (Territory territory : territories) {
            if (territory.getOwner() == null) {
                System.out.println("T ");
            }else {
                System.out.println("O ");
            }
        }

    }
}
