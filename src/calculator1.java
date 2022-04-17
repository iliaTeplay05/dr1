import java.util.Scanner;

public class calculator1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение стороны квадрата: ");
        int x = scanner.nextInt();

        int result = 4*x;

        System.out.print(result);
    }
}