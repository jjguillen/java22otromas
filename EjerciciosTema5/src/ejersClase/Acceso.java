package ejersClase;

public class Acceso {

	private String nombre;
	
	/**
	 * Constructor que dado un nombre lo almacena en mayúsculas
	 * @param n
	 */
	public Acceso(String n) {
		this.nombre = n;
		this.mayus();
	}
	
	/**
	 * Devuelve el nombre
	 * @return
	 */
	public String getNombre() {		
		return this.nombre;
	}
	
	private void mayus() {
		this.nombre = this.nombre.toUpperCase();
	}

	@Override
	public String toString() {
		return "Acceso [nombre=" + nombre + "]";
	}
	
	
}
