package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		// buscar condiciones de salida a bucles, crear otro bucle con salida igual a
		// longitud-1, que es igual a cantidad palabras metidas en array, y hacer print
		// del segundo array cuando todas las palabras esten introducidas en al
		// alfabeticamente

		String frase;

		String palabraMenorAlfabeticamente = "";

		int valorAlfabetico;

		String palabrasFrase[] = new String[0];

		String palabrasFraseOrdenadas[];

		// creo escaner y lo nombro dogma
		Scanner dogma = new Scanner(System.in);

		// solicito al usuario su palabra
		System.out.println("Introduzca su frase: ");

		// doy a palabra valor con escaner
		frase = dogma.nextLine();

		palabrasFrase = frase.split(" ");

		// lo siguiente dentro de bucle con condicion de excepcion de palabras iguales
		// (devuelve 0)

		for (int i = 0; i < palabrasFrase.length; i++) {

			valorAlfabetico = palabrasFrase[i].compareTo(palabrasFrase[i + 1]);

			if (valorAlfabetico < 0) {
				palabraMenorAlfabeticamente = palabrasFrase[i];
			}

		}

		dogma.close();
	}

}
