package tarea.semana7;

/**
 *
 * @author Server
 */
import java.util.Scanner;

public class NumeroParImpar {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String respuesta="";
        int numero;
        boolean continuar;

        do {
            // Leer el número ingresado
            System.out.print("Ingrese un número: ");
            numero = lectura.nextInt();
            // Determinar si es par o impar
            if (numero % 2 == 0) {
                System.out.println("El número " + numero + " es par.");
            } else {
                System.out.println("El número " + numero + " es impar.");
            }

            // Preguntar al usuario si desea continuar
            System.out.print("¿Desea continuar (si/no)? ");
            respuesta = lectura.next().toLowerCase();
            continuar = respuesta.equals("si");
        } while (continuar);
        System.out.println("Finalizado");
    }
}