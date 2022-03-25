package Formas;

import java.util.Objects;

public class Circulo extends Forma {

	private double radio;

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}
	
	public Circulo(Circulo unCirculo) {
		super();
		this.radio = unCirculo.radio;
	}

	/**
	 * @return the radio
	 */
	public double getRadio() {
		return radio;
	}

	/**
	 * @param radio the radio to set
	 */
	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Circulo [radio=");
		builder.append(radio);
		builder.append(", id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(radio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circulo other = (Circulo) obj;
		return Double.doubleToLongBits(radio) == Double.doubleToLongBits(other.radio);
	}

	@Override
	public void dibujar() {
		System.out.println("Esto es un circulo");
		
	}

	@Override
	public double area() {
		return 2 * Math.PI * this.radio;
	}
	
	
	
	
}
