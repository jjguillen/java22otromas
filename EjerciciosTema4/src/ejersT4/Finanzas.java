package ejersT4;

public class Finanzas {

	private double cambioDolarEuro;
	
	public Finanzas() {
		this.cambioDolarEuro = 1.36;
	}

	public Finanzas(double cambioDolarEuro) {
		super();
		this.cambioDolarEuro = cambioDolarEuro;
	}

	public double getCambioDolarEuro() {
		return cambioDolarEuro;
	}

	public void setCambioDolarEuro(double cambioDolarEuro) {
		this.cambioDolarEuro = cambioDolarEuro;
	}
	
	public double dolaresToEuros(double dolares) {
		return dolares * this.cambioDolarEuro;
	}
	
	public double eurosToDolares(double euros) {
		return euros / this.cambioDolarEuro;
	}
	
}
