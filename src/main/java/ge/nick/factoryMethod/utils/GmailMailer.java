package ge.nick.factoryMethod.utils;

import ge.nick.factoryMethod.providers.Gmail;

/**
* Special class created for working with Gmail service.
* It set values and validate it on client side to store to Gmail.
* It creates mail transporter also to for service.
* Transporter need to authorize user before send.
*/

public class GmailMailer extends Mailer {

    private final String authLog; // Authorization log.
    private final String authPass; // Authorization password.
    private final String APISecret; // API authorization secret key.

    // Parametric constructor to set values.
    public GmailMailer(String authLog, String authPass, String APISecret) {
        this.authLog = authLog;
        this.authPass = authPass;
        this.APISecret = APISecret;
    }

    @Override
    public Transporter createTransporter() {

        // Validate values before storing it to Gmail provider.

        if(authLog.isEmpty()){

            throw new IllegalArgumentException("Authorizations log is required.");
        }

        if(authPass.isEmpty()){

            throw new IllegalArgumentException("Authorizations password is required.");
        }

        if(APISecret.isEmpty()){

            throw new IllegalArgumentException("API secret is required.");
        }

        return new Gmail(authLog, authPass, APISecret);
    }
}
