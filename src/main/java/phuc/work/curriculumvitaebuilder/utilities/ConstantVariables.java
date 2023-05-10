package phuc.work.curriculumvitaebuilder.utilities;

import io.github.cdimascio.dotenv.Dotenv;

public class ConstantVariables {
    public static String APP_ICON_PATH = "src/main/resources/phuc/work/curriculumvitaebuilder/images/app_icon.png";

    public static String EMAIL_SERVICE_ID = Dotenv.load().get("EMAIL_SERVICE_ID");

    public static String EMAIL_SERVICE_PASS = Dotenv.load().get("EMAIL_SERVICE_PASSWORD");

    public static String EXAMPLE_RECEIVED_EMAIL = Dotenv.load().get("EXAMPLE_RECEIVED_EMAIL");
}
