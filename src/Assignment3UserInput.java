import java.util.Random;
import java.util.Scanner;

public class Assignment3UserInput {

    public static void main(String[] args) {
        int id;
        int price;
        String title;
        String description;
        String category;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the product id:" );
        id = input.nextInt();
        System.out.println("The product id:" +id);

        System.out.println("Enter the product price:");
        price = input.nextInt();
        System.out.println("The product price:" +price);

        System.out.println("Enter the product title:");
        title = input.next();
        System.out.println("The product title:" +title);

        System.out.println("Enter the product description:");
        description = input.next();
        System.out.println("The product description:" +description);

        System.out.println("Enter the product category:");
        category = input.next();
        System.out.println("The product category:" +category);


    }

}
