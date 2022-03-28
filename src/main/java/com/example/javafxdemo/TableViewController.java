package com.example.javafxdemo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class TableViewController implements Initializable {

    @FXML
    private TableView<Person> personTable;

    @FXML
    private TableColumn<Person,Long> id;

    @FXML
    private TableColumn<Person, String> firstName;

    @FXML
    private TableColumn<Person, String> lastName;

    @FXML
    private TableColumn<Person, Integer> age;

    private final ObservableList<Person> people = FXCollections.observableArrayList(
            new Person(1L,"Saotome","Mary",19),
            new Person(2L,"Jabami","Yumeko",20),
            new Person(3L,"Minasae","Inori",26),
            new Person(4L,"Ayane","Sakura",28)
    );

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        id.setCellValueFactory(new PropertyValueFactory<Person,Long>("id"));
        firstName.setCellValueFactory(new PropertyValueFactory<Person,String>("firstName"));
        lastName.setCellValueFactory(new PropertyValueFactory<Person,String>("lastName"));
        age.setCellValueFactory(new PropertyValueFactory<Person,Integer>("age"));

        personTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        personTable.setItems(people);
        //personTable.setPlaceholder(new Label("No person to show!"));
    }

    public void onDelete(){
        ObservableList<Person>people = personTable.getSelectionModel().getSelectedItems();
        if(people.size()==0) return;
        List<Person> data = new ArrayList<>();
        for(Person out: people){
            data.add(out);
        }

        for(Person out:data){
            personTable.getItems().remove(out);
        }
    }
}
