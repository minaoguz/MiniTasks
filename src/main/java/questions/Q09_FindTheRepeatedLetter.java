package questions;

import java.util.Scanner;

public class Q09_FindTheRepeatedLetter {
    /*
     * Kullanicidan bir cumle ve bir harf alin,
     * Cumlede harfin kac kere
     * kullanildigini bulup, yazdirin
     *
     * ORNEK:
     *
     * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
     *
     * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a sentence.");
        String sentence = input.nextLine();

        System.out.println("Please enter a letter.");
        String letter = input.next().substring(0,1);

        String[] letters = sentence.toLowerCase().split("");

        int counter = 0;

        for (String w : letters){

            if (w.equalsIgnoreCase(letter)){
                counter++;
            }

        }
        System.out.println("Letter '" + letter + "' is repeated " +counter + " times in the sentence.");

    }


}
