package questions;

import java.util.Scanner;

public class Q02_DailyProfit {
    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan aşağıysa o günleri return yap.
     * */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] gunler = {"Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar"};

        double[] gunlukKazanclar = new double[gunler.length];

        int i = 0;
        while (i<7){
            System.out.println("Lütfen " + (i+1) + ". günün kazancını giriniz.");
            double kazanc = input.nextDouble();
            gunlukKazanclar[i] =  kazanc;
            i++;
        }

        double ortalamaKazanc = GetOrtalamaKazanc(gunlukKazanclar);
        System.out.println("Ortalama Kazanç = " + ortalamaKazanc);

        System.out.print("Ortalamanın üstünde kazanç günleri: ");
        GetOrtalamaninUstundeKazancGunleri(ortalamaKazanc, gunlukKazanclar, gunler);

        System.out.print("Ortalamanın altında kazanç günleri: ");
        GetOrtalamaninAltindaKazancGunleri(ortalamaKazanc, gunlukKazanclar, gunler);


    }

    public static void GetOrtalamaninAltindaKazancGunleri(double ortalamaKazanc, double[] gunlukKazanclar, String[] gunler) {
        int idx = 0;

        for (double w : gunlukKazanclar){

            if (w < ortalamaKazanc){
                System.out.print(gunler[idx] + " ");

            }
            idx++;
        }
        System.out.println();

    }

    public static void GetOrtalamaninUstundeKazancGunleri(double ortalamaKazanc, double[] gunlukKazanclar, String[] gunler) {
        int idx = 0;

        for (double w : gunlukKazanclar){

            if (w > ortalamaKazanc){
                System.out.print(gunler[idx] + " ");
            }
            idx++;
        }
        System.out.println();


    }

    public static double GetOrtalamaKazanc(double[] gunlukKazanclar ) {
        double ortalama = 0;
        for (double w : gunlukKazanclar){
            ortalama = ortalama + w;

        }
        return ortalama/7;
    }
}
