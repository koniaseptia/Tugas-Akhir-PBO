/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir;

import java.awt.Component;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Konia Septia
 */
public class LoginController implements Initializable {

    @FXML
    private Button buttonlogin;
    @FXML
    private TextField username;
    @FXML
    private TextField password;
    @FXML
    private TextField username1;
    @FXML
    private TextField password1;
    @FXML
    private Button buttondaftar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
    @FXML
    public void login(ActionEvent event) throws IOException, SQLException {
        Connection connection;
        PreparedStatement ps;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tugasakhir?zeroDateTimeBehavior=convertToNull", "root","");
            ps = connection.prepareStatement("SELECT * FROM `login` WHERE username=? AND password =?");
            ps.setString(1,username.getText());
            ps.setString(2,password.getText());
            ResultSet result = ps.executeQuery();
            if(result.next()){
                Component rootPane = null;
                javax.swing.JOptionPane.showMessageDialog(rootPane, "Benar!");
          
        
        
        ((Node)(event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Awal.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 585, 350);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("BookStore");
            stage.show();
       } else{
              Component rootPane = null;
              javax.swing.JOptionPane.showMessageDialog(rootPane, "Salah!");  
              password.setText("");
              username.requestFocus();
            }
    } catch(java.sql.SQLException ex){
            Component rootPane = null;
         javax.swing.JOptionPane.showMessageDialog(rootPane, "Gagal!"); 
         System.out.println(ex.getMessage());
    }
        
        
    }

    
    @FXML
    public void daftar(ActionEvent event) throws IOException, SQLException {
        String user = username1.getText();
        String p = password1.getText();
        
        try{
            try(Statement statement = (Statement) login_koneksi.GetConnection().createStatement()){
                statement.executeUpdate("INSERT INTO login VALUES ('"+user+"', '"+p+"')");
            }
           JOptionPane.showMessageDialog(null, "Sukses Mendaftar, Silahkan Login");
           username1.clear();
           password1.clear();   
        }catch (java.sql.SQLException ex){
            JOptionPane.showMessageDialog(null, "Silahkan Coba Lagi");
            System.out.println(ex.getMessage());
        }
        
    }
    
}
