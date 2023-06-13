package questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q12_DifferenceBetweenTheLargestAndSmallestNumbers {
    /*
     Create a function that takes an array and the difference between the largest
     and the smallest numbers.
     Ask user to enter array elements.
 */

    public static void main(String[] args) {
        findTheDifference();

    }

    public static void findTheDifference(){
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen girmek istediğiniz eleman sayısını giriniz.");
        int length = input.nextInt();

        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i<length; i++){
            System.out.println("Lütfen " + (i+1) + ". elemanı giriniz.");
            int number = input.nextInt();
            nums.add(number);
        }

        Collections.sort(nums);
        System.out.println(nums);

        int difference = nums.get(nums.size()-1) - nums.get(0);
        System.out.println("En büyük eleman ile en küçük eleman arasındaki fark = " + difference);

    }


}
