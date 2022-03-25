package Ejercicios;

import java.util.Arrays;

public class Ejercicio5 {

	public static boolean pokerReal(int[] tirada) {
		if ( (tirada[0] == tirada[1]) && (tirada[0] == tirada[2]) && (tirada[0] == tirada[3]) 
				&& (tirada[0] == tirada[4]) )
			return true;
		else
			return false;
	}
	
	public static boolean poker(int[] tirada) {
		if ( ( (tirada[0] == tirada[1]) && (tirada[0] == tirada[2]) && (tirada[0] == tirada[3]) ) ||
		     ( (tirada[1] == tirada[2]) && (tirada[1] == tirada[3]) && (tirada[1] == tirada[4]) ) )
			return true;
		else
			return false;
	}
	
	public static boolean escaleraMayor(int[] tirada) {
		if (tirada[0] == 2 && tirada[1] == 3 && tirada[2] == 4 && tirada[3] == 5 && tirada[4] == 6) 
			return true;
		else
			return false;
	}
	
	public static boolean escaleraMenor(int[] tirada) {
		if (tirada[0] == 1 && tirada[1] == 2 && tirada[2] == 3 && tirada[3] == 4 && tirada[4] == 5)
			return true;
		else
			return false;
	}
	
	public static boolean piernas(int[] tirada) {
		//x,x,x,y,z  x,y,y,y,z  x,y,z,z,z
		
		if (tirada[0] == tirada[1] && tirada[1] == tirada[2]) 
			return true;
		if (tirada[1] == tirada[2] && tirada[2] == tirada[3]) 
			return true;
		if (tirada[2] == tirada[3] && tirada[3] == tirada[4]) 
			return true;
		
		return false;
	}
	
	public static boolean full(int[] tirada) {
		//x,x,x,y,y   y,y,z,z,z
		
		if (tirada[0] == tirada[1] && tirada[1] == tirada[2] && tirada[3] == tirada[4]) 
			return true;
		if (tirada[2] == tirada[3] && tirada[3] == tirada[4] && tirada[0] == tirada[1]) 
			return true;
			
		return false;
	}
	
	public static boolean paresDobles(int[] tirada) {
		//x,x,y,y,z  x,y,y,z,z  x,x,y,z,z
		
		if (tirada[0] == tirada[1] && tirada[2] == tirada[3]) 
			return true;
		if (tirada[1] == tirada[2] && tirada[3] == tirada[4]) 
			return true;
		if (tirada[0] == tirada[1] && tirada[3] == tirada[4]) 
			return true;
		
		return false;
	}
	
	public static boolean pares(int[] tirada) {
		//x,x,y,z,k  x,y,y,z,k  x,y,z,z,k  x,y,z,k,k
		//No hay que ver los distintos, habría entrado en los if-else anteriores
		
		if (tirada[0] == tirada[1] || tirada[1] == tirada[2] || tirada[2] == tirada[3] || tirada[3] == tirada[4]) 
			return true;
		
		return false;
	}
	
	public static void main(String[] args) {
		
		int[] tirada = new int[5];
		//Tiramos los datos
		for(int i=0; i<tirada.length; i++)
			tirada[i] = (int) (Math.random() * 6) + 1;
					
		//Ordenamos la tirada para facilitar comprobaciones
		Arrays.sort(tirada);
		
		//Pintamos la tirada
		for(int i=0; i<tirada.length; i++)
			System.out.print(tirada[i]+" ");

		//Chequeamos la tirada
		if (pokerReal(tirada)) {
			System.out.println("Póker real");
		} else if (poker(tirada)) {
			System.out.println("Póker");
		} else if (escaleraMayor(tirada)) {
			System.out.println("Escalera mayor");
		} else if (escaleraMenor(tirada)) {
			System.out.println("Escalera menor");
		} else if (full(tirada)) {
			System.out.println("Full");
		} else if (piernas(tirada)) {
			System.out.println("Piernas");
		} else if (paresDobles(tirada)) {
			System.out.println("Pares dobles");
		} else if (pares(tirada)) {
			System.out.println("Pares");
		}

	}

}
