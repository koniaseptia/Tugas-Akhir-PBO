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
public class Novel1Controller implements Initializable {

    @FXML
    private Button buttonn1;
    @FXML
    private Button buttonn2;
    @FXML
    private Button buttonn3;
    @FXML
    private Button buttonn4;
    @FXML
    private Button buttonn5;
    @FXML
    private Button buttonn6;
    @FXML
    private JFXButton buttonbalikn1;
    @FXML
    private JFXButton butttombalikn2;
    @FXML
    private JFXButton buttonbackn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void n1(ActionEvent event) throws IOException {
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
    private void n2(ActionEvent event) throws IOException {
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
    private void n3(ActionEvent event) throws IOException {
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
    private void n4(ActionEvent event) throws IOException {
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
    private void n5(ActionEvent event) throws IOException {
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
    private void n6(ActionEvent event) throws IOException {
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
    private void prosesbalikn1(ActionEvent event) throws IOException {
        ((Node)(event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Novel1.fxml"));
            Scene scene = new Scene (fxmlLoader.load(), 820, 900);
            
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Book Store");
            stage.show();
    }

    @FXML
    private void prosesbalikn2(ActionEvent event) throws IOException {
        ((Node)(event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Ke2Novel.fxml"));
            Scene scene = new Scene (fxmlLoader.load(), 820, 900);
            
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Book Store");
            stage.show();
    }

    @FXML
    private void prosesbackn(ActionEvent event) throws IOException {
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
