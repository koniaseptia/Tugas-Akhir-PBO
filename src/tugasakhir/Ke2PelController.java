/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Konia Septia
 */
public class Ke2PelController implements Initializable {

    @FXML
    private Button buttonp7;
    @FXML
    private Button buttonp8;
    @FXML
    private Button buttonp9;
    @FXML
    private Button buttonp10;
    @FXML
    private Button buttonp11;
    @FXML
    private Button buttonp12;
    @FXML
    private JFXButton buttonbalikp1;
    @FXML
    private JFXButton butttombalikp2;
    @FXML
    private JFXButton buttonbackp;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void p7(ActionEvent event) throws IOException {
        ((Node)(event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLDocument.fxml"));
                     Scene scene = new Scene (fxmlLoader.load(), 730, 670);

            
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Book Store");
            stage.show();
    }

    @FXML
    private void p8(ActionEvent event) throws IOException {
        ((Node)(event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLDocument.fxml"));
                     Scene scene = new Scene (fxmlLoader.load(), 730, 670);

            
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Book Store");
            stage.show();
    }

    @FXML
    private void p9(ActionEvent event) throws IOException {
        ((Node)(event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLDocument.fxml"));
                     Scene scene = new Scene (fxmlLoader.load(), 730, 670);

            
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Book Store");
            stage.show();
    }

    @FXML
    private void p10(ActionEvent event) throws IOException {
        ((Node)(event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLDocument.fxml"));
                     Scene scene = new Scene (fxmlLoader.load(), 730, 670);

            
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Book Store");
            stage.show();
    }

    @FXML
    private void p11(ActionEvent event) throws IOException {
        ((Node)(event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLDocument.fxml"));
                     Scene scene = new Scene (fxmlLoader.load(), 730, 670);

            
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Book Store");
            stage.show();
    }

    @FXML
    private void p12(ActionEvent event) throws IOException {
        ((Node)(event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLDocument.fxml"));
                     Scene scene = new Scene (fxmlLoader.load(), 730, 670);

            
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Book Store");
            stage.show();
    }

    @FXML
    private void prosesbalikp1(ActionEvent event) throws IOException {
        ((Node)(event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Pel2.fxml"));
            Scene scene = new Scene (fxmlLoader.load(), 820, 900);
            
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Book Store");
            stage.show();
    }

    @FXML
    private void prosesbalikp2(ActionEvent event) throws IOException {
        ((Node)(event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Ke2Pel.fxml"));
            Scene scene = new Scene (fxmlLoader.load(), 820, 900);
            
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Book Store");
            stage.show();
    }

    @FXML
    private void prosesbackp(ActionEvent event) throws IOException {
        ((Node)(event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Awal.fxml"));
            Scene scene = new Scene (fxmlLoader.load(), 600, 350);
            
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Book Store");
            stage.show();

    }
    
}
