package ejersT1;

public class Ejer15 {

	
	public static void main(String [] args)
	{
		double intereses,hacienda;
		
		intereses = ((2000) * (2.75 / 100)) / 2;
		hacienda = intereses * 18 / 100;
		
		System.out.println("Me queda " + (intereses - hacienda) + "€");
		
		//System.out.println( (((2000) * (2.75 / 100)) / 2) - (((2000) * (2.75 / 100)) / 2 * 18 / 100) );
		
	}
}
