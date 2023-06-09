package ge.tsu.factoryMethod.utils;

public interface Transporter {

    String getAuthLog();

    String getAuthPass();

    String getAPISecret();


    void send();
}
