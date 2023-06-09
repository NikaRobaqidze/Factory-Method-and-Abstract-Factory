package ge.nick.factoryMethod.providers;

import ge.nick.factoryMethod.utils.Transporter;

/**
 * Class created to show work of factory method.
 * It needs to image that this is one of the service that
 * can complete task.
 * This is service that imitate email send from any server.
 * It required basic authorization data.

 * @param authLog  Authorization log.
 * @param authPass Authorization password.
 */

public record Server(String authLog, String authPass) implements Transporter {

    @Override
    public void send() {

        // Can be replaced. Make http request to the server to get authorization.

        System.out.println("Access to Server SMTP granted.");
        System.out.println("Waiting for Server...");
    }
}
