import java.util.Scanner;

public class MultipleNumber {
    public static void main(String[] args) {
        int limit = scanner("Write a integer number limit: ").nextInt();
        int number = scanner("Write a integer number to multiply: ").nextInt();
        int cont = 0;

        System.out.println("Multiple of "+number+", to "+limit);
        for (int i = 1; cont < limit ; i++) {
            cont = i * number;
            System.out.println(cont);
        }
    }
    public static Scanner scanner(String message){
        System.out.println(message);
        return new Scanner(System.in);
    }
}
