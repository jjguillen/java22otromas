package EjercicioExcepciones;

import java.util.ArrayList;

public class Almacen {

	protected String nombre;
	protected ArrayList<Producto> productos;
	
	public Almacen(String nombre) {
		super();
		this.nombre = nombre;
		this.productos = new ArrayList<>();
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
	
	public void informeStock() {
		for(Producto p: productos) {
			System.out.println("El producto "+p.getNombre()+" tiene "+p.getStockActual());
		}
	}
	
	public void nuevoProducto(Producto p) {
		productos.add(p);
	}
	
	public void quitarProducto(Producto p) {
		productos.remove(p);
	}
	
	public void pedirProducto(Producto p, int cantidad) throws ProductoSinExistenciasException {
		int indice = this.productos.indexOf(p);
		if (indice >= 0) { //Está el producto
			Producto prod = this.productos.get(indice);
			if ( (prod.getStockActual() - cantidad) < prod.getStockMinimo() ) {
				throw new ProductoSinExistenciasException("No se puede comprar, "
						+ "nos quedaríamos por debajo del stock mínimo de ese producto");
			} else {
				prod.setStockActual(prod.getStockActual() - cantidad);
				System.out.println("Pedido realizado");
			}
		} else {
			System.out.println("El producto no está en el almacén");
		}
		
	}
	
	
	
}
