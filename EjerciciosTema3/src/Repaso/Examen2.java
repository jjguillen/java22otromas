package Repaso;

public class Examen2 {

	public static double factorial(int n) {
		int fact = 1;
		for(int i=1; i<=n; i++)
			fact *= i;
		
		return fact;
	}
	
	public static void main(String[] args) {
		
		//ln(x+1)
		//Sumatorio ((-1) elevado a (i+1)) / (i!)  * (X elevado n)
		//Pare cuando la diferencia entre un sumando y el anterior sea menor a 0.00001
		
		//Probar con x entre -0.9999 y 0.99999
		double x = 0.5;
		double totalAnterior = 0;
		double total = 0;
		double diferencia = 10;
		
		int i=1;
		do {
			total += (Math.pow((-1),i+1) / factorial(i)) * Math.pow(x, i);
			diferencia = (total - totalAnterior);
			
			totalAnterior = total;			
			i++;
			
		} while (Math.abs(diferencia) > 0.0001);
		
		System.out.println(total);
		
		

	}

}
