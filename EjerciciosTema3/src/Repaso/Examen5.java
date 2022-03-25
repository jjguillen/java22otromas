package Repaso;

import java.util.Arrays;

public class Examen5 {

		
		public static int busqueda(int[]vector, int x) {
			int i=0;
			int j=vector.length-1;
			int mid=0;
			while(i <= j){
				mid=i+(j-i)/2;

				if (vector[mid]==x) 
					return mid;
				
				if (vector[mid]<x) 
					i=mid+1;
				
				if(vector[mid]>x) 
					j=mid-1;
				
			}
			return -1;

		}
		
		
		public static void pintar(int vector[]) {
			for(int i=0; i<vector.length; i++)
				System.out.print(vector[i]+" ");
			System.out.println();
		}
		
		public static void main(String[] args) {
			int vector[] = new int[20];
			
			for(int i=0; i<vector.length; i++) {
				vector[i] = (int) (Math.random() * 20) + 1;
			}
			
			pintar(vector);
			
			Arrays.sort(vector);
			
			pintar(vector);
			
			System.out.println("La posición del elemento buscado es " + busqueda(vector,15));
			
		}
		
	

}
