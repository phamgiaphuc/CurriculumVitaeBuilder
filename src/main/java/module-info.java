module phuc.work.curriculumvitaebuilder {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens phuc.work.curriculumvitaebuilder to javafx.fxml;
    exports phuc.work.curriculumvitaebuilder;
}