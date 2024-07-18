import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int number = scanner("Write a integer number: ").nextInt();
        int i = 0;
        int calc = 1;

        while (i != number){
            calc *= (number-i);
            i++;
        }
        System.out.println("The factorial of this number is: "+calc);
    }
    public static Scanner scanner(String message){
        System.out.println(message);
        return new Scanner(System.in);
    }
}
