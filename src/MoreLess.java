import java.util.Scanner;

public class MoreLess {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа сравнивает числа между собой");

        System.out.print("Введите числа: ");
        double First = scanner.nextInt();
        double Second = scanner.nextInt();

        if (First>Second) {
            System.out.print(">");
        } else if (First == Second) {
            System.out.print("=");
        } else {
            System.out.print("<");
        }
    }
}