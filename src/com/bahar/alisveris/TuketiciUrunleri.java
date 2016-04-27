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
public class TuketiciUrunleri {

    private final String urun_adi, urun_sinifi;
    private int miktar;
    private final double alis_fiyati, KDV, satis_fiyati;

    public TuketiciUrunleri(String urun_adi, String urun_sinifi, int miktar, double alis_fiyati, double KDV, double satis_fiyati) {
        this.urun_adi = urun_adi;
        this.urun_sinifi = urun_sinifi;
        this.miktar = miktar;
        this.alis_fiyati = alis_fiyati;
        this.KDV = KDV;
        this.satis_fiyati = satis_fiyati;
    }

    public double getAlis_fiyati() {
        return alis_fiyati;
    }

    public double getKDV() {
        return KDV;
    }

    public double getSatis_fiyati() {
        return satis_fiyati;
    }

    public int getMiktar() {
        return miktar;
    }

    public String getUrun_adi() {
        return urun_adi;
    }

    public String getUrun_sinifi() {
        return urun_sinifi;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    @Override
    public String toString() {
        return " Ürün Adı : " + urun_adi
                + "\n Ürün Sınıfı : " + urun_sinifi
                + "\n Ürün Miktarı :  " + miktar
                + "\n Ürün Alış Fiyatı : " + alis_fiyati + " ₺"
                + "\n Ürün KDV si :  " + KDV
                + "\n Ürün satış fiyatı :  " + satis_fiyati + " ₺ \n";
    }

}
