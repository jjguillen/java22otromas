package ejersClase;

import java.util.Objects;

public class Libro {

	//ISBN (de 10 dígitos), título, autor, número de páginas,
	//precio_compra, precio_venta, vendido (boolean)
	
	private String isbn;
	private String titulo;
	private String autor;
	private int numPaginas;
	private double precioCompra;
	private double precioVenta;
	private boolean vendido;
	
	public Libro(String isbn, String titulo, String autor, int numPaginas) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
		this.precioCompra = 0;
		this.precioVenta = 0;
		this.vendido = false;
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
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @return the numPaginas
	 */
	public int getNumPaginas() {
		return numPaginas;
	}

	/**
	 * @param numPaginas the numPaginas to set
	 */
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	/**
	 * @return the precioCompra
	 */
	public double getPrecioCompra() {
		return precioCompra;
	}

	/**
	 * @param precioCompra the precioCompra to set
	 */
	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	/**
	 * @return the precioVenta
	 */
	public double getPrecioVenta() {
		return precioVenta;
	}

	/**
	 * @param precioVenta the precioVenta to set
	 */
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	/**
	 * @return the vendido
	 */
	public boolean isVendido() {
		return vendido;
	}

	/**
	 * @param vendido the vendido to set
	 */
	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	@Override
	public String toString() {
		//El libro W con ISBN X creado por el autor Y tiene Z
		
		StringBuilder builder = new StringBuilder();
		builder.append("El libro ");
		builder.append(titulo);
		builder.append(" con ISBN ");
		builder.append(isbn);
		builder.append(" creado por el autor ");
		builder.append(autor);
		builder.append(" tiene ");
		builder.append(numPaginas);
		builder.append(" páginas.");
		if(this.vendido == true) {
			builder.append(" Se ha vendido por ");
			builder.append(precioVenta);
		}
		
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(isbn, other.isbn);
	}
	
	
	
	
	
	
	
}
