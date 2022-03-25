/**
 * 
 */
package ejersClase;

/**
 * @author profesor
 *
 */
public class Electrodomestico {
	
	enum Color { BLANCO, NEGRO, ROJO, AZUL, GRIS };
	enum Eficiencia { A, B, C, D, E, F, G };
	
	protected String marca;
	protected String modelo;
	protected double precio;
	protected double peso;
	protected Eficiencia eficienciaE; 
	protected Color color;
	
	public Electrodomestico() {
		this.precio = 100;
		this.peso = 5;
		this.eficienciaE = Eficiencia.F;
		this.color = Color.BLANCO;
	}
	
	public Electrodomestico(String marca, String modelo, double precio, double peso, Eficiencia eficienciaE, Color color) {
		super(); //Object
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.peso = peso;
		this.eficienciaE = eficienciaE;
		this.color = color;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @return the eficienciaE
	 */
	public Eficiencia getEficienciaE() {
		return eficienciaE;
	}

	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Electrodomestico [marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", eficienciaE=");
		builder.append(eficienciaE);
		builder.append(", color=");
		builder.append(color);
		builder.append("]");
		return builder.toString();
	}
	
	
	public double precioFinal() {
System.out.println("precio elec");		
		double precioF=0;
		
		switch (this.eficienciaE) {
		case A: {
			precioF = this.precio + 100; break;
		}
		case B: {
			precioF = this.precio + 80;  break;
		}
		case C: {
			precioF = this.precio + 60;  break;
		}
		case D: {
			precioF = this.precio + 50;  break;
		}
		case E: {
			precioF = this.precio + 30;  break;
		}
		case F: {
			precioF = this.precio + 10; break;
		}
		case G: {
			precioF = this.precio + 5;  break;
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + this.eficienciaE);
		}
		
		
		if (this.peso >= 0 && this.peso <= 19 ) 
			precioF += 10;
		if (this.peso >= 20 && this.peso <= 49 ) 
			precioF += 50;
		if (this.peso >= 50 && this.peso <= 79 ) 
			precioF += 80;
		if (this.peso >= 80) 
			precioF += 100;

		
		return precioF;
	}
	

	
	
}
