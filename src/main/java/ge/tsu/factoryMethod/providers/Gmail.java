package ge.tsu.factoryMethod.providers;

import ge.tsu.factoryMethod.utils.Transporter;

import java.util.Objects;

public class Gmail implements Transporter {

    private String authLog;
    private String authPass;
    private String APISecret;

    public Gmail(String authLog, String authPass, String APISecret) {
        this.authLog = authLog;
        this.authPass = authPass;
        this.APISecret = APISecret;
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
        return APISecret;
    }

    @Override
    public void send() {

        if(!"000".equals(APISecret)){

            throw new RuntimeException("Invalid secret of Gmail API.");
        }

        System.out.println("Access to Gmail API granted.");
        System.out.println("Waiting for Gmail...");
    }
}
