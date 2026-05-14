import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args){
        double weight;
        double newWeight;
        int choice;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Weight Converter");
        System.out.println("1. Convert lbs to kgs");
        System.out.println("2. Convert kgs to lbs");

        System.out.print("Choose an option: ");
        choice = scanner.nextInt();

        if (choice == 1){
            System.out.print("Weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = (weight * 2.20462);
            System.out.printf("Your weight is %.2f kgs", newWeight);

        }else if (choice == 2){
            System.out.print("Weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = (weight * 0.45359237);
            System.out.printf("Weight is %.2f lbs", newWeight);

        }else{
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
