package ejersClase;

import java.util.ArrayList;

import ejersClase.Electrodomestico.Color;
import ejersClase.Electrodomestico.Eficiencia;
import ejersClase.Television.Resolucion;
import ejersClase.Television.TecnologiaLCD;

public class TestElectrodomestico {

	public static void main(String[] args) {
		
		Lavadora l1 = new Lavadora("Bosch", "Gueno", 500, 35, Eficiencia.B, Color.BLANCO);
		Television t1 = new Television("Samsung", "UHF4K", 1000, 18, Eficiencia.A, Color.NEGRO, 
										55, TecnologiaLCD.OLED, Resolucion.CUATROK);
		Lavadora l2 = new Lavadora("Siemes", "Mejor", 600, 40, Eficiencia.A, Color.GRIS,10);
		Television t2 = new Television("LG", "XSJ4K", 1500, 20, Eficiencia.A, Color.NEGRO, 
				60, TecnologiaLCD.OLED, Resolucion.OCHOK);
		
		//Creamos ArrayList de Electrodomestico
		ArrayList<Electrodomestico> tienda = new ArrayList<>();
		
		//Metemos las dos lavadoras y dos tvs
		tienda.add(l1);
		tienda.add(l2);
		tienda.add(t1);
		tienda.add(t2);
		
		//Recorremos el ArrayList y calculamos el precio total
		double precio=0;
		for(Electrodomestico elec : tienda) {
			precio += elec.precioFinal();			
		}
		
		System.out.println("El precio de todo es "+precio);
		

	}

}
