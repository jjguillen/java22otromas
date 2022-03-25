package PrimeVideos;

public class Pelicula extends Multimedia {
	protected int duracion;

	/**
	 * @param titulo
	 * @param plus
	 * @param precio
	 * @param duracion
	 */
	public Pelicula(String titulo, boolean plus, double precio, int duracion) {
		super(titulo, plus, precio);
		this.duracion = duracion;
	}

	/**
	 * @return the duracion
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Pelicula [duracion=" + duracion + ", codigo=" + codigo + ", titulo=" + titulo + ", plus=" + plus
				+ ", precio=" + precio + ", genero=" + genero + "]";
	}

}
