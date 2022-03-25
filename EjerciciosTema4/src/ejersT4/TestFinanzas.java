package ejersT4;

public class TestFinanzas {

	public static void main(String[] args) {
		
		Finanzas fis = new Finanzas();
		System.out.println(fis.dolaresToEuros(100));
		System.out.println(fis.eurosToDolares(fis.dolaresToEuros(200)));

	}

}
