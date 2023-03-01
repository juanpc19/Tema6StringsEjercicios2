package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		String palabra;// guardara la palabra introducida por usuario

		int cantidad;// guardara cantidad en la que agrupar letras

		int posInicio = 0;// guardara posicion desde la que empezar a extraer la subcadena

		int posFinal;// guardara posicion hasta la que terminar de extraer la subcadena

		int caracteresRelleno; // guardara cantidad de caracteres a añadir a cadena

		String cadenaExtraida;// guardara cadena extraida de codigo con metodo substring

		// creo escaner y lo nombro dogma
		Scanner dogma = new Scanner(System.in);

		// solicito al usuario su palabra
		System.out.println("Introduzca su palabra: ");

		// doy a palabra valor con escaner
		palabra = dogma.nextLine();

		// solicito al usuario su cantidad
		System.out.println("Introduzca cantidad en que quiere agrupar las letras: ");

		// doy a cantidad valor con escaner
		cantidad = dogma.nextInt();

		// doy a posFinal valor igual a cantidad
		posFinal = cantidad;

		// si resto de la cantidad de caracteres de la palabra dividida entre cantidad
		// es diferente a 0
		if (palabra.length() % cantidad != 0) {

			// habra perdida de caracteres, para evitarlo añado caracteres de relleno que
			// seran los que se pierdan en lugar de los ya existentes en la palabra, la
			// cantidad necesaria de estos caracteres de relleno nunca sera mayor que la
			// cantidad de caracteres en los que quiero dividir la palabra, por lo que puedo
			// usar cantidad para dar valor a caracteresRelleno o cantidad-1
			// si quiero usar la cantidad exacta de caracteres necesarios de relleno
			caracteresRelleno = cantidad - 1;

			// bucle para añadir el caracter de relleno tantas veces como sea necesario
			// indicado por caracteresRelleno, uso espacio " " para no cambiar la palabra
			for (int i = 1; i <= caracteresRelleno; i++) {
				// añado el caracter de relleno a la palabra
				palabra += " ";
			}
		}

		// bucle que se ejecutara mientras posInicio y posFinal sean menor a longitud de
		// palabra, extrayendo subcadenas de longitud indicada por cantidad y haciendo
		// print de la misma en la misma iteracion
		while (posInicio <= palabra.length() && posFinal <= palabra.length()) {

			// doy a cadenaExtraida valor devuelto por metodo substring aplicado a palabra
			cadenaExtraida = palabra.substring(posInicio, posFinal);

			// hago print por pantalla de cadenaExtraida
			System.out.println(cadenaExtraida);

			// añado valor de cantidad a posInicio para actualizar la posicion desde la que
			// extraere una subcadena en la siguiente iteracion
			posInicio += cantidad;

			// añado valor de cantidad a posFinal para actualizar la posicion hasta la que
			// extraere una subcadena en la siguiente iteracion
			posFinal += cantidad;
		}

		// cierro escaner
		dogma.close();
	}

}
