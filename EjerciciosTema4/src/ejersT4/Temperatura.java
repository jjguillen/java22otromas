package ejersT4;

public class Temperatura {

	/*
	 *	En esta clase no es necesario almacenar ninguna propiedad puesto que convierte la temperatura que se le pasa
	 *	al otro tipo de temperatura usando las fórmulas 
	 * 
	 */
	
	
	/*
	 * Convierte la temperatura pasada como Celsius a su correspondiente en Farenheit
	 */
	public static double celsiusToFarenheit(double celsius) {	
		return (celsius * 1.8 + 32);
	}
	
	/* 
	 * Convierte la temperatura pasada como Farenheit a su correspondiente en Celsius
	 */
	public static double farenheitToCelsius(double farenheit) {
		return (farenheit - 32) / 1.8;
	}
	
	
}
