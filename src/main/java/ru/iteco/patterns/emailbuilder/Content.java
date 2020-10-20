package ru.iteco.patterns.emailbuilder;

public class Content {

    private String body;
    private String signature;
    private String from;

    public Content(String body, String signature) {
        this.body = body;
        this.signature = signature;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    @Override
    public String toString() {
        return "Content{" +
                "body='" + body + '\'' +
                ", signature='" + signature + from + '\'' +
                '}';
    }
}
