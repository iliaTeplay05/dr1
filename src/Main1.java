import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        double SecInHour = 3600;
        double SecInMin = 60;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа определяет время из количества прошедших секунд с начала суток");

        System.out.print("Введите количесво секунд, прошедших с начала суток: ");
        int Second = scanner.nextInt();

        int hour = (int) Math.floor(Second/SecInHour);
        int minute = (int) Math.floor((Second-(hour*SecInHour))/SecInMin);
        int second = (int) Math.floor(Second-(hour*SecInHour)-(minute*SecInMin));
        System.out.print(hour + ":" + minute + ":" + second);
    }
}