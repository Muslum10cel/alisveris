/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bahar.alisveris;

/**
 *
 * @author muslumoncel
 */
public class Sepet {

    private final String urun_adi;
    private final double fiyat;
    private final int miktar;

    public Sepet(String urun_adi, double fiyat, int miktar) {
        this.urun_adi = urun_adi;
        this.fiyat = fiyat;
        this.miktar = miktar;
    }

    public double getFiyat() {
        return fiyat;
    }

    public String getUrun_adi() {
        return urun_adi;
    }

    public int getMiktar() {
        return miktar;
    }

    @Override
    public String toString() {
        return " Ürün Adı : " + urun_adi
                + "\n Ürün Miktarı :" + miktar
                + "\n Ödenecek Tutar : " + fiyat + " ₺\n"; //To change body of generated methods, choose Tools | Templates.
    }
}
