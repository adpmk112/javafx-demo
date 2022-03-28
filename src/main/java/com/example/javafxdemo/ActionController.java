package com.example.javafxdemo;

import javafx.fxml.FXML;
import javafx.scene.input.InputEvent;

public class ActionController {

    @FXML
    public void onMouseClick(InputEvent mouseEvent){
        System.out.println("Mouse is clicking");
    }

    @FXML
    public void onKeyboardAction(InputEvent keyboardEvent){
        System.out.println("Using keyboard");
    }
}
