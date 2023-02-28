package ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {

		String codigo = "<!DOCTYPE html>\r\n"// guardara el codigo html dado
				+ "<hotmail>\r\n" + "<body>\r\n" + "<h1></h1>\r\n" + "<p></p>\r\n" + "</body>\r\n" + "</hotmail>";

		int posicionEncontrada;// guardara posicion devuelta por metodo indexOf

		String cadenaTemporalMitad1 = "";// guardara el codigo hasta posicion de insercion de contenidoH1 o contenidoP

		String cadenaTemporalMitad2 = "";// guardara el codigo desde posicion despues de insercion de contenidoH1 o
											// contenidoP hasta final de codigo

		String contenidoH1 = "Titulo";// guardara codigo a insertar en etiqueta h1

		String contenidoP = "Parrafada aleatoria de turno";// guardara codigo a insertar en etiqueta p

		// doy a posicionEncontrada valor igual al devuelto por el metodo indexOf al
		// realizar busqueda de etiqueta de apertura de h1
		posicionEncontrada = codigo.indexOf("<h1>");

		// doy a cadenaTemporalMitad1 valor de codigo desde su principio hasta la
		// posicion en la que encuentra a la etiqueta de apertura de h1 mas la longitud
		// de la misma para incluirla tambien
		cadenaTemporalMitad1 = codigo.substring(0, posicionEncontrada += "<h1>".length());

		// reutilizo posicionEncontrada y le doy a posicionEncontrada valor igual al
		// devuelto por metodo indexOf al realizar busqueda de etiqueta de cierre de h1
		posicionEncontrada = codigo.indexOf("</h1>");

		// doy a cadenaTemporalMitad2 valor de codigo desde posicion en la que encuentra
		// a la etiqueta de cierre de h1 hasta final del codigo
		cadenaTemporalMitad2 = codigo.substring(posicionEncontrada);

		// machaco valor de codigo dandole el valor de cadenaTemporalMitad1
		codigo = cadenaTemporalMitad1;

		// añado valor de contenidoH1 a codigo
		codigo += contenidoH1;

		// añado valor de cadenaTemporalMitad2 a codigo
		codigo += cadenaTemporalMitad2;

		// realizo el mismo procedimiento sustituyendo las subcadenas usadas en las
		// busquedas <h1> por <p> y </h1> por </p>

		posicionEncontrada = codigo.indexOf("<p>");

		cadenaTemporalMitad1 = codigo.substring(0, posicionEncontrada += "<p>".length());

		posicionEncontrada = codigo.indexOf("</p>");

		cadenaTemporalMitad2 = codigo.substring(posicionEncontrada);

		codigo = cadenaTemporalMitad1;

		codigo += contenidoP;

		codigo += cadenaTemporalMitad2;

		// muestro el nuevo codigo con contenido añadido a etiquetas por pantalla
		System.out.println(codigo);

	}

}
