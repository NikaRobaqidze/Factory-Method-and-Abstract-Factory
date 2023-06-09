package ge.tsu.factoryMethod.utils;

import ge.tsu.factoryMethod.providers.Server;

public class ServerMailer extends Mailer{

    private String authLog;
    private String authPass;

    public ServerMailer(String authLog, String authPass) {
        this.authLog = authLog;
        this.authPass = authPass;
    }

    @Override
    public Transporter createTransporter() {

        if(authLog.isEmpty()){

            throw new IllegalArgumentException("Authorizations log is required.");
        }

        if(authPass.isEmpty()){

            throw new IllegalArgumentException("Authorizations password is required.");
        }

        return new Server(authLog, authPass);
    }
}
