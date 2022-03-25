package PrimeVideos;

import java.util.Objects;

public class Multimedia {
	protected static int contador = 100;

	protected long codigo;
	protected String titulo;
	protected boolean plus;
	protected double precio;
	protected Genero genero;

	public Multimedia() {
		this.codigo = contador;
		this.titulo = "";
		this.plus = false;
		this.precio = 0;
		this.genero = Genero.ACCION;
		contador++;
	}

	public Multimedia(String titulo, boolean plus, double precio) {
		super();
		this.titulo = titulo;
		this.plus = plus;
		this.precio = precio;
		this.codigo = contador;
		this.genero = Genero.ACCION;
		contador++;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the plus
	 */
	public boolean isPlus() {
		return plus;
	}

	/**
	 * @param plus the plus to set
	 */
	public void setPlus(boolean plus) {
		this.plus = plus;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @return the genero
	 */
	public Genero getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	/**
	 * @return the codigo
	 */
	public long getCodigo() {
		return codigo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Multimedia other = (Multimedia) obj;
		return codigo == other.codigo;
	}

	@Override
	public String toString() {
		return "Multimedia [codigo=" + codigo + ", titulo=" + titulo + ", plus=" + plus + ", precio=" + precio
				+ ", genero=" + genero + "]";
	}

}
