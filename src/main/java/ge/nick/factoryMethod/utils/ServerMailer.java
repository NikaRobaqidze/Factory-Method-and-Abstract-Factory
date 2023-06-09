package ge.nick.factoryMethod.utils;

import ge.nick.factoryMethod.providers.Server;

/**
 * Special class created for working some server to send mail.
 * It set authorization values and validate it on client side to store to server.
 * It creates mail transporter also to for server for sending.
 * Transporter need to authorize user before send.
 */

public class ServerMailer extends Mailer{

    private final String authLog; // Authorization log.
    private final String authPass; // Authorization password.

    // Parametric constructor to set values.
    public ServerMailer(String authLog, String authPass) {
        this.authLog = authLog;
        this.authPass = authPass;
    }

    @Override
    public Transporter createTransporter() {

        // Validate values before storing it to server.

        if(authLog.isEmpty()){

            throw new IllegalArgumentException("Authorizations log is required.");
        }

        if(authPass.isEmpty()){

            throw new IllegalArgumentException("Authorizations password is required.");
        }

        return new Server(authLog, authPass);
    }
}
