package ge.nick.factoryMethod.utils;

/**
 * Class created to manage email sending.
 * It initializes providers and actions to send email.
 * Creates transporter for it and call send function.
 */

public abstract class Mailer {

    /**
     * Function where transporter initializing.
     * Then call send function. As result, it prints text message on screen.

     * @param to Email address of user that will receive content.
     * @param text Text content that will be sent to user.
     */

    public void sendMail(String to, String text){

        System.out.println("Sending email...");

        // Initialize transporter.
        Transporter transporter = createTransporter();
        transporter.send();

        // Print message on screen.

        System.out.println("Mail sent successfully.");

        System.out.println("To: <" + to + ">");
        System.out.println("Text: " + text);
    }

    public abstract Transporter createTransporter();
}