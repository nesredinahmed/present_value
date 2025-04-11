import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        A calculator that determines the present value of an
//        ordinary annuity. (Note: this is difficult)
//        a. It would accept the monthly payout, expected interest rate,
//        and years to pay out from the user
        Scanner scanner = new Scanner(System.in);
        // a. Get inputs from the user
        System.out.print("Monthly Payout (e.g. 3000): ");
        double monthlyPayout = scanner.nextDouble();

        System.out.print("Annual Interest Rate (e.g. 2.5 for 2.5%): ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Years to Pay Out (e.g. 20): ");
        int years = scanner.nextInt();
//        b. It would display the present value of that annuity
//        Example: To fund an annuity that pays $3,000 monthly for 20
//        years and earns an expected 2.5% interest, you would need to
//        invest $566,141.46 today.
//                NOTE: If your results on any of these calculators are off by a
//        few pennies (not dollars!), don't worry. The difference is likely


        // b. Convert to monthly rate and total number of payments
        double monthlyInterestRate = (annualInterestRate / 100) / 12;
        int totalPayments = years * 12;

        // c. Use the annuity present value formula
        double presentValue = monthlyPayout * ((1 - Math.pow(1 + monthlyInterestRate, -totalPayments)) / monthlyInterestRate);

        // d. Display result
        System.out.printf("You would need to invest: $%,.2f today\n", presentValue);

    }
}