package ru.iteco.patterns.emailbuilder;

import java.util.Arrays;

public class EmailBuilder implements Subject{

    private Email email;

    public EmailBuilder() {
        this.email = new Email();
    }

    @Override
    public From subject(String subject) {
        return new FromImpl(subject);
    }

    private class FromImpl  implements From{

        public FromImpl(String subject) {
            email.setSubject(subject);
        }

        @Override
        public From from(String from) {
            email.setFrom(from);
            return this;
        }

        @Override
        public To to(String to) {
            return new ToImpl(to);
        }

        @Override
        public To toAll(String... toAll) {
            return new ToImpl(toAll);
        }
    }

    private class ToImpl implements To {

        public ToImpl(String ... toAll) {
            Arrays.stream(toAll).forEach(to -> email.setTo(to));
        }

        @Override
        public CopyTo copyTo(String copyTo) {
            return new CopyToImpl(copyTo);
        }

        @Override
        public CopyTo copyToAll(String... copyToAll) {
            return new CopyToImpl(copyToAll);
        }

        @Override
        public To to(String to) {
            email.setTo(to);
            return this;
        }

        @Override
        public To toAll(String... toAll) {
            Arrays.stream(toAll).forEach(to -> email.setTo(to));
            return this;
        }

        @Override
        public IContent content(Content content) {
            email.setContent(content);
            return new ContentImpl();
        }
    }

    private class CopyToImpl implements CopyTo {

        public CopyToImpl(String ... copyToAll) {
            Arrays.stream(copyToAll).forEach(copyTo -> email.setCopyTo(copyTo));
        }

        @Override
        public CopyTo copyTo(String copyTo) {
            email.setCopyTo(copyTo);
            return this;
        }

        @Override
        public CopyTo copyToAll(String... copyToAll) {
            Arrays.stream(copyToAll).forEach(copyTo -> email.setCopyTo(copyTo));
            return this;
        }

        @Override
        public IContent content(Content content) {
            email.setContent(content);
            return new ContentImpl();
        }
    }

    private class ContentImpl implements IContent{

        @Override
        public Email build() {
            return email;
        }
    }

}
