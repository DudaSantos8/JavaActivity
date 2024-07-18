import java.util.Scanner;

public class NumberInversion {
    public static void main(String[] args) {
        int number = scanner("Write a integer number: ").nextInt();
        String numberStr = Integer.toString(number);
        System.out.println(new StringBuilder(numberStr).reverse().toString());
    }
    public static Scanner scanner(String message){
        System.out.println(message);
        return new Scanner(System.in);
    }
}