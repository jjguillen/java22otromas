package PrimeVideos;

public class ClientePrimePro extends Cliente {
	static final double precioMes = 5;

	public ClientePrimePro() {
		super();
		this.precioMensual = precioMes;
	}

	/**
	 * @param dni
	 * @param nombre
	 * @param email
	 */
	public ClientePrimePro(String dni, String nombre, String email) {
		super(dni, nombre, email);
		this.precioMensual = precioMes;
	}

	@Override
	public double getPrecioMensual() {
		return precioMes;
	}

	@Override
	public boolean esPro() {
		return true;
	}

}
