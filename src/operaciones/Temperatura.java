package operaciones;

public class Temperatura {
    public void mostrarCelsius(double fahrenheit){
        System.out.println("Grados en celsius: " + CalcularTemperatura.calcularCelsius(fahrenheit));
    }
    public void mostrarFahrenheit(double celsius){
        System.out.println("Grados en fahrenheit: " + CalcularTemperatura.calcularFahrenheit(celsius));
    }
    private static class CalcularTemperatura{
        public static double calcularCelsius(double fahrenheit){
            return (fahrenheit - 32) * 5/9;
        }
        public static double calcularFahrenheit(double celsius){
            return (celsius * 9/5) + 32;
        }
    }
}
