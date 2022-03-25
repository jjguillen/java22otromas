package Wordle2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Wordle {

	
	private static String[] diccionario = { "suelo","suelo","suelo","suelo","suelo",
			"suelo","suelo","suelo","suelo","dieta","cifra","noria","suelo",
			"suelo","suelo","suelo","suelo","suelo","suelo","suelo","suelo",
			"suelo","suelo","suelo","suelo","suelo","suelo","suelo","suelo"};
	
	private String palabraAAcertar;
	private String palabraActual; //Intento actual
	private ArrayList<String> letrasNoEstan;
	
	/**
	 * Constructor que genera una palabra del diccionario para acertar
	 */
	Wordle() {
		letrasNoEstan = new ArrayList<>();
		palabraAAcertar = Wordle.diccionario[LocalDate.now().getDayOfMonth()];
	}
	
	/**
	 * Constructor que pone la palabra pasada como la que hay que acertar
	 * @param palabra
	 */
	Wordle(String palabra) {
		letrasNoEstan = new ArrayList<>();
		if (palabra.length() == 5) {
			palabraAAcertar = palabra;
		} else {
			throw new IllegalArgumentException("Palabra no tiene 5 letras");
		}
	}

	/**
	 * @return the palabraActual
	 */
	public String getPalabraActual() {
		return palabraActual;
	}

	/**
	 * @param palabraActual the palabraActual to set
	 */
	public void setPalabraActual(String palabraActual) {
		this.palabraActual = palabraActual;
	}

	/**
	 * @return the palabraAAcertar
	 */
	public String getPalabraAAcertar() {
		return palabraAAcertar;
	}

	/**
	 * @return the letrasNoEstan
	 */
	public ArrayList<String> getLetrasNoEstan() {
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
	
	/**
	 * Comprueba el intento y muestra el resultado
	 * Mayúsculas los aciertos, minúsculas las que están en otra posición
	 * @param intento
	 * @return
	 */
	boolean comprobar(String intento) {
		StringBuilder sbActual = new StringBuilder("-----"); 
		
		//Si aciertas la palabra devuelve true
		if (intento.equals(palabraAAcertar)) {
			palabraActual = palabraAAcertar.toUpperCase();
			return true;	
		}
		
		//Si la palabra no tiene 5 caracteres devuelve false
		if (intento.length() != 5) {
			return false;
		} else {
			//Comprobamos las letras que están en la misma posición
			for(int i=0; i<intento.length();i++) {
				if (palabraAAcertar.charAt(i) == intento.charAt(i)) {
					sbActual.setCharAt(i, Character.toUpperCase(intento.charAt(i)));
				}
			}
			
			//Comprobar las que no están
			for(int i=0; i<intento.length();i++) {
				if (! palabraAAcertar.contains(String.valueOf(intento.charAt(i))) ) {
					if (letrasNoEstan.indexOf(String.valueOf(intento.charAt(i))) < 0)
					letrasNoEstan.add(String.valueOf(intento.charAt(i)));
				}
			}
			
			//Comprobar las que están pero en un lugar distinto
			for(int i=0; i<intento.length();i++) {
				for(int j=0; j<palabraAAcertar.length(); j++) {
					if (palabraAAcertar.charAt(j) == intento.charAt(i)
							&& i != j) {
						sbActual.setCharAt(i, intento.charAt(i));			
					}					
				}				
			}
			
		}
		
		palabraActual = sbActual.toString();
		
		return false;
	}
	
	
	
	
	
	
	
}
