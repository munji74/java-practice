import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args){
        double length;
        double width;
        double area;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        width = scanner.nextDouble();

        area = width * length;

        System.out.println("The are of rectangle with width " + width + " units " + " length " + length + " units is: " + area + " units");


        scanner.close();

    }
}

