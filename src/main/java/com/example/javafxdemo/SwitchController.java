package com.example.javafxdemo;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SwitchController {

    public void goSecondScene(ActionEvent event) throws IOException {

        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();

        switchScene("secondScene.fxml","application.css");
    }

    public void goFirstScene(ActionEvent event) throws IOException{

        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();

        switchScene("firstScene.fxml","application.css");
    }

    public void close(ActionEvent event){

        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    protected void switchScene(String fxml,String css) throws IOException {

        Stage stage = new Stage();

        Parent root = FXMLLoader.load(getClass().getResource(fxml));

        Scene scene = new Scene(root);

        if(css != null)
        scene.getStylesheets().add(getClass().getResource(css).toExternalForm());

        stage.setScene(scene);
        stage.show();

    }
}
