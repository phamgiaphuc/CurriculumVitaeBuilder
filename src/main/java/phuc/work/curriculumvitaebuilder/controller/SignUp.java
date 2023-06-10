package phuc.work.curriculumvitaebuilder.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;
import phuc.work.curriculumvitaebuilder.Application;
import phuc.work.curriculumvitaebuilder.services.SignUpCheck;

import java.io.IOException;

@Slf4j
public class SignUp {
    // Variables
    @FXML
    private TextField USERNAME;
    @FXML
    private PasswordField PASSWORD;
    @FXML
    private TextField GMAIL;
    private String NEW_USERNAME;
    private String NEW_PASSWORD;
    private String NEW_GMAIL;

    /**
     * Functions
     */
    public void onSignUpButtonClick(MouseEvent event) {
        if (USERNAME.getText().equals("") || PASSWORD.getText().equals("") || GMAIL.getText().equals("")) {
            errorSituation("Signing up error", "Make sure you have filled in everything correctly!", event);
        } else {
            // Variables
            String username = USERNAME.getText().trim();
            String password = PASSWORD.getText().trim();
            String gmail = GMAIL.getText().trim();
            // Sign Up Process
            SignUpCheck signUpCheck = new SignUpCheck(username, password, gmail);
            String check = signUpCheck.startChecking();
        }
    }

    private void errorSituation(String error_title, String error_text, MouseEvent event) {
        Alert errorSituation = new Alert(Alert.AlertType.ERROR, error_title, ButtonType.OK);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        errorSituation.setTitle(String.format("%s!", error_text));
        errorSituation.setContentText(String.format("%s!", error_title));
        errorSituation.initModality(Modality.APPLICATION_MODAL);
        errorSituation.initOwner(stage);
        errorSituation.showAndWait();
    }

    // When users click Cancel button, the view transfers to sign in window.
    public void onCancelButtonClick(MouseEvent event) {
        try {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(Application.class.getResource("sign-in.fxml"));
            Parent parent = loader.load();
            Scene scene = new Scene(parent);
            stage.setScene(scene);
        } catch (IOException e) {
            log.info(String.format("<SignUp - onCancelButtonClick>: Error: The view can not transfer to sign in window -> %s", e));
        }
    }
}
