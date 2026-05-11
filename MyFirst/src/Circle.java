import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        //Circumference = 2 * Math.PI * radius
        // area = Math.PI * MAth.row(radius, 2)
        //volume = (4.0/3.0) * Math.PI * Mayh.pow(radius, 3)
        double radius;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius: ");
        radius = scanner.nextDouble();

        System.out.println(radius);
        scanner.close();
    }
}
