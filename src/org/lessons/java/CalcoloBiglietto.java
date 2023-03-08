package org.lessons.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcoloBiglietto {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        double pricePerKm = 0.21;

        System.out.println("Inserisci il tuo nome");
        String userName = myscan.nextLine();

        System.out.println("Benvenuto " + userName + " Quanti anni hai?");
        int userAge = Integer.parseInt(myscan.nextLine());

        System.out.println("Quanti Km devi percorrere?");
        int totalKm = Integer.parseInt(myscan.nextLine());


        double fullPrice = totalKm * pricePerKm;

        String pattern = "###,###.00";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);

        String formatFull = decimalFormat.format(fullPrice);

        System.out.println("Il prezzo intero è " + formatFull + "€");
        double discountPrice ;

        if (userAge < 18){
            discountPrice = fullPrice * 80 / 100;
            String formatDiscount = decimalFormat.format(discountPrice);
            System.out.println("In base all'età hai ottenuto uno sconto del 20%! Il prezzo finale sarà: " + formatDiscount + "€");
        } else if (userAge > 65){
            discountPrice = fullPrice * 60 / 100;
            String formatDiscount = decimalFormat.format(discountPrice);
            System.out.println("In base all'età hai ottenuto uno sconto del 40%! Il prezzo finale sarà: " + formatDiscount + "€");
        } else {
            System.out.println("Non è stato possibile applicare uno sconto");
        }
    }
}
