/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBCRUD.Oracle;

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
public class tblHastaKayit implements ICRUD{
    allConnections baglanti = new allConnections();
    
    @Override
    public void Kaydet(Object o) {
        try {
            PreparedStatement  ifade = baglanti.baglan().prepareCall("insert into tblhasta_kayit(id,tckimlik,adi,soyadi,cinsiyeti,dogum_tarihi,kan_grubu,telefon,adres,hasta_turu,guvenlik_kurumu,anne_adi,baba_adi,doktor,poliklinik,muracaat_tarihi) values('2','36589565452','Rıfatcan','BARKA','Erkek','11.06.1989','A Rh Pozitif (+)','5462691868','Asım','Çalışan','SSK','Nevin','Dursun','Atila GÜNEŞ','Cildiye','07.02.2018')");
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
        tblHastaKayit hastakayit = new tblHastaKayit();
        hastakayit.Kaydet("");
    }
}
