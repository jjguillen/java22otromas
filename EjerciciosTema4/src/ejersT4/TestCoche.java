package ejersT4;

public class TestCoche {

	public static void main(String[] args) {
		
		Coche.pintarNumeroCoches();
		
		Coche car = new Coche();
		car.setVelocidad(100);
		car.acelera(50);
		car.frena(20);
		car.acelera(100);

		System.out.println(car.getVelocidad());
		
		Coche bmw = new Coche();
		bmw.setVelocidad(200);
		
		Coche.pintarNumeroCoches();
		
	}
}
