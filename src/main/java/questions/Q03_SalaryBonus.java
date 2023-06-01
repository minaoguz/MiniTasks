package questions;

import java.util.Scanner;

public class Q03_SalaryBonus {
    // Bir IT firması çalışanlarına Kurban Bayramı öncesi PRİM ve bayram İKRAMİYESİ verecektir.
    // Ünvan olarak; Development (D), Tester (T), Software için (S) girilecektir.
    // Kişinin Taban maaşı, tamsayı olarak girilecektir.
    // Kaç yıldır bu IT firmasında çalıştığı Tamsayı olarak girilecektir.

    // PRİM hesaplanırken ünvana bakılmaksızın, kişinin bu firmada kaç yıl çalıştığı baz alınacaktır,;
    // 5 ve daha az yıldır çalışanlara taban maaşının %10'u PRİM olarak verilecektir
    // 6 ve yukarı yıldır çalışanlara taban maaşının %15'i PRİM olarak verilecektir.
    // İKRAMİYE hesaplanırken kişinin ÜNVANI'na göre hesaplama yapılacaktır.
    // DEVELOPMENT ise; Taban Maaşı ve Prim toplamının % 7'si İKRAMİYE olarak verilecektir.
    // TESTER ise; Taban Maaşı ve Prim toplamının % 6'sı İKRAMİYE olarak verilecektir.
    // SOFTWARE ise; Taban Maaşı ve Prim toplamının % 5'i İKRAMİYE olarak verilecektir.

    // Bu verilere göre; TABAN MAAŞI, ÇALIŞTIĞI YIL ve ÜNVAN'ı girilen kişinin PRİM ve İKRAMİYESİNİ bulunuz...

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen ünvanınızı harf olarak giriniz. \n -Development (D) \n -Tester (T) \n -Software (S)");
        String unvan = input.next();

        String unvanInitial = unvan.substring(0, 1);

        System.out.println("Lütfen taban maaşınızı yazınız.");
        int maas = input.nextInt();

        System.out.println("Firmamızda kaç yıldır çalıştığınızı yazınız.");
        int calistigiYil = input.nextInt();

        if (unvanInitial.equalsIgnoreCase("D")) {
            unvan = "Developer";
        } else if (unvanInitial.equalsIgnoreCase("T")) {
            unvan = "Tester";
        } else if (unvanInitial.equalsIgnoreCase("S")) {
            unvan = "Software";
        }

        float prim = 0;
        float ikramiye = 0;

        if (calistigiYil <= 5) {

            prim = (maas * 0.1F);

            if (unvan.equals("Developer")) {
                ikramiye = (maas + prim) * 0.07F;

            } else if (unvan.equals("Tester")) {
                ikramiye = (maas + prim) * 0.06F;

            } else if (unvan.equals("Software")) {
                ikramiye = (maas + prim) * 0.05F;

            }


        } else if (calistigiYil >= 6) {

            prim = (maas * 0.15F);

            if (unvan.equals("Developer")) {
                ikramiye = (maas + prim) * 0.07F;

            } else if (unvan.equals("Tester")) {
                ikramiye = (maas + prim) * 0.06F;

            } else if (unvan.equals("Software")) {
                ikramiye = (maas + prim) * 0.05F;

            }
        }

        System.out.print("Firmamızda " + calistigiYil + " yıldır " + unvan + " olarak çalışan kişinin Primi: " + prim);
        System.out.println(" - Bayram ikramiyesi: " + ikramiye + " TL'dir.");


    }
}
