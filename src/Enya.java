import java.util.Scanner;

public class Enya {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа позволяет узнать сколько нанограмм сульфида тория потребуется для обработки всех понелей ");

        System.out.print("Введите количесво понелей, их ширину и высоту: ");
        int Panels = scanner.nextInt();
        int Width = scanner.nextInt();
        int Height = scanner.nextInt();

        int result = Height*Width*Panels*2;

        System.out.print("Количесво необходимых нанограммов: " + result);
    }
}