/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Konia Septia
 */
public class NotaController implements Initializable {

    @FXML
    private JFXTextField datanama;
    @FXML
    private JFXTextField datatelp;
    @FXML
    private JFXTextField dataalamat;
    @FXML
    private JFXTextField datatanggal;
    @FXML
    private JFXTextField datakode;
    @FXML
    private JFXTextField datakategori;
    @FXML
    private JFXTextField datajudul;
    @FXML
    private JFXTextField dataharga;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    void setnota(String Nama, String Telp, String Alamat, String Tanggal, String Kode, String Kategori, String Judul, String Harga){
        datanama.setText(Nama);
        datatelp.setText(Telp);
        dataalamat.setText(Alamat);
           datatanggal.setText(Tanggal);
              datakode.setText(Kode);
                 datakategori.setText(Kategori);
                    datajudul.setText(Judul);
                       dataharga.setText(Harga);
        
       
    }
    
}
