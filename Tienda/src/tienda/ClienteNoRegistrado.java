package tienda;

public class ClienteNoRegistrado extends Cliente {

	
	public ClienteNoRegistrado(Cliente unCliente) {
		super(unCliente);
	}

	public ClienteNoRegistrado(String nombre, String apellidos, String dni, String localidad, String direccion) {
		super(nombre, apellidos, dni, localidad, direccion);
	}

	@Override
	public double descuento() {
		return 0;
	}

	@Override
	public boolean checkPassword(String pass) {
		return false;
	}
	
	

}
