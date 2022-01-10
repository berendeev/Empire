package ru.impl.teo.Empire.core.map;

import lombok.Getter;
import lombok.Setter;
import ru.impl.teo.Empire.core.player.Country;
import ru.impl.teo.Empire.core.timer.Timer;
import ru.impl.teo.Empire.core.unit.Unit;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public abstract class Territory implements Timer {

    private List<Unit> units = new ArrayList<>();

    private List<Territory> connectedTerritories = new ArrayList<>();

    private Country owner;

    //TODO: buildings + cities

    //TODO territory stats


    public void removeUnit(Unit unit) {
        //TODO: check if it possible
        units.remove(unit);
    }

    public void addUnit(Unit unit) {
        //TODO: check if it possible
        units.add(unit);
    }

}
