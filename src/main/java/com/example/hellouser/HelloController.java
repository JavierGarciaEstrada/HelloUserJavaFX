package com.example.hellouser;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField nameField;

    @FXML
    protected void onHelloButtonClick() {
        String name = nameField.getText();
        welcomeText.setText("Hello " + name );
    }
}