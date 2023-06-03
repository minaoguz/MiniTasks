package questions;

import java.util.Scanner;

public class Q05_GetNumbersFromUser {
      /*
    Kullanıcıdan bir sayı girmesini isteyiz.
    Girilen sayı sıfır olmadığı sürece kullanıcı sayı girmeye devam etmelidir.
    Kullanıcı eğer sıfır girerse çıktı olarak;
               Kaç negatif sayı girildiğini
               Kaç pozitif sayı girildiğini
               Pozitif sayıların toplamını
               Negatif sayıların toplamını görmelidir.

     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int negatif = 0;
        int pozitif = 0;

        int pozitifToplam = 0;
        int negatifToplam = 0;

        do {
            System.out.println("Lütfen bir sayı giriniz.");
            int num = input.nextInt();

            if (num>0){
                pozitifToplam +=num;
                pozitif++;

            } else if (num<0){
                negatifToplam+=num;
                negatif++;
            }

            if (num==0){
                System.out.println("Girilen negatif sayı adedi: " + negatif);
                System.out.println("Girilen pozitif sayı adedi: " + pozitif);
                System.out.println();
                System.out.println("Girilen pozitif sayıların toplamı = " + pozitifToplam);
                System.out.println("Girilen negatif sayıların toplamı = " + negatifToplam);
                break;
            }
        } while (true);





    }

}
