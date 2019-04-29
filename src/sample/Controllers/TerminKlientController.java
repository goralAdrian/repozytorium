package sample.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class TerminKlientController {

    @FXML
    private AnchorPane klientPane;

    public void menuKlient(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("../Fxml/menuKlient.fxml"));
        klientPane.getChildren().setAll(pane);
    }

    public void wypozyczenieKlient(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("../Fxml/wypozyczenieKlient.fxml"));
        klientPane.getChildren().setAll(pane);
    }

}