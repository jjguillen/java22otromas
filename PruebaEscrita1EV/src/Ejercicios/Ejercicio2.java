package Ejercicios;


import java.util.Scanner;


	/** 
	 *
	 * @author Rubén la primera parte y sjgui la segunda parte
	 *
	 */
	public class Ejercicio2 {

		public static int buscarPalabra(String vector[], String palabra) {
			int posicion=-1;
			for (int i = 0; i < vector.length; i++) {
				if (palabra.compareTo(vector[i]) == 0)
					posicion = i;
			}
			
			return posicion;
		}
		

		public static void main(String[] args) {
			
			String spanish[] = {"casa", "árbol", "ordenador", "mesa", "ventana", "puerta", "muro", "escaleras", "cielo", "infierno", 
					"carretera", "trueno", "nada", "algo", "ratón", "cable", "función", "programa", "clase", "público"};

			String english[] = {"house", "tree", "computer", "table", "window", "door", "wall", "stairs", "heaven", "hell", 
					"highway", "thunder", "nothing", "something", "mouse", "wire", "function", "program", "class", "public"};
			
			// Desarrollamos el menú
			int opcion = 0;
			Scanner sc = new Scanner(System.in);
			
			do {
				
				// Mostramos menú
				System.out.println("\nElige opción:");
				System.out.println("1. ES a EN");
				System.out.println("2. EN a ES");
				System.out.println("3. Salir");
				
				//Leemos opción
				try {
					opcion = Integer.parseInt(sc.nextLine());
				} catch (NumberFormatException e) {
					System.out.println("Opción no válida.");
					continue; //Si hay error termina esta pasada del bucle y vuelve a mostrar el menú
				}
				
				switch (opcion) {
				
					case 1:
						
						String palabraS = "";
						System.out.println("Introduce una palabra en español:");
						try {
							palabraS = sc.nextLine();
						} catch (Exception e) {
							System.out.println("Opción no válida.");
							break; //Si hay error termina esta pasada del bucle y vuelve a mostrar el menú
						}
						
						int posicionS = buscarPalabra(spanish,palabraS);
						
						if (posicionS >=0)
							System.out.println("Su traducción al inglés es: " + english[posicionS].toUpperCase());
						else
							System.out.println("Palabra no encontrada.");
						
						break;
						
					case 2:
						
						String palabraE = "";
						System.out.println("Introduce una palabra en inglés:");
						try {
							palabraE = sc.nextLine();
						} catch (Exception e) {
							System.out.println("Opción no válida.");
							break; //Si hay error termina esta pasada del bucle y vuelve a mostrar el menú
						}
						
						int posicionE = buscarPalabra(english,palabraE);
						
						if (posicionE >=0)
							System.out.println("Su traducción al inglés es: " + spanish[posicionE].toUpperCase());
						else
							System.out.println("Palabra no encontrada.");
						
						break;
						
					case 3:
						
						System.out.println("Programa finalizado.");
											
					default: System.out.println("Introduce una opción válida.");
				}
				
			} while (opcion != 3);
			
			sc.close();	
			
			
			//Segunda parte
			String frase = "La casa del árbol tiene puerta y ventana";
			int posicion = 0;
			int index = 0;
			String palabra = "";
			boolean fin = false;
			do {
				if (frase.indexOf(" ", posicion) >= 0) { //Para sacar cada palabra substring hasta el siguiente espacio en blanco, y actualizo posicion
					palabra = frase.substring(posicion,frase.indexOf(" ", posicion));
					posicion = frase.indexOf(" ", posicion) + 1;
				} else { //Última palabra, hasta el final no hasta un espacio en blanco
					palabra = frase.substring(posicion,frase.length());
					fin = true;
				}
				
				//Traducir cada palabra
				index = buscarPalabra(spanish,palabra);
				if (index >= 0) {
					System.out.println(english[index]);
				} else {
					System.out.println(palabra);
				}
				
				if (fin)
					break;
			} while (posicion >= 0);
						
						
		}

	
	
	
}
