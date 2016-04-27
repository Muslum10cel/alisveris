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

    public Sepet(String urun_adi, double fiyat) {
        this.urun_adi = urun_adi;
        this.fiyat = fiyat;
    }

    public double getFiyat() {
        return fiyat;
    }

    public String getUrun_adi() {
        return urun_adi;
    }

}
