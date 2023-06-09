/**
 * @Author: Nika Robaqidze
 * @Email: nika42568@gmail.com

 * Scenarios:
 * Imitate sending email to specific user.
 * Initialize Mailers to complete task.
 * Call functions and print result.
 */

package ge.nick;

import ge.nick.factoryMethod.utils.GmailMailer;
import ge.nick.factoryMethod.utils.ServerMailer;

public class FactoryLauncher {
    public static void main(String[] args) {

        GmailMailer gmailMailer = new GmailMailer("Joe", "Doe", "000");
        gmailMailer.sendMail("will@gmail.com", "What's up?");

        System.out.println("---");

        ServerMailer serverMailer = new ServerMailer("Elon", "Musk");
        serverMailer.sendMail("cukerberg@facebook.com", "What's new?");
    }
}
