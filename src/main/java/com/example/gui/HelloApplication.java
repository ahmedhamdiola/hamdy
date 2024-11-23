package com.example.gui;

import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Loading.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 700);
        String css = Objects.requireNonNull(this.getClass().getResource("css.css")).toExternalForm();
        scene.getStylesheets().add(css);

        FXMLLoader login = new FXMLLoader(HelloApplication.class.getResource("LogIn.fxml"));
        Scene scene1 = new Scene(login.load(), 700, 700);
        scene1.getStylesheets().add(css);




        stage.setTitle("Los Galacticos");
        stage.setScene(scene);
        stage.show();

        PauseTransition delay = new PauseTransition(Duration.seconds(3));
        delay.setOnFinished(event -> stage.setScene(scene1));
        delay.play();


    }



    public static void main(String[] args) {
        launch();
    }
}