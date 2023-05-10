package phuc.work.curriculumvitaebuilder.services;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SignUpCheck {
    // Variables
    private final String username;
    private final String password;
    private final String gmail;

    public SignUpCheck(String username, String password, String gmail) {
        this.username = username;
        this.password = password;
        this.gmail = gmail;
    }

    /**
     * Functions: Checking stages
     */
    // Start checking
    public String startChecking() {
        String check;
        int a = checkSimilarUsername();
        int b = checkPassword();
        int c = checkGmail();
        int result = a + b + c;
        switch (result) {
            case 1 -> {
                if (a == 1) {
                    check = "u_error"; // Username error
                } else if (b == 1) {
                    check = "p_error"; // Password error
                } else {
                    check = "g_error"; // Gmail error
                }
            }
            case 2 -> {
                if (a == 1 && b == 1) {
                    check = "up_error"; // Username + Password error
                } else if (a == 1 && c == 1) {
                    check = "ug_error"; // Username + Gmail error
                } else {
                    check = "pg_error"; // Password + Gmail error
                }
            }
            case 3 -> check = "upg_error"; // Username + Password + Gmail error
            default -> throw new IllegalStateException(String.format("<SignUpCheck - startChecking>: Unexpected value -> %s", result));
        }
        return check;
    }

    public int checkSimilarUsername() {
        return 1;
    }

    // Check if the password has at least 8 characters
    public int checkPassword() {
        if (password.length() >= 8) {
            // True
            return 0;
        }
        // False
        return 1;
    }

    // Check if the gmail has correct form
    public int checkGmail() {
        if (gmail.contains("@gmail.com") || gmail.contains("@hotmail.com")) {
            // True
            return 0;
        }
        // False
        return 1;
    }
}
