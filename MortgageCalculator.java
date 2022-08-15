import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MortgageCalculator {
    private static final DecimalFormat mortgageDF = new DecimalFormat("0.00");

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        // Principal Amount
        System.out.print("Principal: ");
        int principle = scanner.nextInt();

        // Rate of Interest
        System.out.print("Annual Rate of Interest: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / 12 / 100;

        // Time Period
        System.out.print("Time Period in Years: ");
        byte period = scanner.nextByte();
        int numberOfPayments = period * 12;

        // Calculate Monthly Payment of Mortgage
        double mathPower = Math.pow(1 + monthlyInterest, numberOfPayments);
        double mortgage = ((principle * monthlyInterest * mathPower) / (mathPower - 1));

        // Print the Calculated Mortgage
        mortgageDF.setRoundingMode(RoundingMode.DOWN);
        System.out.println("Monthly Payment of Mortgage: " + mortgageDF.format(mortgage));
    }
}