package questions;

import java.util.Scanner;

public class Q11_PerfectNumber {

    /* Perfect Number (Mukemmel sayi)
      Kullanici tarafindan bir sayiya kadar olan sayilarin,
      mukemmel olup olmadigini bulan method yaziniz.
      Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
      kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
      ORNEK: (6, 28, 496, 8128)
      INPUT      : 6
      OUTPUT     :  1,2,3
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number.");
        int num = input.nextInt();

        int sum = 0;

        int i = 1;
        while (i<=num/2){

            if (num % i == 0){
                sum += i;
            }

            i++;
        }

        if (num == sum){
            System.out.println(num + " is perfect number.");

        } else {
            System.out.println(num + " is not perfect number.");
        }


    }

}
