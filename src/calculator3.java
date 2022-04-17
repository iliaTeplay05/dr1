import java.util.Scanner;

public class calculator3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение радиуса: ");
        int x = scanner.nextInt();

        int result = 2*x;

        System.out.print(result);
    }
}