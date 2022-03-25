package EjerciciosClase;

public class PruebaString {

	public static void main(String[] args) {
		
		String mensaje = "Hola mundo";
		//Longitud de una cadena
		System.out.println("Longitud de la cadena " + mensaje.length());
		//Caracter en una posición de la cadena
		System.out.println("Caracter en la posición 2 " + mensaje.charAt(3)); //Empieza en 0
		//Encontrar posición de una subcadena en una cadena mayor
		System.out.println("Posición de la subcadena 'mu' "+ mensaje.indexOf("mu"));
		
		
		
		//Saber si una subcadena está dentro de una cadena
		String c1 = "En un lugar de la Mancha de cuyo nombre no quiero ...";
		String sub = "mancha";
		System.out.println(c1.indexOf(sub));
		if (c1.indexOf(sub) >= 0 ) {
			System.out.println("Si está");
		} else {
			//indexOf devuelve un número negativo
			System.out.println("No está");
		}
		
		//Comprobar si una subcadena está dentro de una cadena, obviando mayúsculas
		System.out.println(c1.indexOf(sub));
		if (c1.toLowerCase().indexOf(sub.toLowerCase()) >= 0 ) {
			System.out.println("Si está");
		} else {
			//indexOf devuelve un número negativo
			System.out.println("No está");
		}
		
		//Lo mismo de antes
		String minus = c1.toLowerCase();
		String subminus = sub.toLowerCase();
		if (minus.indexOf(subminus) >= 0) {
			System.out.println("Si está");
		} else {
			//indexOf devuelve un número negativo
			System.out.println("No está");
		}
		
		//Unir dos cadenas
		String nombre = "Javier";
		String apellidos = "Guillén Benavente";
		String nombreAPintar = nombre.concat(" ").concat(apellidos); //nombre + apellidos
		System.out.println(nombreAPintar);
		System.out.println(nombre + " " + apellidos);
		
		//Subcadena de una cadena
		String mensaje2 = "Me gusta mucho Java, cada vez más";
		//Sacar Java
		System.out.println(mensaje2.substring(15,19));
		int inicio = mensaje2.indexOf("mucho"); //15
		int fin = inicio + "mucho".length(); //15 + 4 = 19
		System.out.println(mensaje2.substring(inicio,fin)); //substring(15, 15 + 4)

		System.out.println(mensaje2.substring(mensaje2.indexOf("mucho"),mensaje2.indexOf("mucho") + "muchos".length()));
	
		//Quitar espacios
		String mensaje3 = "    Hola";
		System.out.println(mensaje3);
		System.out.println(mensaje3.trim());
		
		//Pasar de String a int
		int numero = Integer.parseInt("25");
		System.out.println(numero + 5);
		
		//Pasar de String a double
		double decimal = Double.parseDouble("34.95");
		System.out.println(decimal + 0.05);
		
		//Pasar de String a double
		double otroDecimal = Double.valueOf("34.95").doubleValue();
		System.out.println(decimal + 0.05);
		
		//Comparar cadenas con equals
		String cad1 = "Estoy ya frito";
		String cad2 = "Estoy ya frito";
		if (cad1.equals(cad2)) {  //NO USAR ==
			System.out.println("Son iguales");
		} else {
			System.out.println("son diferentes");
		}
		
		//Comparar alfabéticamente dos cadenas
		String ca1 = "Bircía";
		String ca2 = "Bernández";
		if (ca1.compareTo(ca2) == 0) { //ca1 es posterior alfabéticamente a ca2
			System.out.println("Iguales");	
		} else if (ca1.compareTo(ca2) < 0) { //Si ca1 es anterior lo pinto antes
			System.out.println("Menor alfabéticamente");
		} else if (ca1.compareTo(ca2) > 0) { //Si ca1 es posterior lo pinto después
			System.out.println("Mayor alfabéticamente");
		}
		
	}

}
