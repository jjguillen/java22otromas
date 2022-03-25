package Wordle;

import java.time.LocalDate;
import java.util.ArrayList;

public class Wordle {

	private static String[] diccionario = { "clase", "balsa", "salud", "cielo", "fresa", "cinta", "suelo", "viejo", "amigo", "primo", "abrir","luces","casas" };
	private String palabraAAcertar;
	private String palabraActual;
	private ArrayList<Character> letrasNoEstan;
	
	Wordle() {
		letrasNoEstan = new ArrayList<>();
		int dia = LocalDate.now().getDayOfMonth();
		palabraAAcertar = Wordle.diccionario[dia];
	}
	
	Wordle(String palabra) throws Exception {
		if (palabra.length() != 5) 
			throw new Exception("Error, palabra corta");
		else {
			palabraAAcertar = palabra;
			letrasNoEstan = new ArrayList<>();
		}
	}

	public String getPalabraActual() {
		return palabraActual;
	}

	public void setPalabraActual(String palabraActual) {
		this.palabraActual = palabraActual;
	}

	public String getPalabraAAcertar() {
		return palabraAAcertar;
	}

	public ArrayList<Character> getLetrasNoEstan() {
		return letrasNoEstan;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Wordle [palabraActual=");
		builder.append(palabraActual);
		builder.append(", letrasNoEstan=");
		builder.append(letrasNoEstan);
		builder.append("]");
		return builder.toString();
	}
	
	public boolean comprobar(String intento) {
		ArrayList<Integer> posicionesNoAcertadas = new ArrayList<>();
		
		if (intento.equals(palabraAAcertar))
			return true;
		
		if (intento.length() == 5) {
			StringBuilder sb = new StringBuilder("-----");
			
			//Comprobar las que están en la misma posición
			for(int i=0; i<intento.length();i++) {
				if (intento.charAt(i) == palabraAAcertar.charAt(i)) {
					sb.setCharAt(i, Character.toUpperCase(palabraAAcertar.charAt(i)));
				} else {
					posicionesNoAcertadas.add(i);
				}
			}
			
			//Comprobar las que no están
			for(int i=0; i<intento.length();i++) {
				if (!palabraAAcertar.contains(Character.toString(intento.charAt(i)))) {
					if (!letrasNoEstan.contains(intento.charAt(i))) //Para no añadir dos veces las que no están
						letrasNoEstan.add(intento.charAt(i));
				}	
			}
			
			//Comprobar los que están en otra posición (no miramos los que ya se han acertado)
			for(Integer i: posicionesNoAcertadas) {
				for(Integer j: posicionesNoAcertadas) {
					if (intento.charAt(i) == palabraAAcertar.charAt(j)) {
						sb.setCharAt(i, intento.charAt(i));
					}
				}
			}
			
			palabraActual = sb.toString();
		}
		
		return false;
	}
	
	
	
	
	
	
	
}
