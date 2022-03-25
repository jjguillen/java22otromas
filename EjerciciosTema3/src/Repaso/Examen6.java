package Repaso;

import java.util.Arrays;

public class Examen6 {

	public static void pintar(int vector[]) {
		for(int i=0; i<vector.length; i++)
			System.out.print(vector[i]+" ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		

		int vector[] = new int[10];
		
		for(int i=0; i<vector.length; i++) {
			vector[i] = (int) (Math.random() * 10) + 1;
		}
		
		pintar(vector);
		
		int vectorCopiado[] = Arrays.copyOf(vector, vector.length);
		
		System.out.println(Arrays.toString(vectorCopiado));

	}

}
