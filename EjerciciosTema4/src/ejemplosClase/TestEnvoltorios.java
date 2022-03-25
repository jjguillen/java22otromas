package ejemplosClase;

import java.util.Scanner;

public class TestEnvoltorios {

	public static void main(String[] args) {
		
		//Double precio = new Double(55.95);
		Double precio = 55.95;		
		double precioIva = precio * 1.21;
		
		Scanner sc = new Scanner(System.in);
		
		//El String que leo de teclado lo convierto a Double
		Double precio2 = Double.valueOf(sc.nextLine());
		int precioInt = precio2.intValue();
		System.out.println(precio2);
		
		//El String que leo de teclado lo convierto a double
		double precioSimple = Double.parseDouble(sc.nextLine()); 
		Double nuevo = precioSimple;


	}

}
