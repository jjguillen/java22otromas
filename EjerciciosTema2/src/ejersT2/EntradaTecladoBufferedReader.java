package ejersT2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntradaTecladoBufferedReader {

	public static void main(String[] args) {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Dime tu nombre:");
		String nombre="";
		try {
			nombre = bf.readLine();
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("Error leyendo de teclado");
		}
		System.out.println(nombre);
		
		
		System.out.println("Dime tu edad:");
		int edad=0;
		try {
			edad = Integer.parseInt(bf.readLine());
		} catch (NumberFormatException e) {
			System.out.println("No has introducido una edad válida");
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error leyendo de teclado");
		}
		System.out.println("Tu edad es "+ edad);

		
		System.out.println("Dime tu peso:");
		double peso=0;
		try {
			peso = Double.parseDouble(bf.readLine());
		} catch (NumberFormatException e) {
			System.out.println("No has introducido un peso válido");
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error leyendo de teclado");
		}
		System.out.println("Tu peso es "+ peso);
	}

}
