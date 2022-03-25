package ejemplosClase;

public class Envoltorio {

	public static void main(String[] args) {
		double numero = 55.5;

		Double numeroObj = numero;
		System.out.println(numeroObj.intValue());
		System.out.println(numeroObj.floatValue());
		
		double numeroString = Double.parseDouble("55.95");
		
		
		Double numeroObj2 = Double.valueOf("55.95");
		System.out.println(numeroObj2.floatValue());
		
	}

}
