package EjerciciosClase;

public class Ejer7String {

	public static String encriptar(String mensaje, int clave) {
		String resultado="";
		for(int i=0; i<mensaje.length();i++) {
			char c = (char) (mensaje.charAt(i) + clave);
			resultado += c;
		}
		
		return resultado;
	}
	
	public static String desencriptar(String mensaje, int clave) {
		String resultado="";
		for(int i=0; i<mensaje.length();i++) {
			char c = (char) (mensaje.charAt(i) - clave);
			resultado += c;
		}
		
		return resultado;
	}
	
	public static void main(String[] args) {
		
		String mensaje = "A ver cómo me levanto el día que ponga vuestro examen";
		int clave = 7;
		
		System.out.println(encriptar(mensaje, clave));
		System.out.println(desencriptar( encriptar(mensaje, clave) ,clave));

		String me = encriptar(mensaje, clave);
		String md = desencriptar(me, clave);
		
	}

}
