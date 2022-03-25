package ejersT4;

public class Conversor {

	private static double cambiomillaskms = 1.6;
	
	private double distanciaMillas;
	
	
	public Conversor() {
		this.distanciaMillas = 0;
	}


	public double getDistanciaMillas() {
		return distanciaMillas;
	}


	public void setDistanciaMillas(double distanciaMillas) {
		this.distanciaMillas = distanciaMillas;
	}


	public static double getCambiomillaskms() {
		return cambiomillaskms;
	}
	
	public double millasAMetros(double millas) {
		this.distanciaMillas = millas;
		return this.distanciaMillas*1000*Conversor.cambiomillaskms;
	}
	
	public double millasAKM(double millas) {
		this.distanciaMillas = millas;
		return this.distanciaMillas*Conversor.cambiomillaskms;
	}
	 
	
	
}

