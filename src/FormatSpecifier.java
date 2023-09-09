public class FormatSpecifier {

    public static void main(String[] args) {

        boolean b = true;
        char c = 'a';
        short s = 32156;
        int i = 123654;
        float f = 10.2f;
        double d = 10.20;

        System.out.printf("Boolean b = %b\n",b);   // to print boolean value used " %b " and new lines added by "\n".
        System.out.printf("Character c = %c\n",c); // To print character value used " %c".
        System.out.printf("Short s = %d\n",s); // To print short value used - " %d ".
        System.out.printf("Integer i = %.2f\n",f); // To print Integer value used - " %f " and to show fraction we use 0.2 to show until 2 position after ( .) .
        System.out.printf("Double d = %.3f\n",d);  // To print Integer value used - " %f " and to show fraction we use 0.3 to show until 3 position after ( .) .

    }
}
