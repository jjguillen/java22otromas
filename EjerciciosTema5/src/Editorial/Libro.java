package Editorial;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Libro extends Publicacion {

	private String isbn;
	private int numCapitulos;
	private ArrayList<Autor> autores;
	private Genero genero;
	
	
	
	public Libro(String titulo, String editorial, LocalDate fechaPublicacion, 
			int numPaginas, double precio, String isbn, int numCapitulos,
			Genero genero) {
		super(titulo, editorial, fechaPublicacion, numPaginas, precio);
		this.isbn = isbn;
		this.numCapitulos = numCapitulos;
		this.genero = genero;
		this.autores = new ArrayList<>();
	}



	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}



	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}



	/**
	 * @return the numCapitulos
	 */
	public int getNumCapitulos() {
		return numCapitulos;
	}



	/**
	 * @param numCapitulos the numCapitulos to set
	 */
	public void setNumCapitulos(int numCapitulos) {
		this.numCapitulos = numCapitulos;
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



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(isbn);
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(isbn, other.isbn);
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Libro [isbn=");
		builder.append(isbn);
		builder.append(", numCapitulos=");
		builder.append(numCapitulos);
		builder.append(", autores=");
		builder.append(autores);
		builder.append(", genero=");
		builder.append(genero);
		builder.append("]");
		return builder.toString();
	}

	
	public void addAutor(Autor a) {
		autores.add(a);
	}
	
	public void delAutor(Autor a) {
		//Si lo encuentro lo borro
		if (autores.indexOf(a) >= 0) {
			autores.remove(autores.indexOf(a));
		}
	}
	

	@Override
	protected ArrayList<Autor> getAutor() {
		return autores;
	}

}
