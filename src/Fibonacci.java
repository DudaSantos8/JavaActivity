import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int number = scanner("Write a integer number: ").nextInt();
        int sum = 0;
        int n = 0;
        int x = 1;

        System.out.println(0);
        for (int i = 1; i < number; i++) {
            System.out.println(x);
            sum = n + x;
            n = x;
            x = sum;
        }
    }
    public static Scanner scanner(String message){
        System.out.println(message);
        return new Scanner(System.in);
    }
}
