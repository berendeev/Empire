package ru.impl.teo.Empire.core.map;

import lombok.Getter;
import lombok.Setter;
import ru.impl.teo.Empire.core.player.Player;
import ru.impl.teo.Empire.core.timer.Timer;
import ru.impl.teo.Empire.core.unit.Unit;

import java.util.List;

@Getter
@Setter
public abstract class Territory implements Timer {

    private List<Unit> units;

    private List<Territory> connectedTerritories;

    private Player owner;


}
