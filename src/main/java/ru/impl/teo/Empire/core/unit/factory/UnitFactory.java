package ru.impl.teo.Empire.core.unit.factory;

import ru.impl.teo.Empire.core.facotry.BaseFactory;
import ru.impl.teo.Empire.core.player.Player;
import ru.impl.teo.Empire.core.unit.Unit;

public abstract class UnitFactory<Input> extends BaseFactory<Input, Unit> {
    private Player unitOwner;


}
