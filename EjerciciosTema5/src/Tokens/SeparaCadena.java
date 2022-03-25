package Tokens;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class SeparaCadena {

	
	public static void main(String[] args) {
		
		ArrayList<String> juegos = new ArrayList<>();
		
		String cadena = "cod2.lol.fornite.csgo.fifa22.minecraft";
		StringTokenizer separa = new StringTokenizer(cadena, ".");
		while(separa.hasMoreTokens()) {
			String cad = separa.nextToken().trim();
			System.out.println(cad);
			juegos.add(cad);
		}
		
		System.out.println(juegos);
	}
	
}
