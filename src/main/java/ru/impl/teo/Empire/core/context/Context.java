package ru.impl.teo.Empire.core.context;

import lombok.Getter;
import lombok.Setter;
import ru.impl.teo.Empire.core.map.Map;
import ru.impl.teo.Empire.core.player.Country;

import java.util.List;

public enum Context {

    INSTANCE;


    @Getter
    @Setter
    public List<Country> players;

    @Getter
    @Setter
    public Country currentPlayer;

    @Getter
    @Setter
    public Map map;



}
