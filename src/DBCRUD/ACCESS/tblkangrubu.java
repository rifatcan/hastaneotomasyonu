/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBCRUD.ACCESS;

import DBBaglantilari.allConnections;
import DBFramework.ICRUD;
import Formlar.frmKanGrubu;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rbarka
 */
public class tblkangrubu implements ICRUD {
    allConnections baglanti = new allConnections();
    
    @Override
    public void Kaydet (Object o)
    {
        Modeller.ModelKangrubu kangrubu;
        kangrubu = (Modeller.ModelKangrubu) o ;
         try {
            PreparedStatement  ifade = baglanti.baglan().prepareCall("insert into tblkangrubu_tanimlari(kan_grubu) values(?)");
            ifade.setString(1, kangrubu.getKan_grubu());
            ifade.executeUpdate();
             
       
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(tblkangrubu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(tblkangrubu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void Duzenle(Object o) {
        Modeller.ModelKangrubu kangrubu;
        kangrubu = (Modeller.ModelKangrubu) o ;
        try {
            PreparedStatement  ifade = baglanti.baglan().prepareCall("update tblkangrubu_tanimlari set kan_grubu where id = ?");
            ifade.setString(1, kangrubu.getKan_grubu());
            ifade.executeUpdate();
             
       
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(tblkangrubu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(tblkangrubu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Sil(long id) {
        Modeller.ModelKangrubu kangrubu;
        try {
            PreparedStatement  ifade = baglanti.baglan().prepareCall("delete from tblkangrubu_tanimlari where id = ?");
            ifade.setInt(1, (int)id);
            ifade.executeUpdate();
             
       
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(tblkangrubu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(tblkangrubu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Object> Listele() {
        frmKanGrubu model = new frmKanGrubu();
        ArrayList<Object> kangrubulistesi= new ArrayList<>();
        ResultSet rs;
          Modeller.ModelKangrubu item;
        try {
             PreparedStatement  ifade = baglanti.baglan().prepareCall("select * from tblkangrubu_tanimlari");
             rs= ifade.executeQuery();
             while(rs.next()){
             item = new Modeller.ModelKangrubu();
             item.setId(rs.getInt("id"));
             item.setKan_grubu(rs.getString("kan_grubu"));
             kangrubulistesi.add(item);
             }
             
       
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(tblTaniTanimlari.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(tblTaniTanimlari.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return kangrubulistesi;  
    }

    @Override
    public Object Bul(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    public static void main(String[] args) 
    {
        tblkangrubu kan = new tblkangrubu();
        
        //kan.Kaydet("");
        kan.Listele();
        
         for (Object item : kan.Listele()) 
         {
            
            System.out.println("id..........:"+((Modeller.ModelKangrubu)item).getId());
            System.out.println("tckimlik....:"+((Modeller.ModelKangrubu)item).getKan_grubu());
            System.out.println("--------------------------------------------");
         }
    }
}
