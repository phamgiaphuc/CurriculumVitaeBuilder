package phuc.work.curriculumvitaebuilder;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import phuc.work.curriculumvitaebuilder.utilities.ConstantVariables;

import java.io.IOException;
import java.nio.file.Paths;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("sign-in.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Curriculum Vitae Builder");
        stage.getIcons().add(new Image(Paths.get(ConstantVariables.APP_ICON_PATH).toUri().toString()));
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        stage.setOnCloseRequest(windowEvent -> {
            stage.close();
            System.exit(0);
        });
    }

    public static void main(String[] args) {
        launch();
    }
}