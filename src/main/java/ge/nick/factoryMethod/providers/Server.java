package ge.nick.factoryMethod.providers;

import ge.nick.factoryMethod.utils.Transporter;

public class Server implements Transporter {

    private String authLog;
    private String authPass;

    public Server(String authLog, String authPass) {
        this.authLog = authLog;
        this.authPass = authPass;
    }

    @Override
    public String getAuthLog() {
        return authLog;
    }

    @Override
    public String getAuthPass() {
        return authPass;
    }

    @Override
    public String getAPISecret() {
        return null;
    }

    @Override
    public void send() {

        System.out.println("Access to Server SMTP granted.");
        System.out.println("Waiting for Server...");
    }
}
