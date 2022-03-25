package ejersClase;

public class TaxiElectrico extends Taxi {

	public TaxiElectrico(String matricula, String modelo, String numLicencia) {
		super(matricula, modelo, numLicencia);
	}
	
	public void mensaje() {
		System.out.println("Estoy en Taxi Electrico");
	}
	

}
