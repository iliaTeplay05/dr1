import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        double daysInWeek = 7;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Эта программа позволяет вычислить количество полных недель");

        System.out.print("Введите количесво дней: ");
        int days = scanner.nextInt();

         int result = (int) Math.floor(days/daysInWeek);

        System.out.print("Количество полных недель: "+result);
    }
}
