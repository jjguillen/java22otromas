package ejersClase;

public class Taxi extends Vehiculo {
	
	private String numLicencia;

	public Taxi(String matricula, String modelo, String numLicencia) {
		super(matricula, modelo);
		this.numLicencia = numLicencia;
	}

	/**
	 * @return the numLicencia
	 */
	public String getNumLicencia() {
		return numLicencia;
	}

	/**
	 * @param numLicencia the numLicencia to set
	 */
	public void setNumLicencia(String numLicencia) {
		this.numLicencia = numLicencia;
	}
	
	public void mensaje() {
		System.out.println("Estoy en Taxi");
	}
	

}
