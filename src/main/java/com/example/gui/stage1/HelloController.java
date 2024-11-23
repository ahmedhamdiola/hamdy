package com.example.gui.stage1;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

// Line 8 ...  fx:controller="com.example.gui.stage1.HelloController"
public class HelloController implements Initializable {

    @FXML
    double progress = 0.0;

    @FXML
    private ProgressBar progressBar;

    @FXML
    ImageView image;

    @FXML
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(0.01), e -> {

            progress += 0.004;
            progressBar.setProgress(progress);
        }));

        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();

    }
}