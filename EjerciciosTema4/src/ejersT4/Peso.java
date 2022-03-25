package ejersT4;

public class Peso {

	/**
	 * Propiedad
	 * Peso expresado en kilogramos
	 */
	private double pesoEnKilogramos;
	
	/**
	 * Constructor
	 * En función de la unidad convierte el valor pasado a kilogramos
	 * @param unidad en la que se expresa el valor 
	 * ‘Lb’ para libras, ‘Li’ para lingotes, ‘Oz’ para onzas, ‘P’ para peniques, ‘K’ para kilos, ‘G’ para gramos
	 * @param valor del peso expresado en la unidad correspondiente
	 */
	public Peso(String unidad, double valor) {
	
		switch (unidad) {
			case "Lb": {
				this.pesoEnKilogramos = valor * 453 / 1000;
				break;
			}
			case "Li": {
				this.pesoEnKilogramos = valor * 14.59;
				break;
			}
			case "Oz": {
				this.pesoEnKilogramos = valor * 28.35 / 1000;
				break;
			}
			case "P": {
				this.pesoEnKilogramos = valor * 1.55 / 1000;
				break;
			}
			case "K": {
				this.pesoEnKilogramos = valor;
				break;
			}
			case "G": {
				this.pesoEnKilogramos = valor / 1000;
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + unidad);
		}
	}
	
	/**
	 * Devuelve el valor de la propiedad (kilogramos)
	 * @return peso en kilogramos
	 */
	public double getKilogramos() {
		return this.pesoEnKilogramos;
	}
	
	/**
	 * Devuelve el peso (que está en kilogramos) convertido a Libras
	 * @return peso en libras
	 */
	public double getLibras() {
		return this.pesoEnKilogramos * 1000 / 453;
	}
	
	/**
	 * Devuelve el peso (que está en kilogramos) convertido a Lingotes
	 * @return peso en lingotes
	 */
	public double getLingotes() {
		return this.pesoEnKilogramos / 14.59;
	}
	
	/**
	 * Devuelve el peso (que está en kilogramos) convertido a la unidad que se pasa en el String
	 * ‘Lb’ para libras, ‘Li’ para lingotes, ‘Oz’ para onzas, ‘P’ para peniques, ‘K’ para kilos, ‘G’ para gramos
	 * @param unidad en la que expresar el peso almacenado en la propiedad en kilogramos
	 * @return el peso almacenado en kilogramos convertido a la unidad especificada
	 */
	public double getPeso(String unidad) {
		switch (unidad) {
			case "Lb": {
				return this.getLibras();
			}
			case "Li": {
				return this.getLingotes();
			}
			case "Oz": {
				return this.pesoEnKilogramos * 1000 / 28.35;
			}
			case "P": {
				return this.pesoEnKilogramos * 1000 / 1.55;
			}
			case "K": {
				return this.getKilogramos();
			}
			case "G": {
				return this.pesoEnKilogramos * 1000;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + unidad);
		}
		
	}
	
	
	
}
