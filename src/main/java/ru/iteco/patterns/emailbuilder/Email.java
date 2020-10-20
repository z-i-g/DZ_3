package ru.iteco.patterns.emailbuilder;

import java.util.HashSet;
import java.util.Set;

public class Email {

    private String subject;
    private Content content;
    private String from = "zagidullin.ayrat@gmail.com";
    private Set<String> to = new HashSet<>();
    private  Set<String> copyTo = new HashSet<>();

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setContent(Content content) {
        content.setFrom(from);
        this.content = content;
    }

    public void setFrom(String from) {
        if (from != null) {
            this.from = from;
        }
    }

    public String getFrom() {
        return from;
    }

    public void setTo(String to) {
        this.to.add(to);
    }

    public void setCopyTo(String copyTo) {
        this.copyTo.add(copyTo);
    }

    @Override
    public String toString() {
        return "Email{" +
                "subject='" + subject + '\'' +
                ", content=" + content +
                ", from='" + from + '\'' +
                ", to=" + to +
                ", copyTo=" + copyTo +
                '}';
    }
}
