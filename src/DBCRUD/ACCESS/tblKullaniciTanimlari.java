/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBCRUD.ACCESS;

import DBBaglantilari.allConnections;
import DBFramework.ICRUD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rbarka
 */
public class tblKullaniciTanimlari implements ICRUD{
    allConnections baglanti = new allConnections();
    @Override
    public void Kaydet(Object o) {
        try {
            PreparedStatement  ifade = baglanti.baglan().prepareCall("insert into tblkullanici_tanimlari(id,adi,soyadi,kullanici_adi,sifre,aktif,tarih) values('3','Atila','GÜNEŞ','atila',123,'E','20180207')");
            ifade.executeUpdate();
             
       
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(tblkangrubu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(tblkangrubu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Duzenle(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Sil(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> Listele() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object Bul(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
        tblKullaniciTanimlari kullanici = new tblKullaniciTanimlari();
        kullanici.Kaydet("");
    }
    
}
