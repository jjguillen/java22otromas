/**
 * 
 */
package ejersClase;

/**
 * @author profesor
 *
 */
public class Lavadora extends Electrodomestico {
	
	protected int carga;

	public Lavadora() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lavadora(String marca, String modelo, double precio, double peso, Eficiencia eficienciaE, Color color) {
		super(marca, modelo, precio, peso, eficienciaE, color);
		this.carga = 5;
	}
	
	public Lavadora(String marca, String modelo, double precio, double peso, Eficiencia eficienciaE, Color color, int carga) {
		super(marca, modelo, precio, peso, eficienciaE, color);
		this.carga = carga;		
	}

	/**
	 * @return the carga
	 */
	public int getCarga() {
		return carga;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Lavadora [carga=");
		builder.append(carga);
		builder.append(", marca=");
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
		//Llama a precioFinal del padre "Electrodomestico"
		/*
		double precioF = super.precioFinal();
		
		if (this.carga > 8)
			return precioF+50;
		else
			return precioF;
		*/
		
		double precioF = 0;
		if (this.carga > 8)
			precioF += 50;
		
		precioF += super.precioFinal();
		return precioF;
		
		
	}
	
	
	
}
