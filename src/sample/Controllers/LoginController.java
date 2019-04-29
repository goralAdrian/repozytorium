package sample.Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.sql.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

public class LoginController implements Initializable {

    @FXML
    private AnchorPane rootPane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void loadMenuAdmin(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("../Fxml/menuAdmin.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void loadMenuPracownik(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("../Fxml/menuPracownik.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void loadMenuKlient(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("../Fxml/menuKlient.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void printHello(ActionEvent event){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/bazabaza", "root", "");
            PreparedStatement stmt = con.prepareStatement("INSERT INTO klient VALUES(?,?,?,?,?,?,?,?)");
            stmt.setInt(1,1);
            stmt.setString(2,"adik");
            stmt.setString(3,"adik");
            stmt.setString(4,"Jan");
            stmt.setString(5,"Kowalski");
            stmt.setString(6,"01.01.1999");
            stmt.setString(7,"Sanok");
            stmt.setFloat(8,12345678912F);
            stmt.executeUpdate();
            PreparedStatement stmt2 = con.prepareStatement("INSERT INTO pracownik VALUES(?,?,?,?,?,?,?)");
            stmt2.setInt(1,1);
            stmt2.setInt(2,1);
            stmt2.setString(3,"adik");
            stmt2.setString(4,"adik");
            stmt2.setString(5,"Jan");
            stmt2.setString(6,"Kowalski");
            stmt2.setFloat(7, 12345678912F);
            stmt2.executeUpdate();
            ResultSet rs = stmt2.executeQuery("select * from administrator");
            while(rs.next())
            {
                System.out.println("Pomyslnie dodano rekordy");
            }
        }catch(Exception e){System.out.println(e);}
    }
}
