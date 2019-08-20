import java.util.Scanner;
/**
 * Permite calcular el mayor y menor numero de una lista.
 * 
 * @author NicolasRamirez_WilderSanchez
 * @version 19082019
 */
public class Ejercicio1Act2
{
     public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double numeros[];
        int n;

        System.out.print("Ingrese la cantidad de numeros: ");
        n = teclado.nextInt();

        numeros = new double[n];

// REALIZAR EL CONTEO DE NUMEROS
        for (int i = 0; i < n; ++i) {
            System.out.print("Ingrese el numero No°" + i + " \n");
            numeros[i] = teclado.nextDouble();

        }

        double sumatoria = 0.0;
        for (int i = 0; i < numeros.length; ++i) {
            sumatoria = sumatoria + numeros[i];
        }

        int mayor = 0;
        int menor = 0;

        for (int i = 0; i < numeros.length; ++i) {
            if (numeros[i] > mayor) {
                mayor = n;
                System.out.print("El numero mayor es: " + n + "\n");

            } else {
            }
        }

        for (int i = 0; i < numeros.length; ++i) {
            if (numeros[i] < menor) {
                menor = n;
                System.out.print("El numero menor es: " + n + "\n");
            }
        }

//CALCULAR PROMEDIO
        double promedio = sumatoria / n;

        System.out.print("El promedio es: " + promedio + "\n");
    }
}
