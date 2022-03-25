package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static double pedirGolosinas(String[][] golosinas, double[][] precio,
										double[][] cantidad, String posicion) {
		
		//Sacar la i,j de la posición
		int i = Character.getNumericValue(posicion.charAt(0));
		int j = Character.getNumericValue(posicion.charAt(1));
		
		//Si la i,j corresponde a coordenadas válidas resto cantidad y devuelvo precio
		if ( (i>=0 && i<=golosinas.length) && (j>=0 && j<=golosinas.length) ) {
			if (cantidad[i][j] > 0) {
				cantidad[i][j]--;
				return precio[i][j];
			} else {
				return -2; //No hay golosina
			}
		} else { //Coordenada no valida
			return -1;
		}
		
	}
	
	public static void rellenarGolosinas(double[][] cantidad, String posicion, int cant) {
		//Sacar la i,j de la posición
		int i = Character.getNumericValue(posicion.charAt(0));
		int j = Character.getNumericValue(posicion.charAt(1));
		
		cantidad[i][j] += cant;		
	}
	
	public static void pintarGolosinas(String[][] golosinas, double[][] precio) {
		//Igual a pintar matriz
		for(int i=0; i<golosinas.length; i++) {
			for(int j=0; j<golosinas[i].length; j++) {
				System.out.println(" "+i+j+" - " + golosinas[i][j]+" - "+precio[i][j] + "€" );
			}
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		String[][] nombresGolosinas = {
				{"KitKat", "Chicles fresa", "Lacasitos", "Palotes"},
				{"Kinder Bueno", "Haribo", "Chetoos", "Twix"},
				{"Risketos", "M&M'S", "Mars", "Chicles menta"},
				{"Doritos",	"Palomitas", "Gusanitos","Lays"} 
				};
		
		double[][] precio = {
				{1.1, 0.8, 1.5, 0.9},
				{1.8, 1, 1.2, 1},
				{1.8, 1.3, 1.2, 0.8},
				{1.5, 1.1, 1.1, 1.1}
				};
		
		double[][] cantidad = {
				{5, 5, 5, 5},
				{5, 5, 5, 5},
				{5, 5, 5, 5},
				{5, 5, 5, 5}
				};
		
		Scanner sc = new Scanner(System.in);
		
		//total ventas
		double ventas=0;
		
		//Menú
		int opcion=0;
		do {
			System.out.println("Introduce una opción:");
			System.out.println("1.Pedir golosina");
			System.out.println("2.Mostrar golosinas");
			System.out.println("3.Rellenar");
			System.out.println("4.Apagar");
			
			opcion = Integer.parseInt(sc.nextLine());
			
			switch (opcion) {
			case 1: {
				//Pedir por teclado
				System.out.println("Dame posición de la golosina");
				String posicion = sc.nextLine();
				
				double venta = pedirGolosinas(nombresGolosinas,precio,cantidad,posicion);
				if (venta == -1) {
					System.out.println("Golosina no encontrada");
				} else if (venta == -2 ) {
					System.out.println("No hay suficientes golosinas de esa que quieres");
				} else {
					ventas += venta; //Sumo a las ventas del día
				}
				break;
			}
			case 2: {
				pintarGolosinas(nombresGolosinas,precio);
				break;
			}
			case 3: {
				System.out.println("Dime contraseña del tío que rellena:");
				String password = sc.nextLine();
				if (password.equals("MaquinaExpendedora2017")) {
					System.out.println("Dame posición de la golosina");
					String posicion = sc.nextLine();
					System.out.println("Dame la cantidad a rellenar");
					int cant = Integer.parseInt(sc.nextLine());
					rellenarGolosinas(cantidad,posicion,cant);					
				} else {
					System.out.println("Contraseña incorrecta");
				}
				break;
			}
			case 4: {
				System.out.println("Ventas del día "+ventas);
				break;
			}

			default:
				throw new IllegalArgumentException("Opción incorrecta: " + opcion);
			};
			
			
		} while (opcion != 4);
		
		
		
		sc.close();
		
	}

}
