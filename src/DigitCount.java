import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        int number = scanner("Write a integer number: ").nextInt();
        String numberLength = Integer.toString(number);
        System.out.println("This number have "+numberLength.length()+" digits");
    }
    public static Scanner scanner(String message){
        System.out.println(message);
        return new Scanner(System.in);
    }
}
