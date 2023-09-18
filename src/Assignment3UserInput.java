import java.util.Random;
import java.util.Scanner;

public class Assignment3UserInput {

    public static void main(String[] args) {

        int num1, num2, result;

        num1 = 20;
        num2 = 10;

        result = num1 + num2;
        System.out.println("The Result of the addition is: " + result);  //Addition

        result = num1 - num2;
        System.out.println("The Result of the subtraction is: " + result);  //Subtraction

        result = num1 * num2;
        System.out.println("The Result of the multiplication is: " + result);  //Multiplication

        result = num1 / num2;
        System.out.println("The Result of the division is: " + result);  //Division

        result = num1 % num2;
        System.out.println("The Result  of the modulus is: " + result);  //Modulus

        result = num1++;
        System.out.println("The Result of the increment is: " + result);  //Increment

        result = ++num1;
        System.out.println("The Result of the increment is: " + result);  //Increment

        result = num1--;
        System.out.println("The Result of the decrement is: " + result);  //Decrement

        result = --num1;
        System.out.println("The Result of the decrement is: " + result);  //Decrement



    }

}
