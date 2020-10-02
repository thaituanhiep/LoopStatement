package Loop;

import java.util.Scanner;

public class LoanInterestCalculation {
    public static void main(String[] args) {
        double money = 1.0, interest_rate = 1.0, total_interest = 1.0;
        int month = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        money = input.nextDouble();
        System.out.println("Enter number of months: ");
        month = input.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        interest_rate = input.nextDouble();

        for (int i = 0; i < month; i++) {
            total_interest = money * (interest_rate / 100) / 12 * month;
        }
        System.out.println("Total of interset: " + total_interest);
    }
}
