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
public class ModelKlinik 
{
    private int id;
    private String klinik_adi;
    private int kapasite;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKlinik_adi() {
        return klinik_adi;
    }

    public void setKlinik_adi(String klinik_adi) {
        this.klinik_adi = klinik_adi;
    }

    public int getKapasite() {
        return kapasite;
    }

    public void setKapasite(int kapasite) {
        this.kapasite = kapasite;
    }
}
