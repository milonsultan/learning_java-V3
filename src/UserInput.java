import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        // Input value for int

        int  numbers = 120;
        System.out.println(numbers);
        System.out.println("Number = "+numbers);

        Scanner input = new Scanner(System.in);

        int  number;

        System.out.println("Enter any Number :");
        number = input.nextInt();
        System.out.println("Number = "+number);

        // String

        String name = "Md Sahriar Nafiz";

        System.out.println("The Name is: "+name);

        Scanner input2 = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        // name = input2.next(); does not show the full name.

        name = input2.nextLine();  //.next line shows the full name.

        System.out.println("Welcome: "+name);


        // double

        Scanner input3 = new Scanner(System.in);
        double num1;
        System.out.print("Enter any double value: ");
        num1 = input3.nextDouble();  // next double to show the double value like 52.00 .
        System.out.println(num1);










    }
}
