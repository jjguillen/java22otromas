package ejemplosClase;

public class Coche {

	private String marca;
	private String modelo;
	private String color;
	private double largo;
	private double ancho;
	private double alto;
	
	Coche() {
		this.marca = "No tiene";
		this.modelo = "No tiene";
		this.color = "No tiene";
		this.largo = 0;
		this.ancho = 0;
		this.alto = 0;		
	}

	Coche(String marca, String modelo, String color, double largo, double ancho, double alto) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.largo = largo;
		this.ancho = ancho;
		this.alto = alto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Coche [marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", color=");
		builder.append(color);
		builder.append(", largo=");
		builder.append(largo);
		builder.append(", ancho=");
		builder.append(ancho);
		builder.append(", alto=");
		builder.append(alto);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
