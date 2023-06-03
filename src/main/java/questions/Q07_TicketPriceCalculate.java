package questions;

import java.util.Scanner;

public class Q07_TicketPriceCalculate {
    /*
     A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
     Bilet tarifesi:
     km birim fiyati : 0.10$
     yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
     12 ve 24 yas arasindaysa 10% indirim,
     65 yasindan buyukse 30% indirim,
     bilet gidis donus alinirsa 20% indirim uygulayan bi app create ediniz
*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz.");
        int age = input.nextInt();

        if (age < 0) {
            System.out.println("Geçersiz yaş. Lütfen doğru bir giriş yapınız.");

        } else {
            System.out.println("Lütfen gitmek istediğiniz şehri yazınız.");
            System.out.println("*Paris \n*Prag \n*Boston");
            String city = input.next();

            System.out.println("Biletiniz gidiş-dönüş mü? (Evet / Hayır)");
            String oneWayOrNot = input.next();

            double birimFiyat = 0.10;

            if (city.equalsIgnoreCase("Paris")) {
                double biletFiyati = birimFiyat * 500.0;

                if (oneWayOrNot.equalsIgnoreCase("evet")){
                    biletFiyati = biletFiyati - (biletFiyati * 0.2);
                }

                if (age > 0 && age < 12) {
                    double biletFiyati1 = biletFiyati - (biletFiyati * 0.5);
                    System.out.println("Paris için bilet fiyatınız: " + biletFiyati1);

                } else if (age >= 12 && age < 24) {
                    double biletFiyati2 = biletFiyati - (biletFiyati * 0.1);
                    System.out.println("Paris için bilet fiyatınız: " + biletFiyati2);

                } else if (age > 65) {
                    double biletFiyati3 = biletFiyati - (biletFiyati * 0.3);
                    System.out.println("Paris için bilet fiyatınız: " + biletFiyati3);

                } else {
                    System.out.println("Paris için bilet fiyatınız: " + biletFiyati);
                }


            } else if (city.equalsIgnoreCase("Prag")) {
                double biletFiyati = birimFiyat * 700.0;

                if (oneWayOrNot.equalsIgnoreCase("evet")){
                    biletFiyati = biletFiyati - (biletFiyati * 0.2);
                }

                if (age > 0 && age < 12) {
                    double biletFiyati1 = biletFiyati - (biletFiyati * 0.5);
                    System.out.println("Prag için bilet fiyatınız: " + biletFiyati1);

                } else if (age >= 12 && age < 24) {
                    double biletFiyati2 = biletFiyati - (biletFiyati * 0.1);
                    System.out.println("Prag için bilet fiyatınız: " + biletFiyati2);

                } else if (age > 65) {
                    double biletFiyati3 = biletFiyati - (biletFiyati * 0.3);
                    System.out.println("Prag için bilet fiyatınız: " + biletFiyati3);

                } else {
                    System.out.println("Prag için bilet fiyatınız: " + biletFiyati);
                }

            } else if (city.equalsIgnoreCase("Boston")) {
                double biletFiyati = birimFiyat * 900.0;

                if (oneWayOrNot.equalsIgnoreCase("evet")){
                    biletFiyati = biletFiyati - (biletFiyati * 0.2);
                }

                if (age > 0 && age < 12) {
                    double biletFiyati1 = biletFiyati - (biletFiyati * 0.5);
                    System.out.println("Boston için bilet fiyatınız: " + biletFiyati1);

                } else if (age >= 12 && age < 24) {
                    double biletFiyati2 = biletFiyati - (biletFiyati * 0.1);
                    System.out.println("Boston için bilet fiyatınız: " + biletFiyati2);

                } else if (age > 65) {
                    double biletFiyati3 = biletFiyati - (biletFiyati * 0.3);
                    System.out.println("Boston için bilet fiyatınız: " + biletFiyati3);

                } else {
                    System.out.println("Boston için bilet fiyatınız: " + biletFiyati);
                }

            }


        }



    }

}
