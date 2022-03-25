package ejersT3;

public class Ejer4String {

	public static String sustituir(String cadena, String sub, String subSust) {
		StringBuffer resultado = new StringBuffer(); 
		
		int posicion=0; //A partir de donde lo encuentra
		int encontrado=0; //Posición donde encuentra la cadena
		
		while(encontrado >=0) {
		
			encontrado = cadena.indexOf(sub, posicion); //Busca sub en cadena
			
			if(encontrado >= 0) {
				resultado.append(cadena.substring(posicion, encontrado));
				resultado.append(subSust);
				posicion = encontrado + sub.length();				
			}
			
		}
		
		return resultado.toString();
	}
	
	public static void main(String[] args) {
		String cadena = "A mi amiga le gusta la amiga de tu amiga";
		String sust = "amiga";
		
		System.out.println(cadena.replace(sust, sust.toUpperCase()));

		System.out.println(sustituir(cadena,"amiga", "AMIGA"));
	}

}
