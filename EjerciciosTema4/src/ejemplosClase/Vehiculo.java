package ejemplosClase;

public class Vehiculo {
	
	//Propiedades
	int numRuedas;
	String color;
	int puertas;
	int caballos;
	int longitud;
	
	//Constructores
	public Vehiculo() {
		this.numRuedas = 4;
		this.color = "rojo";
		this.puertas = 2;
		this.caballos = 120;
		this.longitud = 521;		
	}
	
	public Vehiculo(int numRuedas, String color, int puertas, int caballos, int longitud) {
		super();
		this.numRuedas = numRuedas;
		this.color = color;
		this.puertas = puertas;
		this.caballos = caballos;
		this.longitud = longitud;
	}
	
	//Métodos
	public boolean peligroso() {
		if ((this.numRuedas == 4) && (this.caballos > 180))
			return true;
		if ((this.numRuedas == 2) && (this.caballos > 100))
			return true;
		
		return false;
	}

	@Override
	public String toString() {
		return "Vehiculo [numRuedas=" + numRuedas + ", color=" + color + ", puertas=" + puertas + ", caballos="
				+ caballos + ", longitud=" + longitud + "]";
	}

	public static void main(String[] args) {
		Vehiculo coche = new Vehiculo();
		Vehiculo moto1 = new Vehiculo(2,"azul",0,101,200);
		Vehiculo moto2 = new Vehiculo(2,"azul",0,77,200);
		Vehiculo sidecar = new Vehiculo(3,"verde",1,70,210);
		
		System.out.println(coche);
		System.out.println(moto1);
		System.out.println(sidecar);
		
		System.out.println(moto1.peligroso());
		System.out.println(moto2.peligroso());
		
	}
}
