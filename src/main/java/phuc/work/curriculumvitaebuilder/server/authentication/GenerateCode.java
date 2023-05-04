package phuc.work.curriculumvitaebuilder.server.authentication;

import java.util.Random;

public class GenerateCode {
    private String getRandomNumberString() {
        // It will generate 6 digit random number from 0 to 999999
        Random random = new Random();
        int number = random.nextInt(999999);
        // This will convert any number sequence into 6 character.
        return String.format("%06d", number);
    }
}
