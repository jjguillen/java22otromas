package ejersClase;

import java.util.Scanner;

public class TestAgenda {

	public static void main(String[] args) {
		Agenda age = new Agenda();
		Scanner sc = new Scanner(System.in);
		
		age.addContacto(new Contacto("Javi","656982114"));
		age.listarContactos();
		
		int opcion = 0;
		do {
			System.out.println("AGENDA TELEFÓNICA");
			System.out.println("-----------------");
			System.out.println("1. Añadir nuevo contacto");
			System.out.println("2. Listar contactos");
			System.out.println("3. Buscar contacto");
			System.out.println("4. Eliminar contacto");
			System.out.println("5. Estado de la agenda");
			System.out.println("6. Salir");
			System.out.println("Elige una opción: ");
			
			opcion = Integer.parseInt(sc.nextLine());
			
			switch (opcion) {
			case 1: {
				System.out.println("Dime nombre para añadir:");
				System.out.println("Dime teléfono para añadir:");
				break;
			}
			case 2: {
				System.out.println("Listado de contactos");
				System.out.println("----------------------------------");
				break;
			}
			case 3: {
				System.out.println("Dime nombre del contacto a buscar");	
				break;
			}
			case 4: {
				System.out.println("Dime nombre del contacto a eliminar");	
				break;
			}
			case 5: {
				System.out.println("Cómooorrr?");
				break;
			}
			case 6: {
				System.out.println("Hasta la próxima!!!");
				break;
			}
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
			
		} while (opcion != 6);

	}

}
