package ge.nick.factoryMethod.utils;

import ge.nick.factoryMethod.providers.Gmail;

public class GmailMailer extends Mailer{

    private String authLog;
    private String authPass;
    private String APISecret;

    public GmailMailer(String authLog, String authPass, String APISecret) {
        this.authLog = authLog;
        this.authPass = authPass;
        this.APISecret = APISecret;
    }

    @Override
    public Transporter createTransporter() {

        if(authLog.isEmpty()){

            throw new IllegalArgumentException("Authorizations log is required.");
        }

        if(authPass.isEmpty()){

            throw new IllegalArgumentException("Authorizations password is required.");
        }

        return new Gmail(authLog, authPass, APISecret);
    }
}
