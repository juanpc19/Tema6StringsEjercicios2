package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		String codigo = "";

		String codigoSinComentario = "";

		int posInicio = 0;

		int posFinal = 0;
		
		int nuevaPosInicio = 0;

		int nuevaPosFinal = 0;
		
		String cadenaExtraida="";

		Scanner dogma = new Scanner(System.in);

		System.out.println("Introduzca su codigo: ");

		codigo = dogma.nextLine();

		posInicio = 0;

		posFinal = codigo.indexOf("/*");
		
		codigoSinComentario += codigo.substring(posInicio, posFinal);
		
		while (posInicio < codigo.length() && posFinal < codigo.length()) {
			
			
			posInicio = codigo.indexOf("*/", posFinal);

			posFinal = codigo.indexOf("/*", posFinal+2);
			
			if (posInicio < codigo.length() && posFinal < codigo.length()) {
			codigoSinComentario += codigo.substring(posInicio+2, posFinal);
			}
		}
		
		System.out.println(codigoSinComentario);

	}

}
