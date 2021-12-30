package ru.impl.teo.Empire.core.order;

import lombok.Getter;
import lombok.Setter;
import ru.impl.teo.Empire.core.unit.Unit;

@Getter
@Setter
public abstract class UnitOrder {
    private boolean isAvailable;

    public abstract void executeOrder(Unit unit);

    public abstract void checkAvailableOrder(); //TODO
}
