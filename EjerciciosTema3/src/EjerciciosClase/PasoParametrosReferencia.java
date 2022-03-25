package EjerciciosClase;

public class PasoParametrosReferencia {

			
		//Funciona con objetos mutables StringBuffer, ...
		public static void modificarStringBuffer(StringBuffer cad) {
			cad.append(" ... fin");
			System.out.println("Dentro del método "+cad);
		}
		
		//Funciona con arrays
		public static void modificarArray(int vector[]) {
			vector[0] = 0;
		}
		
		
		public static void main(String[] args) {
		
			
			StringBuffer cadena = new StringBuffer("Inicio ");
			modificarStringBuffer(cadena);
			System.out.println("En el main "+cadena);
			
			int array[] = new int[10];
			array[0] = 100;
			modificarArray(array);
			System.out.println(array[0]);

		}

}
