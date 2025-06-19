import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Convert from (C/F): ");
        char choice = scanner.next().charAt(0);
        System.out.print("Enter temperature: ");
        double temp = scanner.nextDouble();

        if (choice == 'C' || choice == 'c') {
            System.out.println("Fahrenheit: " + celsiusToFahrenheit(temp));
        } else {
            System.out.println("Celsius: " + fahrenheitToCelsius(temp));
        }
    }

    static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}
