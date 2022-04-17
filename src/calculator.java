import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение x: ");
        int x = scanner.nextInt();

        int result = (7*x)*(7*x)-(3*x)+6;

        System.out.print(result);
    }
}

