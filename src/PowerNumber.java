import java.util.Scanner;

public class PowerNumber {
    public static void main(String[] args) {
        int base = scanner("Write a integer number to calculate your power:").nextInt();
        int exponent = scanner("Write a integer number to exponent:").nextInt();
        int result = base;
        int cont = 0;

        for (int i = 1; i < exponent; i++) {
            cont = result * base;
            result = cont;
        }
        System.out.println(result);
    }
    public static Scanner scanner(String message){
        System.out.println(message);
        return new Scanner(System.in);
    }
}
