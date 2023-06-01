package menus;

import operaciones.Paciente;
import operaciones.Temperatura;
import validaciones.Validar;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
    static int cont = 0;
    Scanner scanner = new Scanner(System.in);
    Paciente paciente = new Paciente();
    Temperatura temperatura = new Temperatura();
    ArrayList<Paciente> pacienteArrayList = new java.util.ArrayList<>();
    Validar validar = new Validar();
    public void mostrar(){
        System.out.println();
        int op=0;
        while (op!=3){
            op=options();
            switch (op){
                case 1 -> crearPacientes();
                case 2 -> mostrarPacientes();
                default -> System.out.println("opcion no valida");
            }
        }
    }
    private void crearPacientes(){
        System.out.println("ingresa nombre");
        String nombre = scanner.nextLine();
        System.out.println("ingresa edad");
        int edad = validar.validarnum(scanner);
        System.out.println("ingresa temp Celsius");
        double celsius= validar.validarDouble(scanner);
        System.out.println("ingresa temp Farenheit");
        double farenheit= validar.validarDouble(scanner);
        paciente= new Paciente(nombre,edad,celsius,farenheit);
        pacienteArrayList.add(paciente);
    }
    private void mostrarPacientes(){
        if(pacienteArrayList.size()!=0){
            for(int i = 0; i < pacienteArrayList.size(); i++){
                System.out.println(pacienteArrayList.get(i));
                double celsius = getCelsius(i);
                double fahrenheit = getFahrenheit(i);
                temperatura.mostrarCelsius(fahrenheit);
                temperatura.mostrarFahrenheit(celsius);
                System.out.println("----------------------------------------\n");
            }
        }else System.out.println("no hay pacientes registradios");
    }
    private int options(){
        System.out.println(" 1) ingresar paciente\n 2) mostrar pacientes\n 3) salir\n");
        System.out.println(" seleciona opcion:");
        int opc= validar.validarnum(scanner);
        return opc;
    }
    private double getCelsius(int i){
        return pacienteArrayList.get(i).tempCelsius;
    }
    private double getFahrenheit(int i){
        return pacienteArrayList.get(i).tempFahrenheit;
    }
}
