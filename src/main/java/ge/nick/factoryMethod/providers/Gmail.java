package ge.nick.factoryMethod.providers;

import ge.nick.factoryMethod.utils.Transporter;

/**
* Class created to show work of factory method.
* It needs to imitate that this is one of the service provider that
* can complete task.
* This is special service that required special API key.

 * @param authLog   Authorization log.
 * @param authPass  Authorization password.
 * @param APISecret API authorization secret key.
 */

public record Gmail(String authLog, String authPass, String APISecret) implements Transporter {

    @Override
    public void send() {

        // Can be replaced. Send stored key to database to validate it.
        if (!"000".equals(APISecret)) {

            throw new RuntimeException("Invalid secret of Gmail API.");
        }

        System.out.println("Access to Gmail API granted.");
        System.out.println("Waiting for Gmail...");
    }
}
