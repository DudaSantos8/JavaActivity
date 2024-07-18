import java.util.Scanner;

public class BinaryDecimal {
    public static void main(String[] args) {
        String number = scanner("Write a binary number: ").next();
        String testInversion = new StringBuilder(number).reverse().toString();
        String[] test = testInversion.split("");
        int i = 0;
        double result = 0;

        while ( i < number.length()){
            int test2 = Integer.parseInt(test[i]);
            double calc = Math.pow(2,i) * test2;
            result += calc;
            i++;
        }
        System.out.println("The number in decimal is: "+result);
        // This was the hardest so far.
    }
    public static Scanner scanner(String message){
        System.out.println(message);
        return new Scanner(System.in);
    }
}
