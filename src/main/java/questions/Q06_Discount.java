package questions;

import java.util.Scanner;

public class Q06_Discount {
     /*
        TASK:
       * Kullanıcıdan  ürün adedini ve liste fiyatını alın ve kullanıcıya müşteri kartı olup olmadığını sorun.

       * Müşteri kartı varsa ve 10 üründen fazla alırsa %20,
       10 üründen az alırsa %15 indirim yapın.

       * Müşteri kartı yoksa ve 10 üründen fazla alırsa %15,
       10 üründen az alırsa %10 indirim yapan bir code yazınız.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kaç ürün aldığınızı yazınız.");
        int urunAdedi = input.nextInt();

        System.out.println("Lütfen ürününüzün fiyatınız yazınız.");
        double fiyat = input.nextDouble();

        System.out.println("Müşteri kartınız var mı? (Evet / Hayır yazınız.)");
        String kart = input.next();


        if (kart.equalsIgnoreCase("evet")){

            if (urunAdedi >= 10){
                double indirimTutari = (urunAdedi*fiyat) * 0.2;
                double odenecekIndirimliTutar = (urunAdedi*fiyat) - indirimTutari;
                System.out.println("Ödenecek tutar: " + odenecekIndirimliTutar);

            }else {
                double indirimTutari = (urunAdedi*fiyat) * 0.15;
                double odenecekIndirimliTutar = (urunAdedi*fiyat) - indirimTutari;
                System.out.println("Ödenecek tutar: " + odenecekIndirimliTutar);
            }


        } else if (kart.equalsIgnoreCase("hayır")) {

            if (urunAdedi >= 10){
                double indirimTutari = (urunAdedi*fiyat) * 0.15;
                double odenecekIndirimliTutar = (urunAdedi*fiyat) - indirimTutari;
                System.out.println("Ödenecek tutar: " + odenecekIndirimliTutar);

            }else {
                double indirimTutari = (urunAdedi*fiyat) * 0.1;
                double odenecekIndirimliTutar = (urunAdedi*fiyat) - indirimTutari;
                System.out.println("Ödenecek tutar: " + odenecekIndirimliTutar);
            }

        } else {
            System.out.println("Hatalı giriş yaptınız.");
        }


    }
}
