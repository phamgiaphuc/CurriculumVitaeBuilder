package phuc.work.curriculumvitaebuilder.server.authentication;

import lombok.extern.slf4j.Slf4j;
import phuc.work.curriculumvitaebuilder.utilities.ConstantVariables;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

@Slf4j
public class EmailService {

    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        emailService.sendEmails("acuscodinghcm@gmail.com", "######");
    }

    public void sendEmails(String receivedEmail, String verifiedCode) {
        // Recipient's email ID needs to be mentioned.
        // String receivedEmail = "acuscodinghcm@gmail.com";
        // Sender's email ID needs to be mentioned
        final String EMAIL_SERVICE_ID = ConstantVariables.EMAIL_SERVICE_ID;
        // Sender's email PASSWORD needs to be mentioned
        final String EMAIL_SERVICE_PASS = ConstantVariables.EMAIL_SERVICE_PASS;
        // Assuming you are sending email from through gmails smtp
        final String host = "smtp.gmail.com";
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
                return new PasswordAuthentication(EMAIL_SERVICE_ID, EMAIL_SERVICE_PASS);
            }
        });
        // Used to debug SMTP issues
        session.setDebug(false);
        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);
            // Set From: header field of the header.
            message.setFrom(new InternetAddress(EMAIL_SERVICE_ID));
            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(receivedEmail));
            // Set Subject: header field
            message.setSubject("Curriculum Vitae Builder - Code Verification", "UTF-8");
            // Set Text: the actual message
            message.setText(String.format("Your verified code is %s. Please enter this to finish the signup process.", verifiedCode), "UTF-8");
            // Set Date: the sending date
            message.setSentDate(new Date());
            log.info("<Email Service - sendEmails>: Sending message...");
            // Send message
            Transport.send(message);
            log.info("<Email Service - sendEmails>: Sending message successfully");
        } catch (MessagingException messagingException) {
            log.info(String.format("<Email Service - sendEmails>: %s", messagingException));
        }
    }
}

