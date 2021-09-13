/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv20.summ.of.digits;

import java.util.Scanner;

/**
 *
 * @author Владимир
 */
public class JKTV20SummOfDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number;
        number = scanner.nextInt();
        System.out.printf("number is %d%n", number);
        
        int number_tens = number%10;
        int summ_tens = (number%100)/10;
        double number_tens2 = number%100;
        double summ_hundreds = (number-number_tens2)/100;
        double all_summ = summ_hundreds + summ_tens + number_tens;
        System.out.printf("число сотен %.0f%n", summ_hundreds);
        System.out.printf("число десятков %d%n", summ_tens);
        System.out.printf("число единиц %d%n", number_tens);
        System.out.printf("сумма всех цифр %.0f%n", all_summ);
    }
    
}
