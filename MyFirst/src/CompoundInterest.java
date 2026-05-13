import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal;
        double interestAmount;
        double interestRate;
        int years;
        double totalAmount;



        System.out.print("Enter principal: ");
        principal = scanner.nextDouble();
//        System.out.print("Enter interestAmount: ");
//        interestAmount = scanner.nextDouble();
        System.out.print("Enter number of years: ");
        years = scanner.nextInt();
        System.out.print("Enter interest rate: ");
        interestRate = scanner.nextDouble()/ 100.0;
//        System.out.print("Enter principal: ");
//        principal = scanner.nextDouble();

        totalAmount = principal*(1 + Math.pow(interestRate, years));

//        System.out.printf("Your final Interest Amount is: %.2f%n", interestAmount);

        System.out.printf("Your final totalAmount is: %.2f%n", totalAmount);
        scanner.close();
    }
}
