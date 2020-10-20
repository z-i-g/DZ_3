package ru.iteco.patterns.emailbuilder;

public interface From {

    To to(String to);

    To toAll(String ... toAll);

    From from(String from);

}
