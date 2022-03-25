package EjerciciosClase;

import java.sql.Date;

public class Burbuja {

	public static void pintar(int vector[]) {
		for(int i=0; i<vector.length; i++)
			System.out.print(vector[i]+" ");
		
		System.out.println();
	}
	
	public static void burbuja(int vector[]) {
		int aux=0;
		for(int i=0; i<vector.length; i++) {
			for(int j=0; j<vector.length-1; j++) {
				if (vector[j] > vector[j+1]) {
					aux = vector[j];
					vector[j] = vector[j+1];
					vector[j+1] = aux;
				}
			}
		}		
	}
	
	public static void burbujaMejorada(int vector[]) {
		int aux=0;
		for(int i=vector.length; i>0; i--) {
			for(int j=0; j<i-1; j++) {
				if (vector[j] > vector[j+1]) {
					aux = vector[j];
					vector[j] = vector[j+1];
					vector[j+1] = aux;
				}
			}
		}		
	}
	
	
	public static void main(String[] args) {
		
		
		int vector[] = new int[1000];
		for(int i=0; i<vector.length; i++)
			vector[i] = (int) (Math.random() * 1000) + 1;

		pintar(vector);
		long tiempo = System.currentTimeMillis();
		burbujaMejorada(vector);
		tiempo = System.currentTimeMillis() - tiempo;
		System.out.println(tiempo);
		//pintar(vector);
		
	}

}
