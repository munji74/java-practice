import java.util.Scanner;
public class ShoppingCart {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String item1;
        int quantity;
        double price;


        System.out.print("Enter the item you want to buy: ");
        item1 = scanner.next();

        System.out.print("Enter its price: ");
        price = scanner.nextDouble();

        System.out.print("Enter its quantity: ");
        quantity = scanner.nextInt();

        double total= quantity* price;

        if(quantity >0){
            if (quantity==1){
                System.out.printf("1 %s costs $%.2f", item1, total );

            }else {
                System.out.printf("%d of %s cost $%.2f", quantity, item1, total );
            }
        }else{
            System.out.println("Invalid quantity");

        }





        scanner.close();

    }
}
