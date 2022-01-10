package ru.impl.teo.Empire.core.unit.factory;

import ru.impl.teo.Empire.core.facotry.BaseFactory;
import ru.impl.teo.Empire.core.player.Country;
import ru.impl.teo.Empire.core.unit.Unit;

public abstract class UnitFactory<Input> extends BaseFactory<Input, Unit> {
    private Country unitOwner;


}
