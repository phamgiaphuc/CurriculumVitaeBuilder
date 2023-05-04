package phuc.work.curriculumvitaebuilder.server.authentication;

import io.github.cdimascio.dotenv.Dotenv;
import phuc.work.curriculumvitaebuilder.utilities.ConstantVariables;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class EmailService {

    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        emailService.SendEmails();
    }

    public void SendEmails() {
        // Recipient's email ID needs to be mentioned.
        String receivedEmail = "acuscodinghcm@gmail.com";
        // Sender's email ID needs to be mentioned
        String email_service_id = ConstantVariables.EMAIL_SERVICE_ID;
        // Sender's email PASSWORD needs to be mentioned
        String email_service_password = ConstantVariables.EMAIL_SERVICE_PASS;
        // Assuming you are sending email from through gmails smtp
        String host = "smtp.gmail.com";
        // Get system properties
        Properties properties = System.getProperties();
        // Setup mail server
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");
        // Get the Session object.// and pass username and password
        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(email_service_id, email_service_password);
            }
        });
        // Used to debug SMTP issues
        session.setDebug(true);
        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);
            // Set From: header field of the header.
            message.setFrom(new InternetAddress(email_service_id));
            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(receivedEmail));
            // Set Subject: header field
            message.setSubject("Curriculum Vitae Builder - Code Verification");
            // Now set the actual message
            message.setText("Your code is ######");
            System.out.println("Sending...");
            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}

