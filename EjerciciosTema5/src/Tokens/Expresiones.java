package Tokens;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expresiones {

	public static void main(String[] args) {
		
		//Cadena que empieza por abc
		Pattern patron = Pattern.compile("^abc.*.d");
		Matcher m = patron.matcher("abcd1rtyd");
		if (m.matches()) {
			System.out.println("Cadena válida");
		} else {
			System.out.println("La cadena no coincide");
		}
		
		//Cadena que no empieza por dígito
		Pattern patron2 = Pattern.compile("^[^\\d].*");
		m = patron2.matcher("abcd1rtyd");
		if (m.matches()) {
			System.out.println("Cadena válida");
		} else {
			System.out.println("La cadena no coincide");
		}
		
		//Busca una cadena en otra, todas las apariciones
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce patrón a buscar");
		Pattern pat = Pattern.compile(sc.nextLine());
		System.out.println("Introduce cadena donde buscar el patrón");
		Matcher mat = pat.matcher(sc.nextLine());
		while (mat.find()) {
			System.out.println(mat.group()+" I:"+mat.start()+" F:"+mat.end());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
