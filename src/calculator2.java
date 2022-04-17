import java.util.Scanner;

public class calculator2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение x: ");
        int x = scanner.nextInt();

        int result = (12*x)*(12*x)+(7*x)-16;

        System.out.print(result);
    }
}