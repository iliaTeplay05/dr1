import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа позволяет понять доживет ли белка до весны");

        System.out.print("Введите количесво шишек, орехов в шишках и то, сколько белке нужно орехов на зиму:");
        int cones = scanner.nextInt();
        int nuts = scanner.nextInt();
        int need = scanner.nextInt();

        if (cones*nuts>=need) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
