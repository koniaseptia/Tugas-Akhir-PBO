/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 *
       * @author Konia Septia
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
     private TextField nama;
    @FXML
    private TextField telp;
    @FXML
    private TextField alamat;
    @FXML
    private TextField kode;
    @FXML
    private DatePicker tanggal;
    @FXML
    private TextField judul;
    @FXML
    private TextField harga;
    private TextArea hasil;
    private TextField jumlah;
    @FXML
    private Button buttonsimpan;
    @FXML
    private Button buttonreset;
    @FXML
    private Button buttonkeluar;
    @FXML
    private ChoiceBox kategori;
    @FXML
    private Button buttonkembali;
    
      ObservableList<String> kategoriList = FXCollections.observableArrayList("Novel","Pelajaran","Masakan","Komik");
     
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
  
    String Nama,Telp,Alamat,Tanggal,Kode,Kategori,Judul,Harga;
    
    @Override
  public void initialize(URL url, ResourceBundle rb) {
        kategori.setValue("Pilih Kategori");
        kategori.setItems(kategoriList);
    }    

   void Kirim(){
        //untuk validasi isian
         if(nama.getText().equals("")){
            javax.swing.JOptionPane.showMessageDialog(null, "Harap inputkan nama Anda");
        }else if (telp.getText().equals("")){
            javax.swing.JOptionPane.showMessageDialog(null, "Harap isikan telephone Anda");
        }else if(alamat.getText().equals("")){
            javax.swing.JOptionPane.showMessageDialog(null, "Harap inputkan alamat Anda");
        }else if(tanggal.getValue().equals("")){
            javax.swing.JOptionPane.showMessageDialog(null, "Harap inputkan tanggal pemesanan Anda");
        }else if(kode.getText().equals("")){
            javax.swing.JOptionPane.showMessageDialog(null, "Harap inputkan kode Buku");
        }else if(kategori.getValue().equals("")){
            javax.swing.JOptionPane.showMessageDialog(null, "Harap pilih kategori Buku");
        }else if(judul.getText().equals("")){
            javax.swing.JOptionPane.showMessageDialog(null, "Harap pilih judul Buku");
        }else if(harga.getText().equals("")){
            javax.swing.JOptionPane.showMessageDialog(null, "Harap inputkan harga Buku");
        }
        //untuk pengambilan nilai isian
     Nama = nama.getText();
     Telp = telp.getText();
     Alamat = alamat.getText();
     Tanggal = tanggal.getValue().toString();
     Kode = kode.getText();
     Kategori = kategori.getValue().toString();
     Judul = judul.getText();
     Harga = harga.getText();
        
    }

    @FXML
    private void simpan(ActionEvent event) throws IOException {
        
         Kirim();//akan memanggil menjalankan method Kirim
        try {
            ((Node)(event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Nota.fxml"));
            
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Book Store");
            stage.show();
            
            NotaController Data = new NotaController();
            Data = fxmlLoader.getController();
            
            Data.setnota(Nama, Telp, Alamat, Tanggal, Kode, Kategori, Judul, Harga);
            
        } catch (IOException e) {
            System.out.println("Batal membuat window baru" + e);
        }
        
      
    }

    @FXML
    private void reset(ActionEvent event) {
        nama.setText("");
        telp.setText("");
        alamat.setText("");
        tanggal.setValue(LocalDate.MAX);
        kode.setText("");
        judul.setText("");
        harga.setText("");
        jumlah.setText("");
        kategori.setValue("Pilih Kategori");
       
    }

    @FXML
    private void keluar(ActionEvent event) {
        System.exit(0);
    }


    @FXML
    private void kembali(ActionEvent event) throws IOException {
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
