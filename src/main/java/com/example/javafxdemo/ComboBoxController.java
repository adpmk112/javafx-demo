package com.example.javafxdemo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class ComboBoxController implements Initializable {

    @FXML
    private TextField input;
    @FXML
    private ComboBox<String> comboBox;
    @FXML
    private Label label;

    private final ObservableList<String> laptops = FXCollections.observableArrayList("Dell", "Lenovo", "Acer");

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        comboBox.setItems(laptops);
    }

    public void onComboBoxChange() {
        if (comboBox.getValue() == null) return;
        System.out.println(comboBox.getValue());
    }

    public void onAddBtnClick() {
        if (input.getText().isEmpty()) return;
        comboBox.getItems().add(input.getText());
        input.setText("");
    }

    public void onDelBtnClick() {
        //   if(comboBox.getValue()==null) return;
        //   comboBox.getItems().remove(comboBox.getValue());

        if (input.getText().isEmpty()) return;
        for (String out : comboBox.getItems()) {
            String inputData = input.getText();
            if (Objects.equals(out, inputData)) {
                comboBox.getItems().remove(input.getText());
                input.setText("");
                break;
            }
        }
    }
}