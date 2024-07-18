import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        int number = scanner("Write a integer number: ").nextInt();
        int calc = 0;

        for (int i = 0; i <= number; i++) {
            calc += i;
        }
        System.out.println("the sum of this number with its previous ones is: "+calc);
    }
    public static Scanner scanner(String message){
        System.out.println(message);
        return new Scanner(System.in);
    }
}