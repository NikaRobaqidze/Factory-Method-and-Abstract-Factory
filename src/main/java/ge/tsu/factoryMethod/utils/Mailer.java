package ge.tsu.factoryMethod.utils;

public abstract class Mailer {

    public void sendMail(String to, String text){

        System.out.println("Sending email...");

        Transporter transporter = createTransporter();
        transporter.send();

        System.out.println("Mail sent successfully.");

        System.out.println("To: <" + to + ">");
        System.out.println("Text: " + text);
    }

    public abstract Transporter createTransporter();
}
