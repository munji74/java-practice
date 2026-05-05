import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("What is your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.println("Are you a student: Y/N: ");
        boolean isStudent = scanner.nextBoolean();




        System.out.println("Hello " + name + " You are " + age + " years old. " + "You scored a " + gpa + " CGPA");
        if(isStudent){
            System.out.println("You are a student.");}
        else{
            System.out.println("You are not a student.");
        }


        scanner.close();
    }
}

