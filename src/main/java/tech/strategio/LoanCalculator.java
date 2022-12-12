package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * TODO: finish out this JavaDoc comment block.
     * FIXME: WHAT DOES THIS METHOD DO?
     * 
     * @param amount Original loan
     * @return amount owe after 3 consecutive monthly payments
     */
    static int getRemainingAmountIn3Months(int amount) {


        int i =0;
        while(i  < 3){                                  // loop number of month you want to deduct from original loan
            int monthlyPayment = (amount * 10) /100;    // calculate the amount to pay each month
            amount -= monthlyPayment;                   //  subtract monthly payment from loan balance
            i++;
        }
        return amount;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
