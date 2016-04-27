/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bahar.alisveris;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author muslumoncel
 */
public class MainClass {

    static final List<TuketiciUrunleri> urunler = new ArrayList<>();
    static final List<Sepet> sepet = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    static Scanner klavye = new Scanner(System.in).useDelimiter("(\\b|\\B)");

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Lütfen işleminizi seçiniz : \n"
                    + " 1 ---> Ürün Ekleme \n" + " 2 ---> Alışveriş \n" + " 3 ---> Çıkış");
            int istek = scanner.nextInt();
            switch (istek) {
                case 1:
                    System.out.print("Ürün ismini giriniz : ");
                    String urun_adi = klavye.nextLine();
                    System.out.print("Ürün sınıfını giriniz : ");
                    String urun_sinifi = klavye.nextLine();
                    System.out.print("Ürünün alış fiyatını giriniz : ");
                    double alis_fiyati = scanner.nextDouble();
                    System.out.print("Ürün miktarını giriniz : ");
                    int miktar = scanner.nextInt();
                    double kdvOrani = KDVHesapla(urun_sinifi, alis_fiyati);
                    double kdvliSatis = KDVliSatisHesapla(alis_fiyati, kdvOrani);
                    if (urunler.add(new TuketiciUrunleri(urun_adi, urun_sinifi, miktar, alis_fiyati, kdvOrani, kdvliSatis))) {
                        System.out.println("Ürün başarıyla eklendi.");
                    }
                    UrunListesi();
                    break;
                case 2:
                    break;
                default:

            }
        }
    }

    /**
     * Bu method sisteme eklenmek istenen ürünün kdv miktarını hesaplamaktadır.
     * <p>
     * Kdv miktarı hesaplanırken kullanılan oranlar :
     *
     * <ul>
     * <li> Temel Gıda için %8
     *
     * <li> Temizlik Ürünleri için %18
     *
     * <li> Tekstil Ürünleri için %18
     *
     * <li> Kırtasiye Ürünleri için %5
     *
     * <li> Diğer Ürünler için %1
     * </ul>
     *
     * @param sinif Kdv oranı hesaplanacak ürünün sınıfı
     * @param fiy Kdv oranı hesaplanacak ürünün alış fiyatı
     * @return kdv oranı
     */
    public static double KDVHesapla(String sinif, double fiy) {
        double sonuc = 0;
        switch (sinif) {
            case "Temel Gıda":
                sonuc = fiy * (0.08);
                break;
            case "Temizlik Ürünleri":
                sonuc = fiy * (0.18);
                break;
            case "Tekstil Ürünleri":
                sonuc = fiy * (0.18);
                break;
            case "Kırtasiye Ürünleri":
                sonuc = fiy * (0.05);
                break;
            case "Diğer Ürünler":
                sonuc = fiy * (0.01);
        }
        return sonuc;
    }

    /**
     * Bu metod sisteme kaydedilecek olan ürünün KDV'li satış miktarını
     * hesaplamaktadır.
     *
     * @param fiy KDV'li satış miktarı hesaplanacak olan ürünün alış fiyatı
     * @param kdv KDVHesapla metodundan alınan KDV miktarı
     * @return
     * @see KDVHesapla
     */
    public static double KDVliSatisHesapla(double fiy, double kdv) {
        return fiy + kdv;
    }

    /**
     * Bu metod sisteme kaydettiğimiz ürünleri listelemektedir.
     */
    public static void UrunListesi() {
        System.out.println("*************** Urun Listesi ***************");
        urunler.stream().forEach((urun) -> {
            System.out.println(urun.toString());
        });
    }

}
