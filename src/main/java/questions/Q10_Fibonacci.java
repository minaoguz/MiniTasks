package questions;

import java.util.Scanner;

public class Q10_Fibonacci {
    /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34....
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı girişi yapınız.");
        int number = input.nextInt();

        int num1 = 0;
        int num2 = 1;

        System.out.print(num1 + " " + num2);

        int i = 2;
        while (i<number){

            int newNum = num1 + num2;
            System.out.print(" " + newNum);
            num1 = num2;
            num2 = newNum;

            i++;


        }

    }

}
