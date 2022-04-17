import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double FactorFahrenheit = 1.8;
        int PlusFahrenheit = 32;
        double Kelvin = 273.15;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа позволяет перевести значение температуры по шкале Цельсия в значения по шкале Фаренгейта и Кельвина");

        System.out.print("Введите зачание температуры по шкале Цельсия:");
        double Celsius = scanner.nextInt();

        double Fahrenheit = Celsius * FactorFahrenheit + PlusFahrenheit;

        double KelvinResult = Celsius + Kelvin;

        System.out.println("Значение по щкале Фаренгейта:" + Fahrenheit);
        System.out.print("Значение по шкале Кельвина:" + KelvinResult);
    }
}