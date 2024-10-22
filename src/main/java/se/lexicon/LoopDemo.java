package se.lexicon;

import java.util.Locale;
import java.util.Scanner;

public class LoopDemo {
    public static void main(String[] args) {
        /*boolean isActive = true;
        while (isActive){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String str = sc.nextLine();
            System.out.println("Enter your age: ");
            int age = sc.nextInt();

            System.out.println("Hello " + str + " your age is " + age);
            if (age < 18) {
                System.out.println("You are young");
            }
            else if (age == 18){
                System.out.println("You are middle age");
            }
            else {
                System.out.println("You are old");
            }

        }
        */
        System.out.println("---------------");
        for (int x = 1; x <= 5; x++) { //
            for (int y = 1; y <= x; y++) { //
                System.out.print("😁");
                System.out.print("♡");//
            }
            System.out.println();
        }
        System.out.println("---------------");
        String firstName = "Fafa";
        String lirstName = "Khaleghi";
        String fullName = firstName + " " + lirstName;
        System.out.println(fullName.toUpperCase());

        //char grade = "\u0087";





    }
}
