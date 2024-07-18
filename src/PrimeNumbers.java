import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        int number = scanner("Write a integer number: ").nextInt();
        int i = 1;
        int cont = 0;

        while (i <= number){
            if(number%i == 0) {
                cont += 1;
            }
            i++;
        }
        if(cont == 2){
            System.out.println("This number is prime.");
        }else{
            System.out.println("This number isn't prime.");
        }
    }
    public static Scanner scanner(String message){
        System.out.println(message);
        return new Scanner(System.in);
    }
}