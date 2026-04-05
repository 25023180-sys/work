package com.example.project6;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javafx.scene.control.Label;

public class ControllerScene2 {
    private Stage stage;
    private Scene scene;
    @FXML
    Label hello;
    @FXML
    TextField username2;
    public void displayName(String username){
        username2.setText("Hello: "+username);
    }
}
