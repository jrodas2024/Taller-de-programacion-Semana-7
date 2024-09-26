package tarea.semana7;

/**
 *
 * @author Server
 */
import java.util.Scanner;

public class CalculadoraSimple {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("MENU DE CALCULADORA");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = lectura.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese el primer número: ");
                double num1 = lectura.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                double num2 = lectura.nextDouble();
                double resultado = 0;

                switch (opcion) {
                    case 1:
                        resultado = num1 + num2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 2:
                        resultado = num1 - num2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 3:
                        resultado = num1 * num2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 4:
                        if (num2 != 0) {
                            resultado = num1 / num2;
                            System.out.println("Resultado: " + resultado);
                        } else {
                            System.out.println("Error: División por cero.");
                        }
                        break;
                }
            } else if (opcion != 5) {
                System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 5);

        System.out.println("Saliendo del programa...");
    }
}
