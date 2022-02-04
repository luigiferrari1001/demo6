package com.gmail.lestopasso.demo6;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private ImageView view;

    @FXML
    public void initialize(){
        view.setImage(
                new Image("Cars-Luigi.jpg")
        );
    }
}