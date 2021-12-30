package ru.impl.teo.Empire.core.facotry;

public abstract class BaseFactory<Input, Output> {

    public abstract Output create(Input input);
}
