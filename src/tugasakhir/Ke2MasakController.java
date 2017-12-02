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
public class Ke2MasakController implements Initializable {

    @FXML
    private Button buttonm7;
    @FXML
    private Button buttonm8;
    @FXML
    private Button buttonm9;
    @FXML
    private Button buttonm10;
    @FXML
    private Button buttonm11;
    @FXML
    private Button buttonm12;
    @FXML
    private JFXButton buttonm1;
    @FXML
    private JFXButton buttonm2;
    @FXML
    private JFXButton buttonkembalim;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void m7(ActionEvent event) throws IOException {
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
    private void m8(ActionEvent event) throws IOException {
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
    private void m9(ActionEvent event) throws IOException {
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
    private void m10(ActionEvent event) throws IOException {
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
    private void m11(ActionEvent event) throws IOException {
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
    private void m12(ActionEvent event) throws IOException {
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
    private void backm1(ActionEvent event) throws IOException {
        ((Node)(event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Masak1.fxml"));
            Scene scene = new Scene (fxmlLoader.load(), 820, 900);
            
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Book Store");
            stage.show();
    }

    @FXML
    private void backm2(ActionEvent event) throws IOException {
        ((Node)(event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Ke2Masak.fxml"));
            Scene scene = new Scene (fxmlLoader.load(), 820, 900);
            
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Book Store");
            stage.show();
    }

    @FXML
    private void kembalim(ActionEvent event) throws IOException {
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
