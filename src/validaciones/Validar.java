package validaciones;

import java.util.Scanner;

public class Validar {
    public int validarnum(Scanner scanner){
        char letra = scanner.next().charAt(0);
        scanner.nextLine();
        if(letra>=48 && letra<=57){
            return Character.getNumericValue(letra);
        }
        else {
            System.out.println("no es un numero");
            return 0;
        }
    }
    public double validarDouble(Scanner scanner){
        if (scanner.hasNextDouble()) { // Verifica si la entrada es un double
            double numero = scanner.nextDouble();
            scanner.nextLine();
            return numero;
        } else {
            System.out.println("La entrada no es un número decimal válido.");
            return 0;
        }
    }
}
