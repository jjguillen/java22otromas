package EjercicioExcepciones;

public class Test {

	public static void main(String[] args) {
		
		Almacen amazon = new Almacen("Sucursal Almería Amazon");
		amazon.nuevoProducto(new Producto("Samsung Galaxy s21", 1000, "Mu bonico", 100, 10));
		amazon.nuevoProducto(new Producto("Xiaomi Traca", 500, "Mu bonico", 50, 10));
		amazon.nuevoProducto(new Producto("Poco Yo", 200, "Mu bonico", 200, 20));
		amazon.nuevoProducto(new Producto("Aifone", 1300, "Mu bonico", 50, 10));
		amazon.nuevoProducto(new Producto("One Plus", 800, "Mu bonico", 50, 10));
		
		amazon.informeStock();
		
		try {
			amazon.pedirProducto(new Producto("Poco Yo",0,"",0,0), 181);
		} catch (ProductoSinExistenciasException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			amazon.pedirProducto(new Producto("Aifone",0,"",0,0), 20);
		} catch (ProductoSinExistenciasException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
