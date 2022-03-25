package EjerciciosClase;

import java.util.Scanner;

public class EjArrays {

	public static void pintarVector(int numeros[]) {
		//notas.length nos dice el tamaño del array --> notas.length = 10
		for(int i=0; i < numeros.length; i++) {
			System.out.print(numeros[i]+", ");
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		
		int notas[]; //Array de notas
		int numNotas=5; //Tamaño del array
		
		//Inicializar el array diciéndole el tamaño
		notas = new int[numNotas];
		
		//Scanner de teclado
		Scanner sc = new Scanner(System.in);
		
		try {
			for(int i=0; i<=notas.length-1; i++) {
				System.out.println("Dime una nota: ");
				int valor = sc.nextInt();
				
				//Meto el valor leído de teclado en el array
				notas[i] = valor;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		//Cerrar scanner
		sc.close();
		
		//Pinto el vector
		pintarVector(notas);
		
		//Calcular la nota media
		int total=0; //Donde guardo la suma
		for(int i=0; i<notas.length; i++) {
			total += notas[i]; //total = total + notas[i] 
		}
		
		System.out.println("La nota media es: "+(total/notas.length));
		
		

	}

}
