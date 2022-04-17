import java.util.Scanner;

public class beads {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа позволяет узнать количесво бусин, которые нужно достать для того, что бы получить бусины с разными цветами");

        System.out.print("Введите количесво цветов бусин: ");

        int colors = scanner.nextInt();

        int result = colors + 1;

        System.out.print("Количесво необходимых бусин равно " + result);
    }
}
