package EjerciciosClase;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int acumulador=0;
		for(int i=0; i<=1000; i++) {
			if (i%2 != 0) { //Solo sumu los impares
				acumulador += i;
			}
		}
		System.out.println(acumulador);
		
		int h=10;
		int k=500;
		
		for(int i=h; i <= k; i++) {
			if (i%5==0) {
				System.out.println(i);
			}
		}
		
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				System.out.println(i+"x"+j+"="+(i*j));
			}
			System.out.println();
		}
		
		
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				if (i == j) { 
					System.out.print("1");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
		
		int n=5;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i; j++) {
				System.out.print("-");
			}
			System.out.println();
		}
		
		
		
	}

}
