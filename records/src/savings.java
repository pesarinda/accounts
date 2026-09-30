import java.util.Scanner;
public class savings {
    static int deposit;
    static double rate;
    static double interest;
    static double total;
    public static void calculatesinterest(){
        Scanner inflow = new Scanner(System.in);
        System.out.print("Enter the deposit amount: ");
        deposit = inflow.nextInt();
        System.out.print("Enter the interest rate: ");
        rate = inflow.nextDouble();

        interest = deposit * rate;
        total = deposit + interest;
    }
    public static void records(){
        System.out.println("\n---savingsreport---" );
        System.out.println("deposit: " + deposit);
        System.out.println("interest rate: " + rate);
        System.out.println("interest earned: " + interest);
        System.out.println("total : " + total);
        int convertedinterest = (int) interest;
        int convertedtotal = (int) total;
        String rateasstring= Double.toString(rate);

        System.out.println("\n---conversion accuracy---");
        System.out.println("rounded interest: " + convertedinterest);
        System.out.println("rounded total: " + convertedtotal);
        System.out.println("Rate as String: "+ rateasstring);

    }
}
