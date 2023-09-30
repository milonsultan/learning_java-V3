public class ArithmeticOperatorsTypeCasting {

    public static void main(String[] args) {

        int num1, num2, result;

        num1 = 20;
        num2 = 10;
        result = num1 + num2;
        System.out.println("The sum of the two numbers is = " + result);

        result = num1 - num2;
        System.out.println("The subtraction of the two numbers is = " + result);

        result = num1 * num2;
        System.out.println("The multiplication of the two numbers is = " + result);

        result = num1 / num2;
        System.out.println("The division of the two numbers is = " + result);

        double result2 = (double) num1 / num2;
        System.out.println("The division of the two numbers is = " + result2);




    }
}
