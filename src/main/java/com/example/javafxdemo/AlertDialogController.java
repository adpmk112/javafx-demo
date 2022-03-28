package com.example.javafxdemo;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

public class AlertDialogController {

    public void onYesBtnClicked(ActionEvent event){
        Platform.exit();
    }

    public void onNoBtnClicked(ActionEvent event){
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }
}
