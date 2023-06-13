package questions;

import java.util.Scanner;

public class Q08_CheckThePinCode {

    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

    public static void main(String[] args) {
        String password = "Pwd123!";

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your password.");

        String pwd = input.nextLine();
        int counter = 3;

        int i = 0;
        while (i<3){

            if (pwd.equals(password)){
                System.out.println("Correct password ");
                break;
            } else {
                System.out.println("Your password is not true. Your account are blocked.");
            }

            i++;
        }

    }




}


