package proyectosGitHub;
import java.util.Scanner;
import java.util.ArrayList;

/*
 * Objetivos CUMPLIDOS:
 * 
 * El Algoritmo de Collatz es un algoritmo que al tomar un numero entero positivo:
 * 	Si es par, se divide entre 2.
 *  Si no es par, se le multiplica x3 y se le suma 1.
 *  El proceso se repite hasta llegar a 1.
 *  
 *  Objetivos PENDIENTES:
 *  
 *  Aparte, el programa debe cumplir con un metodo de memorización para optimizar el calculo:
 *   La aplicación comprobará si es que ya se hizo el calculo anteriormente, si es así,
 *   lo imprimira.
 *  
 */

public class AlgoritmoDeCollatz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); // Esto es para el input
		ArrayList<Integer> memoria = new ArrayList<>(); // Memoria que guardara los valores
		int numElegido = 0; 

		System.out.println("Porfavor, introduzca un numero.");
		numElegido = sc.nextInt();

		// Logica: El bucle se repetirá siempre y cuando el valor sea distinto de 1
		while (numElegido != 1) {

			// Esto es una validación, si el numero es menor a 0 le pide al usuario volver a ingresarlo.
			if(numElegido < 0) {
				System.out.println("Porfavor, escoja un numero entero positivo.");
				numElegido = sc.nextInt();
			}
			// Si es par, divide entre 2 y guarda en la variable memoria
			if (numElegido % 2 == 0) {
				numElegido = numElegido / 2;
				memoria.add(numElegido);
			// Si no es par, multiplica x 3 y le suma 1, luego lo guarda en la variable memoria
			} else {
				numElegido = (numElegido * 3) + 1;
				memoria.add(numElegido);
			}

		}

		System.out.println("Secuencia completa del Algoritmo de Collatz:");
		System.out.println(memoria);
		sc.close();

	}

}
