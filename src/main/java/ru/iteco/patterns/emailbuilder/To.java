package ru.iteco.patterns.emailbuilder;

public interface To {

    CopyTo copyTo(String copyTo);

    CopyTo copyToAll(String ... copyToAll);

    To to(String to);

    To toAll(String ... toAll);

    IContent content(Content content);

}
