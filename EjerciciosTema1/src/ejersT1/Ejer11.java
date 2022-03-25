package ejersT1;

public class Ejer11 {

	
	public static void main(String [] args)
	{
		
		final double PI = 3.1614; //Constante 
		double radio=3.6;
		double area=0,perimetro=0;
		

		perimetro = 2 * Math.PI * radio;
		area = Math.PI * Math.pow(radio, 2);
		System.out.println("Area=" + area + " Perimetro="+perimetro);
		
		
	}
}
