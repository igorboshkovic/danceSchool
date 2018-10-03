/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import baza.DBConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import osnovneklase.Grupa;
import osnovneklase.Instruktor;
import osnovneklase.Kurs;

/**
 * FXML Controller class
 *
 * @author Igor
 */
public class ClanFormaController implements Initializable {
    @FXML
    private TextField imeIPrezime; 
    @FXML
    private DatePicker datumDolaska; 
    @FXML
    private ComboBox<Grupa> grupa; 
    @FXML
    private TextField brojTelefona; 
    @FXML
    private TextField eMail; 
    @FXML
    private TextField facebook; 
    @FXML
    private Button dodaj;
    
    private DBConnection dc;
    private ObservableList<Grupa> data;
    private String sql = "SELECT * FROM grupa";
    private String sqlInstruktor = "SELECT id,imeIPrezime FROM instruktor WHERE id = ?";
    // Potrebno je povuci sve grupe iz baze i napuniti comboBox sa ObservableList<Grupa>
    // Grupu napuniti na osnovu vrijednosti u tabeli tako sto primitivne promjenljive
    // dobijaju vrijednost iz kolone direktno, objekti(instruktori) na osnovu id-a se
    // povlace iz odgovarajuce tabele, a enumeracije(Kurs) upotrebom metode valueOf() nad
    // odgovarajucom kolonom.
    private Instruktor getInstruktorById(int id)throws SQLException{
        Connection conn = DBConnection.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sqlInstruktor);
            
        stmt.setInt(1, id);
        
        ResultSet rs = stmt.executeQuery();
        Instruktor ins = null;
        while(rs.next()){
           ins = new Instruktor(rs.getInt(1), rs.getString(2));
        }
        
        return ins;
    }

    private void ucitajGrupe() throws SQLException{
        Connection conn = DBConnection.getConnection();
        this.data = FXCollections.observableArrayList();
        
        ResultSet rs = conn.createStatement().executeQuery(sql);
        while(rs.next()){
            this.data.add(new Grupa(rs.getInt(1), rs.getString(2),Kurs.valueOf(rs.getString("tip")), getInstruktorById(rs.getInt(4)), getInstruktorById(rs.getInt(5)), rs.getString(6)));
        }
        
        
    }  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            this.dc = new DBConnection();
            ucitajGrupe();
            grupa.getItems().addAll(this.data);
        } catch (SQLException ex) {
            Logger.getLogger(ClanFormaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }    
    
}
