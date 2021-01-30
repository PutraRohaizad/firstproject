package com.firstproject;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //primitive
        byte getByte = 127; //byte only until -127 = 127
        char getChar = 'a';
        long getLong = 1234567890;
        float getFloat = 1.35F;

        // Reference
        String getString = "string";
        LocalTime masa = LocalTime.now();

        // tenary operator
        int A = 18;
        String message = !(A > 20) ? "Older" : "Younger";
        //System.out.println(message);


        // If Statement
        if(getString == "string"){
            //System.out.println("yolo");
        }

        //Arrays
        String[] users = new String[3];
        users[0] = "Abu";
        //System.out.println(users[0]);

        int[] numbers = {1,2,3};
        //System.out.println(Arrays.toString(numbers));

        for (int number : numbers) {
            //System.out.println(number);
        }

        //Switch
        int age = 6;
        switch (age){
            case 18:
                System.out.println("18");
                break;
            case 17:
                System.out.println("17");
                break;
            case 20:
                System.out.println("20");
                break;
            default:
                //System.out.println("IDK");
        }

        // Scanner
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is your name?");
//        String name = scanner.nextLine();
//        System.out.println("My name is " + name);
//
//        System.out.println("How old is you?");
//        int umur = scanner.nextInt();
//        int year = LocalDate.now().minusYears(umur).getYear();
//        System.out.println("You were born in " + year);


        //methods
        char[] letters = {'a','a', 'b', 'c', 'd', 'd','d'};
        System.out.println(countLetter(letters, 'o'));

        Humans person = new Humans("Putra", 25, true);
        System.out.println(person.name);

        System.out.println("************************************************");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Principle:");
        int principleInput = scanner.nextInt();
        System.out.println("Interest Rate:");
        float interestInput = scanner.nextFloat();
        System.out.println("Period:");
        byte period = scanner.nextByte();

        Exercise calculator = new Exercise(principleInput, interestInput, period);
        double total = calculator.calMortgage();
        System.out.println("RM" + total);

   }

   public static int countLetter(char[] letters, char selectLetter){
       int count = 0;
       for (char letter : letters) {
            if (letter == selectLetter){
                count++;
            }
       }
       return count;
   }

   static class Humans{
        String name;
        int age;
        boolean isAdult;
        Humans(String name, int age, boolean isAdult){
                this.name = name;
                this.age = age;
                this.isAdult = isAdult;
        }

   }
}

