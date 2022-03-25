package EjercicioExcepciones;

public class ProductoSinExistenciasException extends Exception {

	public ProductoSinExistenciasException(String message) {
		super(message);
	}

	public ProductoSinExistenciasException(String message, Throwable cause) {
		super(message, cause);
	}

}
