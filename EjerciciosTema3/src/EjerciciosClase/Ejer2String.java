package EjerciciosClase;

public class Ejer2String {

	public static void main(String[] args) {
		
		String cadena = "https://www.iesjaroso.es/noticias";
		//https, www.iesjaroso.es, noticias
		
		//Sacar un substring para cada a buscar, pasando los índices de forma automática
		System.out.println(cadena.substring(0, 5));
		System.out.println(cadena.substring(8, 24));
		System.out.println(cadena.substring(25, 33));
		
		System.out.println(cadena.substring(cadena.indexOf("https"), 5));
		System.out.println(cadena.substring(cadena.indexOf("www.iesjaroso.es"), 24));
		System.out.println(cadena.substring(cadena.indexOf("noticias"), 33));
		
		System.out.println(cadena.substring(cadena.indexOf("https"), cadena.indexOf("https") + "https".length()));
		System.out.println(cadena.substring(cadena.indexOf("www.iesjaroso.es"), cadena.indexOf("www.iesjaroso.es") + "www.iesjaroso.es".length()));
		System.out.println(cadena.substring(cadena.indexOf("noticias"), cadena.indexOf("noticias") + "noticias".length()));

		
	}

}
