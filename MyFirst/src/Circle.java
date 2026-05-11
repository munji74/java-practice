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

        double area =  Math.PI * Math.pow(radius, 2);
        double Circumference = 2 * Math.PI * radius;
        double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("Radius: " + radius + " cm");
        System.out.println("Circumference: " + Circumference + " cm");
        System.out.println("Volume: " + volume + " cm");

        System.out.printf("Radius: %.2fcm\n", radius);
        System.out.printf("Circumference: %.2fcm²\n", Circumference);
        System.out.printf("Volume: %.2fcm³\n", volume);
        scanner.close();
    }
}
