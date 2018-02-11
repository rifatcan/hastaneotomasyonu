/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modeller;

/**
 *
 * @author rbarka
 */
public class ModelIlac 
{
    private int id;
    private String ilac_adi;
    private String doz;
    private String kullanim_sekli;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIlac_adi() {
        return ilac_adi;
    }

    public void setIlac_adi(String ilac_adi) {
        this.ilac_adi = ilac_adi;
    }

    public String getDoz() {
        return doz;
    }

    public void setDoz(String doz) {
        this.doz = doz;
    }

    public String getKullanim_sekli() {
        return kullanim_sekli;
    }

    public void setKullanim_sekli(String kullanim_sekli) {
        this.kullanim_sekli = kullanim_sekli;
    }
}
