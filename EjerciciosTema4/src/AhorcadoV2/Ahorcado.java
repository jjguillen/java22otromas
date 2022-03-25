package AhorcadoV2;

import java.util.Arrays;

public class Ahorcado {

	//Propiedades
	public static String[] diccionario = { "pelota", "caramelo", "payaso", "centinela" };
	
	private String palabraAAdivinar;
	private StringBuilder palabraIntentada; //Se puede hacer con StringBuilder
	private StringBuilder letrasProbadas;
	private int fallos;
	
	/**
	 * Constructor que genera una palabra a adivinar de forma aleatoria
	 * Además pone los fallos a 0 para empezar a jugar
	 */
	public Ahorcado() {
		//Elegir una palabra aleatoria del diccionario
		int posicion = (int) (Math.random() * Ahorcado.diccionario.length);
		this.palabraAAdivinar = Ahorcado.diccionario[posicion];
		
		//Creo un StringBuilder
		this.palabraIntentada = new StringBuilder();
		
		//Rellenar de guiones la palabraIntentada, tantos como longitud de la palabraAAdivinar
		for(int i=0; i<this.palabraAAdivinar.length(); i++) {
			this.palabraIntentada.append('-');
		}
		
		//Iniciar el tamaño del array de letras palabras
		this.letrasProbadas = new StringBuilder();
		
		this.fallos = 0;
	}

	
	
	
	
	

	/**
	 * @return the diccionario
	 */
	public static String[] getDiccionario() {
		return diccionario;
	}


	/**
	 * @return the palabraAAdivinar
	 */
	public String getPalabraAAdivinar() {
		return palabraAAdivinar;
	}


	/**
	 * @return the palabraIntentada
	 */
	public StringBuilder getPalabraIntentada() {
		return palabraIntentada;
	}


	/**
	 * @return the letrasProbadas
	 */
	public StringBuilder getLetrasProbadas() {
		return letrasProbadas;
	}


	/**
	 * @return the fallos
	 */
	public int getFallos() {
		return fallos;
	}




	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ahorcado [palabraAAdivinar=");
		builder.append(palabraAAdivinar);
		builder.append(", palabraIntentada=");
		builder.append(palabraIntentada);
		builder.append(", letrasProbadas=");
		builder.append(letrasProbadas);
		builder.append(", fallos=");
		builder.append(fallos);
		builder.append("]");
		return builder.toString();
	}
	
	
	/**
	 * La letra introducida la busca en la palabra a adivinar
	 * Si la encuentra nos muestra sus apariciones en la solución
	 * Si no la encuentra suma un fallo
	 * @param letra
	 * @return
	 */
	public boolean intentar(char letra) {
		
		boolean encontrado = false;
		
		//Buscar la letra tantas veces como salga
		for(int i=0; i<this.palabraAAdivinar.length(); i++) {
			//Si coincide la letra en alguna posición la pongo en palabraIntentada
			if (this.palabraAAdivinar.charAt(i) == letra) {
				this.palabraIntentada.setCharAt(i, letra);
				encontrado = true;
			} 
		}
		
		if(encontrado == false)
			this.fallos++;
		
		//Compruebo que la letra se haya probado ya
		if (this.letrasProbadas.indexOf(Character.toString(letra)) >= 0) {
			System.out.println("Esa letra ya la has dicho");
		} else {
			this.letrasProbadas.append(letra+",");
		}
		
		return encontrado;		
	}
	
	
	/**
	 * Comprueba que la palabraAAdivinar y la palabraIntentada son iguales
	 * @return
	 */
	public boolean solucion() {
		if (this.palabraAAdivinar.equals(this.palabraIntentada.toString()))
			return true;
		else
			return false;
	}
	
	
	/**
	 * Comprueba que la palabra pasada como parámetro es igual que palabraAAdivinar
	 * @param palabra
	 * @return
	 */
	public boolean comprobarSolucion(String palabra) {
		if (palabra.equals(this.palabraAAdivinar))
			return true;
		else
			return false;
	}
	
	public void incrementarFallos() {
		this.fallos++;
	}
	
	
	
}



