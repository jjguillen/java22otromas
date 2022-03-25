package ejersT2;


public class Prueba {

	public static void main(String[] args) {

		//Pasar un número dado como cadena a su representación como entero
		String numero = "50";
		int numInt=0;
		int a=5, b=0;
		
		try {
			numInt = Integer.parseInt(numero);
			System.out.println(a/b);
			
		} catch (NumberFormatException ex) {
			System.out.println("La cadena no corresponde a un número ");
		} catch (ArithmeticException ex) {
			System.out.println("División por cero " + ex);
		} catch (Exception ex) {
			System.out.println("Ha habido un error, pero no sé cual");
		}
		
		System.out.println(numInt);
		
		//Pasar un número dado como entero a su representación como cadena
		String cadenaNum = Integer.toString(numInt);
		System.out.println(cadenaNum);
		
		
		
	}

}
