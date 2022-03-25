package ejersT3;

public class Ejer2StringBuilder {

	public static void main(String[] args) {
		String cadena = "hola"; //holaloh
		
		//hol
		StringBuilder sb = new StringBuilder(cadena.substring(0,cadena.length()-1));
		
		StringBuilder sb2 = new StringBuilder("");
		sb2.append(cadena); //hola
		sb2.append(sb.reverse()); // + loh = holaloh
		
		System.out.println(sb2);
		
		
		for(int i=0; i<sb2.length(); i++) {
			System.out.println(sb2.charAt(i));
		}
	}

}
