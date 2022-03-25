package PrimeVideos;

public class ClientePrime extends Cliente {
	static final double precioMes = 3;

	public ClientePrime() {
		super();
		this.precioMensual = precioMes;
	}

	/**
	 * @param dni
	 * @param nombre
	 * @param email
	 */
	public ClientePrime(String dni, String nombre, String email) {
		super(dni, nombre, email);
		this.precioMensual = precioMes;
	}

	@Override
	public double getPrecioMensual() {
		return precioMes;
	}

	@Override
	public boolean esPro() {
		return false;
	}

}
