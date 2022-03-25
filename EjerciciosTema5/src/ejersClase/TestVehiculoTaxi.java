package ejersClase;

public class TestVehiculoTaxi {

	public static void main(String[] args) {
		
		Taxi mitaxi = new Taxi("9999GGG","Mercedes","1123123");	
		Vehiculo v = (Vehiculo) mitaxi;
		
		v.mensaje();
		
		
		
		TaxiElectrico te = new TaxiElectrico("aaa4","Toyota","112233");
		Vehiculo v2 = (Vehiculo) te;
		Taxi t2 = (Taxi) te;
		t2.mensaje();
		 
		
	}

}
