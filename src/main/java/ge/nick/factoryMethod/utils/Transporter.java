package ge.nick.factoryMethod.utils;

/**
 * Interface that include required functions to send email.
 * In this case all email service providers have required
 * this functions to use opportunities and send email.
 */

public interface Transporter {

    // Action to initialize email sending.
    void send();
}
