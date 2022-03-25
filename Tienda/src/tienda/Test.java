package tienda;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Categoria moviles = new Categoria("moviles");
		Categoria perif = new Categoria("periféricos");
		Producto p1 = new Producto("Iphone 13S","Telefonillo de Apple", moviles, 900, 1.21);
		Producto p2 = new Producto("Ratón Logitech","Ratón gaming", perif, 50, 1.21);
		Producto p3 = new Producto("Mando PS5","Mando consola", perif, 150, 1.21);
		ArrayList<Producto> lista = new ArrayList<>();
		lista.add(p1);lista.add(p2);lista.add(p3);
		
		ClienteRegistrado cr1 = new ClienteRegistrado("Javier", "Guillen", "48546987A", "Mojácar", "Mi casa", "jjavierguillen@gmail.com", 
				"12345678", LocalDate.of(1987, 10, 10));
		ArrayList<Cliente> clientes = new ArrayList<>();
		clientes.add(cr1);
		
		System.out.println("Dime tu dni para entrar al sistema");
		String dni = sc.nextLine();
		System.out.println("Dime tu password");
		String password = sc.nextLine();
		int posicion = clientes.indexOf(new ClienteRegistrado("","",dni,"","","","",LocalDate.now()));
		
		if (posicion >= 0) {
			Cliente cliente = clientes.get(posicion);
			Pedido ped1 = new Pedido(cliente);
			if (cliente.checkPassword(password)) {
				
				int opcion = 0;
				do {
					System.out.println("1. Ver productos");
					System.out.println("2. Añadir producto");
					System.out.println("3. Mostrar pedido");
					System.out.println("4. Generar PDF");
					
					opcion = Integer.parseInt(sc.nextLine());
					switch (opcion) {
						case 1: {
							for(Producto p: lista) {
								System.out.println(p.getNombre()+" "+p.getPrecio());
							}
							break;
						}
						
						case 2: {
							System.out.println("Selecciona producto:");
							int i=0;
							for(Producto p: lista) {
								i++;
								System.out.println(i + " " + p.getNombre()+" "+p.getPrecio());
							}
							int prod = Integer.parseInt(sc.nextLine());
							System.out.println("Dime cantidad: ");
							int cantidad = Integer.parseInt(sc.nextLine());
							
							ped1.nuevaLinea(new LineaPedido(lista.get(prod-1),cantidad));
							
							break;
						}
						
						case 3: {
							System.out.println(ped1.toString());
							break;
						}
						
						case 4: {
							try {
								ped1.toPDF();
							} catch (IOException e) {
								e.printStackTrace();
							}
							break;
						}
					}
				} while (opcion != 5);				
				
			} else {
				System.out.println("Contraseña incorrecta. Adiós");
			}
		} else {
			System.out.println("Usuario no registrado. Adiós.");
		}
		
		
		
		
	}

	
	
	
	
}
