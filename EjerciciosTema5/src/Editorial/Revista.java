package Editorial;

import java.time.LocalDate;
import java.util.ArrayList;

public class Revista extends Publicacion {

	private int numero;
	private ArrayList<Articulo> articulos;
	private Tematica tematica;
	
	
	
	public Revista(String titulo, String editorial, LocalDate fechaPublicacion, 
			int numPaginas, double precio, int numero, Tematica tematica) {
		super(titulo, editorial, fechaPublicacion, numPaginas, precio);
		this.numero = numero;
		this.tematica = tematica;
		this.articulos = new ArrayList<>();
	}


	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}




	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}




	/**
	 * @return the tematica
	 */
	public Tematica getTematica() {
		return tematica;
	}




	/**
	 * @param tematica the tematica to set
	 */
	public void setTematica(Tematica tematica) {
		this.tematica = tematica;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Revista [numero=");
		builder.append(numero);
		builder.append(", articulos=\n");
		for(Articulo art: articulos)
			builder.append(art + "\n");
		//builder.append(articulos);
		builder.append(", tematica=");
		builder.append(tematica);
		builder.append("]");
		return builder.toString();
	}


	public void addArticulo(Articulo a) {
		this.articulos.add(a);
	}
	
	public void delArticulo(Articulo a) {
		if (this.articulos.indexOf(a) >= 0) {
			this.articulos.remove(this.articulos.indexOf(a));
		}
	}



	@Override
	protected ArrayList<Autor> getAutor() {
		//Añadimos a un ArrayList los autores de cada Articulo
		ArrayList<Autor> rAutores = new ArrayList<>();
		
		for(Articulo art : this.articulos) {
			rAutores.add(art.getAutor());
		}
		
		return rAutores;
	}

}
