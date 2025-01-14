package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {

    @FXML
    private Button myButton;

    @FXML
    private Label myLabel;

    @FXML
    private void handleButtonClick() {
        myLabel.setText("Button clicked!");
    }
}
