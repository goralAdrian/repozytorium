package sample.Controllers;

import com.mysql.cj.jdbc.MysqlDataSource;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.sql.*;

public class zarzadzajPojazdamiController {
    @FXML
    private AnchorPane pracownikPane;
    private AnchorPane zarzadzajPojazdamiPane;


    public void logOut(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("../Fxml/login.fxml"));
        pracownikPane.getChildren().setAll(pane);
    }

    public String model(String model){
        String MODEL = model;
        return MODEL;
    }
    public void menuPracownik(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("../Fxml/menuPracownik.fxml"));
        pracownikPane.getChildren().setAll(pane);
    }

    public void lol(ActionEvent event) throws IOException{
        System.out.println();

    }



}
