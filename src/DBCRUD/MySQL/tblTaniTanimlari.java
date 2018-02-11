/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBCRUD.MySQL;

import DBBaglantilari.allConnections;
import DBFramework.ICRUD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rbarka
 */
public class tblTaniTanimlari implements ICRUD {
    allConnections baglanti = new allConnections();

    @Override
    public void Kaydet(Object o) {
        Modeller.ModelTani tani;
        tani = (Modeller.ModelTani) o;
        try {
            PreparedStatement  ifade = baglanti.baglan().prepareCall("insert into tbltani_tanimlari(tani) values(?)");
            ifade.setString(1,tani.getTani());
            ifade.executeUpdate();
             
       
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(tblTaniTanimlari.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(tblTaniTanimlari.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Duzenle(Object o) {
        Modeller.ModelTani tani;
        tani = (Modeller.ModelTani) o;
        try {
            PreparedStatement  ifade = baglanti.baglan().prepareCall("update tbltani_tanimlari set tani = ? where id = ?");
            ifade.setString(1,tani.getTani());
            ifade.executeUpdate();
             
       
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(tblTaniTanimlari.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(tblTaniTanimlari.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Sil(long id) {
         try {
            PreparedStatement  ifade = baglanti.baglan().prepareCall("delete from tbltani_tanimlari where id=?");
            ifade.setInt(1, (int)id);
            ifade.executeUpdate();
             
       
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(tblTaniTanimlari.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(tblTaniTanimlari.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    @Override
    public List<Object> Listele() {
        ArrayList<Object> tanilistesi= new ArrayList<>();
        ResultSet rs;
          Modeller.ModelTani item;
        try {
             PreparedStatement  ifade = baglanti.baglan().prepareCall("select * from tblmusteri");
             rs= ifade.executeQuery();
             while(rs.next()){
             item = new Modeller.ModelTani();
             item.setTani(rs.getString("tani"));
             item.setId(rs.getInt("id"));
             tanilistesi.add(item);
             }
             
       
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(tblTaniTanimlari.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(tblTaniTanimlari.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return tanilistesi;    
    }

    @Override
    public Object Bul(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
        tblTaniTanimlari tani = new tblTaniTanimlari();
        
        tani.Kaydet("");
    }
}
