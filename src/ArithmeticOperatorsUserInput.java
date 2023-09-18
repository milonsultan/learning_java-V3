import java.util.Scanner;

public class ArithmeticOperatorsUserInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1, num2, result;
        System.out.print("Enter First Number : ");
        num1 = input.nextInt();
        System.out.print("Enter Second Number : ");
        num2 = input.nextInt();

        result = num1 + num2;
        System.out.println("The Result of the addition is: " + result);

        result = num1 - num2;
        System.out.println("The Result of the subtraction is: " + result);

        result = num1 * num2;
        System.out.println("The Result of the multiplication is: " + result);

        result = num1 / num2;
        System.out.println("The Result of the division is: " + result);

        double result2 = (double) num1 / num2;
        System.out.println("The Result of the division is: " + result2);   //double

        result = num1 % num2;
        System.out.println("The Result  of the modulus is: " + result);

        result = num1++;
        System.out.println("The Result of the increment is: " + result);

        result = ++num1;
        System.out.println("The Result of the increment is: " + result);

        result = num1--;
        System.out.println("The Result of the decrement is: " + result);

        result = --num1;
        System.out.println("The Result of the decrement is: " + result);


    }
}
