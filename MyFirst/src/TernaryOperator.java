import java.util.Scanner;
public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the color: ");
        String color = scanner.nextLine().toUpperCase();


        String colorChoice = (color.equals("RED")) ? "Win":"Loss";

        System.out.print(colorChoice);


    }
}
