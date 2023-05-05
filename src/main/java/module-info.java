module phuc.work.curriculumvitaebuilder {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;
    requires java.mail;
    requires io.github.cdimascio.dotenv.java;
    requires org.slf4j;
    requires org.slf4j.simple;
    requires lombok;

    opens phuc.work.curriculumvitaebuilder to javafx.fxml;
    opens phuc.work.curriculumvitaebuilder.controller to javafx.fxml;
    opens phuc.work.curriculumvitaebuilder.utilities to java.base, java.compiler;
    exports phuc.work.curriculumvitaebuilder;
    exports phuc.work.curriculumvitaebuilder.controller;
}