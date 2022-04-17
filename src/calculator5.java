import java.util.Scanner;

public class calculator5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа позволяет определить плотность вещества");

        System.out.println("Введите объем и массу тела: ");
        double volume = scanner.nextInt();
        double weight = scanner.nextInt();


        double result = weight/volume;

        System.out.print(result);
    }
}