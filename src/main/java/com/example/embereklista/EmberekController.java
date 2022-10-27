package com.example.embereklista;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class EmberekController {
    @FXML
    private ListView emberek;

    @FXML
    private void initialize(){
        Ember e1 = new Ember("asdi", 25);
        Ember e2 = new Ember("asdfsdi", 32);
        Ember e3 = new Ember("sdf", 84);
        emberek.getItems().add(e1);
        emberek.getItems().add(e2);
        emberek.getItems().add(e3);
    }
}