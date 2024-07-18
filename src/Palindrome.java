import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int number = scanner("Write a integer number: ").nextInt();
        String numberStr = Integer.toString(number);
        String numberInversion = new StringBuilder(numberStr).reverse().toString();

        System.out.println("The number are the same of any direction? "+numberInversion.equals(numberStr));
    }
    public static Scanner scanner(String message){
        System.out.println(message);
        return new Scanner(System.in);
    }
}
