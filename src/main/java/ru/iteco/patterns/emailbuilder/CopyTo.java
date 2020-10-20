package ru.iteco.patterns.emailbuilder;

public interface CopyTo {

    CopyTo copyTo(String copyTo);

    CopyTo copyToAll(String ... copyToAll);

    IContent content(Content content);

}
