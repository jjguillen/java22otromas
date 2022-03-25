package ejersClase;

import java.util.ArrayList;

public class Libreria {

	private ArrayList<Libro> libros;
	
	
	public Libreria() {
		libros = new ArrayList<>(1000);
	}
	
	
	public void adquirir (Libro unLibro, double precioCompra) {
		unLibro.setPrecioCompra(precioCompra);
		libros.add(unLibro);
	}
	
	public void vender (Libro unLibro, double precioVenta) {
		//Hay que buscar el libro en la librería y ponerle el precio de venta
		for(Libro l: libros) {
			if (l.equals(unLibro)) {
				l.setPrecioVenta(precioVenta);
				l.setVendido(true);
			}
		}
		
		/*
		//Esta linea es lo mismo que las dos de abajo
		Libro l = libros.get(libros.indexOf(unLibro));
		
		int posicion = libros.indexOf(unLibro);
		Libro l = libros.get(posicion);
		
		l.setPrecioVenta(precioVenta);
		l.setVendido(true);
		*/
	}
	
	public double ganancias() {
		double total=0;
		for(Libro l : libros) {
			total += l.getPrecioVenta() - l.getPrecioCompra();
		}
		return total;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Libreria [libros=");
		builder.append(libros);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
