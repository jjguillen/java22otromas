package ejersClase;

public class TestLibreria {

	public static void main(String[] args) {
		Libreria diegoMarin = new Libreria();
		
		Libro l1 = new Libro("1234567890","La sombra del viento","Patrick Rothfuss",500);
		diegoMarin.adquirir(l1, 19);
		diegoMarin.adquirir(new Libro("a234567890","Dune","Frank Herbert",600), 22);
		diegoMarin.adquirir(new Libro("b234567890","Fundación","Asimov",700), 21);
		
		diegoMarin.vender(l1, 25);
		diegoMarin.vender(new Libro("a234567890","","",600), 25);
		diegoMarin.vender(new Libro("b234567890","","",700), 30);
		System.out.println(diegoMarin);
		System.out.println(diegoMarin.ganancias());
		
	}

}
