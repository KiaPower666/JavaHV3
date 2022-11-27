import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Введите значение температуры в Цельсиях : ");
        double tempC = scr.nextDouble();

        Thermometer thermometerC = new Thermometer(tempC);

        System.out.println(thermometerC.CelsiusFahrenheit());

        System.out.println("Введите значение температуры в Фарангейтах : ");
        double tempF = scr.nextDouble();
        Thermometer thermometerF = new Thermometer(tempF);
        System.out.println(thermometerF.FahrenheitCelsius());

    }
}