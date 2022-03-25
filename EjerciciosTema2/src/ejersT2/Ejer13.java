package ejersT2;

public class Ejer13 {

	public static void main(String[] args) {
		int n=5;
		
		for(int i=1; i<=n; i++) {

			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i=1; i<=n; i++) {
			//Espacios
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			
			//Asteriscos
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			//Cambio de linea
			System.out.println();
		}
		
		for(int i=1; i<=n; i++) {
			//Espacios
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			
			//Asteriscos
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			//Asteriscos
			for(int j=1; j<=i-1; j++) {
				System.out.print("*");
			}
			
			
			//Cambio de linea
			System.out.println();
		}
		

	}

}
