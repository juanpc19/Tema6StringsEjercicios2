package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		String codigo;// guardara el codigo introducido por usuario

		int posInicio = 0;// guardara posicion devuelta por metodo indexOf aplicado a "/*",
		// inicializo a 0 para uso en bucle

		int posFinal = 0;// guardara posicion devuelta por metodo indexOf aplicado a "*/",
		// inicializo a 0 para uso en bucle

		String cadenaExtraida;// guardara cadena extraida de codigo con metodo substring

		// creo escaner y lo nombro dogma
		Scanner dogma = new Scanner(System.in);

		// solicito al usuario su codigo
		System.out.println("Introduzca su codigo: ");

		// doy a codigo valor con escaner
		codigo = dogma.nextLine();

		// bucle que se ejecutara mientras posInicio y posFinal sean menores que la
		// longitud de codigo, extrayendo una subcadena equivalente al comentario del
		// codigo y sustituyendo esta por una vacia en la string codigo, borrando asi
		// los comentarios
		while (posInicio < codigo.length() && posFinal < codigo.length()) {

			// doy a posInicio valor de posicion devuelta por metodo indexOf aplicado a "/*"
			posInicio = codigo.indexOf("/*");

			// doy a posFinal valor de posicion devuelta por metodo indexOf aplicado a "*/"
			posFinal = codigo.indexOf("*/");

			// doy a cadenaExtraida valor devuelto por metodo substring aplicado a codigo
			cadenaExtraida = codigo.substring(posInicio, posFinal + 2);

			// sustituyo la cadenaExtraida por una cadena vacia en la cadena codigo
			codigo = codigo.replace(cadenaExtraida, "");
		}

		// muestro el codigo sin comentarios con print por pantalla
		System.out.println(codigo);

		// cierro escaner
		dogma.close();
	}

}
