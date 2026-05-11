import java.util.Scanner;

public class PythograsTheorem {
    public static void main(String[] args){
        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side A: ");
        a = scanner.nextDouble();
        System.out.println("Enter side B: ");
        b = scanner.nextDouble();

        System.out.println(a + " " + b);

        c = Math.pow(a, 2)  + Math.pow(b, 2);

        System.out.println(c);




    }
}
