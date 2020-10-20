package ru.iteco.patterns.emailbuilder;

public class Main {

    public static void main(String[] args) {
        Email email = new EmailBuilder()
                .subject("subject")
//                .from("from")
                .toAll("to")
                .copyTo("copyTo")
                .content(new Content("body", "С уважением: "))
                .build();

        System.out.println(email.toString());
    }

}
