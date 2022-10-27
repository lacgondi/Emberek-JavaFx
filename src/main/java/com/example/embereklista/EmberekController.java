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
    private Spinner kor = new Spinner<Integer>();

    @FXML
    private TextField nev;

    @FXML
    private void initialize() {
        var factory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100, 15);
        factory.setWrapAround(true);
        kor.setValueFactory(factory);
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
        Ember e = new Ember(nev.getText(),(int)kor.getValue());
    }
}