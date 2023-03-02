package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		String frase;// guardara la frase introducida por usuario

		String palabrasFrase[] = new String[0];// guardara las palabras que forman la frase del usuario

		// creo escaner y lo nombro dogma
		Scanner dogma = new Scanner(System.in);

		// solicito al usuario su palabra
		System.out.println("Introduzca su frase: ");

		// doy a palabra valor con escaner
		frase = dogma.nextLine();

		// guardo en el array palabrasFrase las cadenas que me va devolviendo el metodo
		// split al usar la cadena " " como separador
		palabrasFrase = frase.split(" ");

		// ordeno las cadenas dentro del array con el metodo sort de la clase arrays que
		// me las ordenara alfabeticamente
		Arrays.sort(palabrasFrase);

		// recorro el array haciendo print en linea de la palabra y un espacio
		for (String auxiliar : palabrasFrase) {
			System.out.print(auxiliar + " ");
		}
		
		//cierro escaner
		dogma.close();
	}

}
