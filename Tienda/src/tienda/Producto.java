package tienda;

import java.util.Objects;

public class Producto {

	private String codigo;
	private String nombre;
	private String descripcion;
	private Categoria categoria;
	private double precio;
	private double iva; //10% sería 1.10
	
	public Producto(String nombre, String descripcion, Categoria categoria, double precio, double iva) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.precio = precio;
		this.iva = iva;
		
		//Generar código, con los cuatro primeros caracteres del nombre
		//y cuatro dígitos aleatorios del 0 al 9
		this.codigo = this.nombre.substring(0, 4)+"-";
		for(int i=0; i<4; i++)
			this.codigo += ((int)(Math.random()*9)) + 1;
		
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
	 * @return the categoria
	 */
	public Categoria getCategoria() {
		return categoria;
	}



	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
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
	 * @return the iva
	 */
	public double getIva() {
		return iva;
	}



	/**
	 * @param iva the iva to set
	 */
	public void setIva(double iva) {
		this.iva = iva;
	}



	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Producto [codigo=");
		builder.append(codigo);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append(", categoria=");
		builder.append(categoria);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", iva=");
		builder.append(iva);
		builder.append("]");
		return builder.toString();
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
		Producto other = (Producto) obj;
		return Objects.equals(codigo, other.codigo);
	}
	
	
	
	
	
	
	
	
}
