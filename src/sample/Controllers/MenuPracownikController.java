package sample.Controllers;

import com.mysql.cj.jdbc.MysqlDataSource;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class MenuPracownikController {
    @FXML
    private AnchorPane pracownikPane;

public String model(){
    String model = this.model();
    return model;
}

    public void lol(String marka){
    String x;
    x = marka;
    System.out.println(x);
    }
    public void logOut(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("../Fxml/login.fxml"));
        pracownikPane.getChildren().setAll(pane);
    }

    public void menuPracownik(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("../Fxml/menuPracownik.fxml"));
        pracownikPane.getChildren().setAll(pane);
    }
    public void zarzadzajPojazdami(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("../Fxml/zarzadzajPojazdami.fxml"));
        pracownikPane.getChildren().setAll(pane);
    }
    public void zarzadzajUzytkownikami(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("../Fxml/zarzadzajUzytkownikami.fxml"));
        pracownikPane.getChildren().setAll(pane);
    }
    public void zarzadzajWypozyczeniami(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("../Fxml/zarzadzajWypozyczeniami.fxml"));
        pracownikPane.getChildren().setAll(pane);
    }

    public void historiaWypozyczen(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("../Fxml/historiaWypozyczen.fxml"));
        pracownikPane.getChildren().setAll(pane);
    }
    public void udostepnijPojazd(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("../Fxml/udostepnijPojazd.fxml"));
        pracownikPane.getChildren().setAll(pane);
    }
    public void terminPracownik(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("../Fxml/terminPracownik.fxml"));
        pracownikPane.getChildren().setAll(pane);
    }

    public void mojeWypozyczenia(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("../Fxml/mojeWypozyczenia.fxml"));
        pracownikPane.getChildren().setAll(pane);
    }

    public void DodajPojazd(ActionEvent event) throws IOException {


        MysqlDataSource bd = new MysqlDataSource();
        bd.setDatabaseName("bazabaza");
        bd.setUser("root");

        try (Connection conn = bd.getConnection())
        {
            String InsertQuery = "INSERT INTO samochod VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(InsertQuery);
            stmt.setInt(1, 32432);
            stmt.setString(2, "Fiat");
            stmt.setString(3, "Uno");
            stmt.setString(4, "Hatchback");
            stmt.setString(5, "Benzyna");
            stmt.setInt(6, 100000);
            stmt.setDouble(7,1000.00);
            stmt.executeUpdate();

        }
        catch(Exception e){
            System.out.println(e);
        }

    }

    public void ModyfikujPojazd(ActionEvent event) throws IOException {


        MysqlDataSource bd = new MysqlDataSource();
        bd.setDatabaseName("bazabaza");
        bd.setUser("root");

        try (Connection conn = bd.getConnection())
        {
            String InsertQuery = "INSERT INTO samochod VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(InsertQuery);
            stmt.setInt(1, 2);
            stmt.setString(2, "Fiat");
            stmt.setString(3, "Uno");
            stmt.setString(4, "Hatchback");
            stmt.setString(5, "Benzyna");
            stmt.setInt(6, 100000);
            stmt.setDouble(7,1000.00);
            stmt.executeUpdate();

        }
        catch(Exception e){
            System.out.println(e);
        }

    }
    public void UsunPojazd(ActionEvent event) throws IOException {


        MysqlDataSource bd = new MysqlDataSource();
        bd.setDatabaseName("bazabaza");
        bd.setUser("root");

        try (Connection conn = bd.getConnection())
        {
            String InsertQuery = "DELETE FROM `samochod` WHERE id=``";
            PreparedStatement stmt = conn.prepareStatement(InsertQuery);
            stmt.executeUpdate();

        }
        catch(Exception e){
            System.out.println(e);
        }

    }
    public void dodajUzytkownika(ActionEvent event) throws IOException {


        MysqlDataSource bd = new MysqlDataSource();
        bd.setDatabaseName("bazabaza");
        bd.setUser("root");

        try (Connection conn = bd.getConnection())
        {
            String InsertQuery = "INSERT INTO samochod VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(InsertQuery);
            stmt.setInt(1, 2);
            stmt.setInt(2, 2);
            stmt.setString(3, "User123");
            stmt.setString(4, "Haslo123");
            stmt.setString(5, "imie");
            stmt.setString(6, "nazwisko");
            stmt.setFloat(7, 1234567890);
            stmt.executeUpdate();

        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public void modyfikujUzytkownika(ActionEvent event) throws IOException {


        MysqlDataSource bd = new MysqlDataSource();
        bd.setDatabaseName("bazabaza");
        bd.setUser("root");

        try (Connection conn = bd.getConnection())
        {
            String InsertQuery = "INSERT INTO samochod VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(InsertQuery);
            stmt.setInt(1, 2);
            stmt.setInt(2, 2);
            stmt.setString(3, "User123");
            stmt.setString(4, "Haslo123");
            stmt.setString(5, "imie");
            stmt.setString(6, "nazwisko");
            stmt.setFloat(7, 1234567890);
            stmt.executeUpdate();

        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public void UsunUzytkownika(ActionEvent event) throws IOException {


        MysqlDataSource bd = new MysqlDataSource();
        bd.setDatabaseName("bazabaza");
        bd.setUser("root");

        try (Connection conn = bd.getConnection())
        {
            String InsertQuery = "DELETE FROM `pracownik` WHERE id=``";
            PreparedStatement stmt = conn.prepareStatement(InsertQuery);
            stmt.executeUpdate();

        }
        catch(Exception e){
            System.out.println(e);
        }

    }
    public void dodajWypozyczenie(ActionEvent event) throws IOException {


        MysqlDataSource bd = new MysqlDataSource();
        bd.setDatabaseName("bazabaza");
        bd.setUser("root");

        try (Connection conn = bd.getConnection())
        {
            String InsertQuery = "INSERT INTO `wypozyczenie` VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(InsertQuery);
            stmt.setInt(1, 1);
            stmt.setInt(2, 1);
            stmt.setInt(3, 1);
            stmt.setInt(4, 1);
            stmt.setString(5, "2019-04-15");
            stmt.setString(5, "2019-04-17");
            stmt.executeUpdate();

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public void modyfikujWypozyczenie(ActionEvent event) throws IOException {


        MysqlDataSource bd = new MysqlDataSource();
        bd.setDatabaseName("bazabaza");
        bd.setUser("root");

        try (Connection conn = bd.getConnection())
        {
            String InsertQuery = "INSERT INTO `wypozyczenie` VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(InsertQuery);
            stmt.setInt(1, 1);
            stmt.setInt(2, 1);
            stmt.setInt(3, 1);
            stmt.setInt(4, 1);
            stmt.setString(5, "2019-04-15");
            stmt.setString(5, "2019-04-17");
            stmt.executeUpdate();

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public void UsunWypozyczenie(ActionEvent event) throws IOException {


        MysqlDataSource bd = new MysqlDataSource();
        bd.setDatabaseName("bazabaza");
        bd.setUser("root");

        try (Connection conn = bd.getConnection())
        {
            String InsertQuery = "DELETE FROM `wypozyczenie` WHERE id=``";
            PreparedStatement stmt = conn.prepareStatement(InsertQuery);
            stmt.executeUpdate();

        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
