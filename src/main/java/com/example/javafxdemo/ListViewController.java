package com.example.javafxdemo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ListViewController implements Initializable {
    @FXML
    private ListView<String> listView;
    @FXML
    private TextField textField;

    private final ObservableList<String> laptops = FXCollections.observableArrayList("Dell","Lenovo","Acer");
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listView.setItems(laptops);
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }

    public void addBtn(){
        if(textField.getText().isEmpty()) return;
        listView.getItems().add(textField.getText());
        textField.setText("");
    }

    public void deleteBtn(){
        //String data = listView.getSelectionModel().getSelectedItem();
        //listView.getItems().remove(data);
        ObservableList<String> items = listView.getSelectionModel().getSelectedItems();
        List<String> data = new ArrayList<>();

        for(String out:items){
            data.add(out);
        }

        for(String out:data){
            listView.getItems().remove(out);
        }
    }
}
