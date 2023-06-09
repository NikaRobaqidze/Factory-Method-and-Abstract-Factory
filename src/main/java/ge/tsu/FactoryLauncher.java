package ge.tsu;

import ge.tsu.factoryMethod.utils.GmailMailer;
import ge.tsu.factoryMethod.utils.ServerMailer;

public class FactoryLauncher {
    public static void main(String[] args) {

        GmailMailer gmailMailer = new GmailMailer("Joe", "Doe", "000");
        gmailMailer.sendMail("will@gmail.com", "What's up?");

        System.out.println("---");

        ServerMailer serverMailer = new ServerMailer("Elon", "Musk");
        serverMailer.sendMail("cukerberg@facebook.com", "What's new?");
    }
}
