package ejersT4;

public class TestPeso {

	public static void main(String[] args) {
		Peso miPeso = new Peso("K",75);

		System.out.println("Mi peso en Kilogramos = " + miPeso.getKilogramos());
		System.out.println("Mi peso en Lingotes = " + miPeso.getPeso("Li"));
		System.out.println("Mi peso en Gramos = " + miPeso.getPeso("G"));
		System.out.println("Mi peso en Onzas = " + miPeso.getPeso("Oz"));
		System.out.println("Mi peso en Peniques = " + miPeso.getPeso("P"));
		

	}

}
