package Ejercicios;

public class Ejercicio1 {

	/**
	 * M�todo que calcula el factorial de un n�mero decimal
	 * @param num
	 * @return Lo multiplica por todos los n�meros menores que �l
	 */
	public static double factorial(double num) {
		double fact=1;
		
		if (num == 0)
			return 1;
		else {
			for(int i=1; i<=num; i++) {
				fact = fact * i;
			}
			return fact;
		}
	}
	
	/**
	 * Calcula el n�mero de Euler con una precisi�n de 0.00000000001
	 * @return
	 */
	public static double euler() {
		double euler;
		int veces=0;
		double sum1=0, sum2=0;
		
		do {
			sum2 = sum1;
			sum1 = 0;
			for(int i=0; i<=veces; i++) {
				sum1 += 1/factorial(i);
			}
			veces++;
			
			//System.out.println("s1 "+sum1);
			//System.out.println("s2 "+sum2);
		} while ((sum1 - sum2) > 0.00000000001);
		
		return sum1;
	}
	
	public static void main(String[] args) {
		
		System.out.println(euler());
		
	}

}
