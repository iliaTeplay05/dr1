import java.util.Scanner;

public class bandits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа позволяет узнать сколько банок не было подстрелено");

        System.out.print("Введите количесво простреленных кем-то одним банок: ");
        int Harry = scanner.nextInt();
        int Larry = scanner.nextInt();

        int Larryresult = Harry-1;
        int Harryresult = Larry-1;

        System.out.print(Harryresult+" "+Larryresult);
    }
}
