package phuc.work.curriculumvitaebuilder.server.authentication;

/**
 * Authentication: User/Admin will get a verified code sent through mail service
 */
public class Authentication {
    public void authentication(String receivedEmail) {
        // Code generation
        GenerateCode generateCode = new GenerateCode();
        String verifiedCode = generateCode.getRandomNumberString();
        // Email service
        EmailService emailService = new EmailService();
        emailService.sendEmails(receivedEmail, verifiedCode);
    }
}
