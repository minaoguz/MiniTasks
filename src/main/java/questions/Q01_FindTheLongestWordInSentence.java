package questions;

import java.util.Scanner;

public class Q01_FindTheLongestWordInSentence {
    /*
     * Kullanicidan gelen cumleyi  parametre olarak alan
   ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
     * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
     * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence.");
        String sentence = input.nextLine();

        sentence = sentence.replaceAll("\\p{Punct}" , "");

        int numberOfTheWords = sentence.replaceAll("\\S", "").length()+1;

        String longestWord = "";

        for (int i = 0; i < numberOfTheWords; i++) {

            String words = sentence.split(" ")[i];
            int wordsLength = words.length();


            if (longestWord.length() < wordsLength){
                longestWord = words;
            }


        }

        System.out.println(longestWord);



    }



}
