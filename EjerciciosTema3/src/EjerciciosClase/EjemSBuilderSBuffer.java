package EjerciciosClase;

import java.util.Scanner;

public class EjemSBuilderSBuffer {

	public static void main(String[] args) {
		
		//StringBuffer y StringBuilder
		
		StringBuilder sb = new StringBuilder();
		sb.append("Javier ");
		sb.append("Lati ");
		sb.append("Ana ");
		sb.append("Emilio ");
		
		System.out.println(sb.charAt(7));
		
		String cadena = sb.toString();
		
		System.out.println(cadena);
		
		
		//Leer de teclado - NO ES EFICIENTE
		Scanner sc = new Scanner(System.in);
		String cad = "";
		String resultado = "";
		do {		
			cad = sc.nextLine();
			resultado += cad;
		} while (!cad.equals("0"));
		
		System.out.println(resultado);
		
		//Leer de teclado con StringBuilder
		sc = new Scanner(System.in);
		StringBuilder resultadoSB = new StringBuilder();
		do {		
			cad = sc.nextLine();
			resultadoSB.append(cad);
		} while (!cad.equals("0"));
		
		System.out.println(resultadoSB);

	}

}
