package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		String frase;// guardara la frase introducida por el usuario

		String fraseDivididaPalabras[] = new String[0];// guardara las palabras de la frase , lo inicializo con longitud
														// 0 y el metodo split le dara la longitud necesaria

		String espacio = " ";// guardara el valor a usar en el metodo split, la inicializo con espacio en
								// blanco para uso en metodo split

		String palabraPosTemporal;// guardara la palabra que esta guardada en la posicion actual del array
									// fraseDivididaPalabras

		char letraEnMinuscula;// guardara primera letra de cada palabra

		char letraEnMayuscula;// guardara primera letra de cada palabra ya convertida en mayuscula

		// creo escaner y lo nombro dogma
		Scanner dogma = new Scanner(System.in);

		// solicito a usuario que introduzca frase con mensaje por pantalla
		System.out.println("Introduzca su frase: ");

		// doy a frase valor introducido por usuario con escaner
		frase = dogma.nextLine();

		// paso la frase a minusculas
		frase = frase.toLowerCase();

		// divido la frase en palabras separadas por espacios en blanco y las voy
		// guardando en el array fraseDivididaPalabras, el metodo spli ira creando las
		// posiciones necesarias
		fraseDivididaPalabras = frase.split(espacio);

		// bucle que recorrera el array fraseDivididaPalabras a excepcion de la primera
		// palabra
		// (cuya primera letra no necesita ser pasada a mayuscula)
		// convirtiendo la primera letra de sus palabras en mayuscula
		for (int i = 1; i < fraseDivididaPalabras.length; i++) {

			// doy a palabraPosTemporal el valor de la cadena del array
			// fraseDivididaPalabras en posicion i
			palabraPosTemporal = fraseDivididaPalabras[i];

			// doy a letraEnMinuscula el valor del primer caracter de la cadena
			// palabraPosTemporal
			letraEnMinuscula = palabraPosTemporal.charAt(0);

			// doy a letraEnMayuscula valor de letraEnMinuscula pasado a mayuscula usando el
			// metodo Character.toUpperCase que pasa un char de minuscula a mayuscula
			letraEnMayuscula = Character.toUpperCase(letraEnMinuscula);

			// reemplazo letraEnMinuscula por letraEnMayuscula
			// (ambas en posicion charAt(0), o sea, primera letra)
			// en cadena palabraPosTemporal
			palabraPosTemporal = palabraPosTemporal.replace(letraEnMinuscula, letraEnMayuscula);

			// sobreescribo la cadena contenida en array fraseDivididaPalabras posicion i
			// con valor de cadena palabraPosTemporal, o lo que es lo mismo, cambio la
			// palabra cuya inicial es minuscula por la palaba cuya inicial es mayuscula
			fraseDivididaPalabras[i] = palabraPosTemporal;

			// lo siguiente era un planteamiento sin el metodo Character.toUpperCase
			// guardo primera letra de palabra en variable char letraEnMinuscula
			// letraEnMinuscula = palabraPosTemporal.charAt(0);
			// la añado a String letraEnMayuscula2
			// letraEnMayuscula2 += letraEnMinuscula;
			// la paso a mayuscula
			// letraEnMayuscula2 = letraEnMayuscula2.toUpperCase();
			// la paso a char otra vez
			// letraEnMayuscula=letraEnMayuscula2.charAt(0);
			// problema con no coger la primera letra de la siguientes palabras
		}

		// bucle que recorrera el array fraseDivididaPalabras dando a auxiliar el valor
		// del elemento en la posicion actual mostrando todas las palabras que conforman
		// la frase original
		for (String auxiliar : fraseDivididaPalabras) {
			// print por pantalla en misma linea de auxiliar
			System.out.print(auxiliar);
		}

		// cierro escaner
		dogma.close();
	}

}
