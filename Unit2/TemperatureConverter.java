class Temperature {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}

public class TemperatureConverter {
    public static void main(String[] args) {
        double celsius1 = 25.0;
        double fahrenheit1 = 77.0;

        double convertedToFahrenheit = Temperature.celsiusToFahrenheit(celsius1);
        double convertedToCelsius = Temperature.fahrenheitToCelsius(fahrenheit1);

        System.out.println("Celsius to Fahrenheit Conversion:");
        System.out.println(celsius1 + "°C = " + convertedToFahrenheit + "°F");

        System.out.println("Fahrenheit to Celsius Conversion:");
        System.out.println(fahrenheit1 + "°F = " + convertedToCelsius + "°C");
    }
}




