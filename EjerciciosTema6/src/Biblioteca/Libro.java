package Biblioteca;

public class Libro extends Documento {

	private int anioPublicacion;

	public Libro(String titulo, String codigo, int anio) {
		super(titulo, codigo);
		this.anioPublicacion = anio;
	}

	/**
	 * @return the anioPublicacion
	 */
	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Libro [anioPublicacion=");
		builder.append(anioPublicacion);
		builder.append(", titulo=");
		builder.append(titulo);
		builder.append(", codigo=");
		builder.append(codigo);
		builder.append(", prestadoA=");
		builder.append(prestadoA);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
