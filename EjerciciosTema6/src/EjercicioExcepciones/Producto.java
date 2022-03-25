package EjercicioExcepciones;

import java.util.Objects;

public class Producto {

	protected String nombre;
	protected double precio;
	protected String descripcion;
	protected int stockActual;
	protected int stockMinimo;
	
	public Producto(String nombre, double precio, String descripcion, int stockActual, int stockMinimo) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
		this.stockActual = stockActual;
		this.stockMinimo = stockMinimo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the stockActual
	 */
	public int getStockActual() {
		return stockActual;
	}

	/**
	 * @param stockActual the stockActual to set
	 */
	public void setStockActual(int stockActual) {
		this.stockActual = stockActual;
	}

	/**
	 * @return the stockMinimo
	 */
	public int getStockMinimo() {
		return stockMinimo;
	}

	/**
	 * @param stockMinimo the stockMinimo to set
	 */
	public void setStockMinimo(int stockMinimo) {
		this.stockMinimo = stockMinimo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Producto [nombre=");
		builder.append(nombre);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append(", stockActual=");
		builder.append(stockActual);
		builder.append(", stockMinimo=");
		builder.append(stockMinimo);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	
	
	
	
}
