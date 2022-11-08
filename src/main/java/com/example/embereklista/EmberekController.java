package com.example.embereklista;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class EmberekController {
    @FXML
    private TableView<Ember> emberek;
    @FXML
    private TableColumn<Ember, String> nevOszlop;
    @FXML
    private TableColumn<Ember, Integer> korOszlop;
    @FXML
    private TextField nevMezo;
    @FXML
    private Spinner<Integer> korMezo;

    @FXML
    private void initialize() {
        nevOszlop.setCellValueFactory(new PropertyValueFactory<>("nev"));
        korOszlop.setCellValueFactory(new PropertyValueFactory<>("eletkor"));
        Ember e1 = new Ember("asdi", 25);
        Ember e2 = new Ember("asdfsdi", 32);
        Ember e3 = new Ember("sdf", 84);
        emberek.getItems().add(e1);
        emberek.getItems().add(e2);
        emberek.getItems().add(e3);
    }

    public void hozzadClick(ActionEvent actionEvent) {
        emberek.getItems().add(new Ember(nevMezo.getText(),korMezo.getValue()));
    }

    public void torolClick(ActionEvent actionEvent) {
        int index = emberek.getSelectionModel().getSelectedIndex();
        if(index == -1){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("A törléshez előbb válasszon ki egy elemet");
            alert.show();
            return;
        }else{
            emberek.getItems().remove(index);
        }
    }
}