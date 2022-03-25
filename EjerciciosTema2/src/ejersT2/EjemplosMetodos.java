package ejersT2;

public class EjemplosMetodos {

	/**
	 * Método que devuelve el mayor de tres números
	 * @param a
	 * @param b
	 * @param c
	 * @return el mayor entre a,b y c
	 */
	static int mayor(int a, int b, int c) {
		if ((a>=b) && (a>=c))
			return a;
		else if ((b>=a) && (b>=c))
			return b;
		else if ((c>=b) && (c>=a))
			return c;
		else
			return -1;
	}
	
	/**
	 * Devuelve el mayor de cuatro números
	 * @param a
	 * @param b
	 * @param c
	 * @param d
	 * @return
	 */
	static int mayorCuatro(int a, int b, int c, int d) {
		
		return mayor(mayor(a,b,c), mayor(b,c,d), mayor(a,b,d));
	}
	
	/**
	 * Devuelve el mayor de 5 números
	 * @param a
	 * @param b
	 * @param c
	 * @param d
	 * @param e
	 * @return
	 */
	static int mayorCinco(int a, int b, int c, int d, int e) {
		
		return mayor(mayor(a,b,c), mayor(b,c,d), mayor(c,d,e));
	}

	
	static void mensaje(String msn) {
		System.out.println("Buenos días " + msn);
	}
	
	
	public static void main(String[] args) {
		int a1=0,a2=0,a3=0;

		a1=6;
		a2=9;
		a3=1;
		
		int resultado = mayor(a1,a2,a3);
		System.out.println("El mayor es: " + resultado);
		System.out.println("El mayor es: " + mayor(2,3,5));
		System.out.println("El mayor es: " + mayorCuatro(-4,5,90,100));
		System.out.println("El mayor es: " + mayorCinco(-4,5,90,100,8));
		
		mensaje("Javier");
		mensaje("Lati");
	}
	
}
