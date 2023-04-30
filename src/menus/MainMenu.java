package menus;

import operaciones.Paciente;
import operaciones.Temperatura;

import java.util.ArrayList;

public class MainMenu {
    static int cont = 0;
    Paciente paciente = new Paciente();
    Temperatura temperatura = new Temperatura();
    ArrayList<Paciente> pacienteArrayList = new java.util.ArrayList<>();
    public void mostrar(){
        System.out.println("\n");
        crearPacientes();
        for(int i = 0; i < pacienteArrayList.size(); i++){
            System.out.println(pacienteArrayList.get(i));
            double celsius = getCelsius(i);
            double fahrenheit = getFahrenheit(i);
            temperatura.mostrarCelsius(fahrenheit);
            temperatura.mostrarFahrenheit(celsius);
            System.out.println("----------------------------------------\n");
        }
    }
    private void crearPacientes(){
        paciente = new Paciente("Pedrito",8,37,99);
        pacienteArrayList.add(paciente);
        paciente = new Paciente("Juanito",9,38,100);
        pacienteArrayList.add(paciente);
        paciente = new Paciente("Pepito",10,39,101);
        pacienteArrayList.add(paciente);
        paciente = new Paciente("Pablito",11,36,98);
        pacienteArrayList.add(paciente);
        paciente = new Paciente("Jose",20,35,97);
        pacienteArrayList.add(paciente);
    }
    private double getCelsius(int i){
        return pacienteArrayList.get(i).tempCelsius;
    }
    private double getFahrenheit(int i){
        return pacienteArrayList.get(i).tempFahrenheit;
    }
}
