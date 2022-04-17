import java.util.Scanner;

public class calculator4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите два целых числа: ");
        double x = scanner.nextInt();
        double y = scanner.nextInt();

        double result1 = (y+x)/2;
        double result2 = y*x;

        System.out.print("Среднее арифметическое: " + result1 + " Среднее геометрическое: " + Math.pow(result2,0.5));
    }
}