package ejersT3;

public class Ejercicio20 {

	/**
	 * Creamos la pila (vector) del tamaño indicado
	 * @param capacidad
	 * @return
	 */
	public static int[] crearPila(int capacidad) {
		int pila[] = new int[capacidad];
		for(int i=0; i<pila.length; i++) {
			pila[i] = -1;
		}
		return pila;
	}
	
	/**
	 * Insertar un entero en la pila en la posición última
	 * @param pili
	 * @param elemento
	 */
	public static void insertar(int pili[], int elemento) {
		for(int i=0; i<pili.length; i++) {
			if (pili[i] == -1) {
				pili[i] = elemento;
				break;
			}
		}
	}
	
	/**
	 * Comprueba si está o no llena (-1) todos los valores
	 * @param pili
	 * @return
	 */
	public static boolean estaLlena(int pili[]) {
		boolean llena=true;
		for(int i=0; i<pili.length; i++) {
			if (pili[i] == -1) {
				llena = false;
			}			
		}
		
		return llena;
	}
	
	public static int sacar(int pili[]) {
		int elemento=-1;
		
		//Está llena
		if (estaLlena(pili) == true) {
			elemento = pili[pili.length-1];
			pili[pili.length-1] = -1; //Borrar elemento
			return elemento;
		}
		
		
		//Otro caso, incompleta
		if (pili[0] != -1) {
			for(int i=0; i<pili.length; i++) {
				if (pili[i] == -1) {
					elemento = pili[i-1];
					pili[i-1] = -1; //Borrar elemento
					return elemento;
				}
			}
		}
		
		
		
		
		
		
		return elemento;
	}
	
	
	
	public static void main(String[] args) {
		
		
		int pila[] = crearPila(10);
		insertar(pila, 5);
		insertar(pila, 3);
		insertar(pila, 4);
		insertar(pila, 1);
		System.out.println(sacar(pila));
		insertar(pila, 10);
		System.out.println(sacar(pila));
		System.out.println(sacar(pila));
		
		

	}

}
