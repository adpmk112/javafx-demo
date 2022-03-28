package com.example.javafxdemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private Label result;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    public void showLabel(ActionEvent event){
        if(username.getText().isEmpty()&&password.getText().isEmpty()){
            result.setText("Please enter both field");
        }
        else if(username.getText().isEmpty()){
            result.setText("Please enter username");
        }
        else if(password.getText().isEmpty()){
            result.setText("Please enter password");
        }
        else{
            if(username.getText().equals("ayaneru")&&password.getText().equals("zxcv1234")){
                SwitchController switchController = new SwitchController();
                try {
                    Node source = (Node) event.getSource();
                    Stage stage = (Stage) source.getScene().getWindow();
                    stage.close();
                    switchController.switchScene("calculator.fxml", null);
                }
                catch (IOException exception){
                    exception.printStackTrace();
                }
            }
            else{
                result.setText("Login Fail");
            }
        }
    }

}
