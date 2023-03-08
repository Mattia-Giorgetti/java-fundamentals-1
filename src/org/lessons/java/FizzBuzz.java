package org.lessons.java;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);

        System.out.println("Per giocare inserisci un numero tra 1 e 999");
        int userNumber = Integer.parseInt(myScan.nextLine());

        while (!(userNumber > 1 && userNumber <= 999)){
            System.out.println("Per giocare inserisci un numero tra 1 e 999");
            userNumber = Integer.parseInt(myScan.nextLine());
        }

        System.out.println("Ottimo! ecco i numeri");

        for (int i = 1; i <= userNumber; i++) {
           if (i % 5 == 0 && i % 3 == 0){
               System.out.println("FizzBuzz");
           } else if (i % 5 == 0){
               System.out.println("Buzz");
           } else if (i % 3 == 0){
               System.out.println("Fizz");
           } else {
               System.out.println(i);
           }
        }
    }
}
