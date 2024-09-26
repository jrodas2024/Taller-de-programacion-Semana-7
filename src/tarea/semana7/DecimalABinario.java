package tarea.semana7;

/**
 *
 * @author Server
 */
import java.util.Scanner;
public class DecimalABinario {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int numero;
        String binario = "";

        System.out.print("Ingrese un número decimal: ");
        numero = lectura.nextInt();

        do {
            binario = (numero % 2) + binario;
            numero /= 2;
        } while (numero > 0);

        System.out.println("El número en binario es: " + binario);
    }
}