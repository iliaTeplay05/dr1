import java.util.Scanner;

public class Cranes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа позволяет узнать сколько каждый ребенок сделал журавликов");

        System.out.print("Введите общее количесво журавликов: ");
        int General  = scanner.nextInt();

        int Katya = General/3*2;
        int boy = General/6;

        System.out.print("Петя: "+boy + " Катя: "+Katya+" Сережа: "+boy);
    }
}