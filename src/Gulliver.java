import java.util.Scanner;

public class Gulliver {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа позволяет узнать количество матрацев лилипутов, необходимых для построения матраца для Гулливера");

        System.out.print("Введите коэффициент, отражающий во сколько раз Гулливер больше лилипутов, и количество слоев матрацев: ");
        int Factor = scanner.nextInt();
        int Quantity = scanner.nextInt();

        int result = Factor*Quantity*Factor;

        System.out.print(result);
    }
}

