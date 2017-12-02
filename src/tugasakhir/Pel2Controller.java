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
public class Pel2Controller implements Initializable {

    @FXML
    private Button buttonp1;
    @FXML
    private Button buttonp2;
    @FXML
    private Button buttonp3;
    @FXML
    private Button buttonp4;
    @FXML
    private Button buttonp5;
    @FXML
    private Button buttonp6;
    @FXML
    private JFXButton buttonkembalip;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void p1(ActionEvent event) throws IOException {
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
    private void p2(ActionEvent event) throws IOException {
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
    private void p3(ActionEvent event) throws IOException {
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
    private void p4(ActionEvent event) throws IOException {
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
    private void p5(ActionEvent event) throws IOException {
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
    private void p6(ActionEvent event) throws IOException {
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
    private void backp1(ActionEvent event) throws IOException {
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
    private void backp2(ActionEvent event) throws IOException {
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
    private void kembalip(ActionEvent event) throws IOException {
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
