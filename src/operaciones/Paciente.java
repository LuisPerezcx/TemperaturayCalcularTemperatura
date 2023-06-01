package operaciones;

public class Paciente {
    private String nombre;
    private int edad;
    public double tempCelsius;
    public double tempFahrenheit;

    public Paciente(String nombre, int edad, double tempCelsius, double tempFahrenheit) {
        this.nombre = nombre;
        this.edad = edad;
        this.tempCelsius = tempCelsius;
        this.tempFahrenheit = tempFahrenheit;
    }
   public Paciente(){

   }
   @Override
    public String toString(){
        return "Nombre: " + nombre + "\tedad : " + edad + "\ttempCelsius: " + tempCelsius + "\ttempFahrenheit: " + tempFahrenheit;
   }
}
