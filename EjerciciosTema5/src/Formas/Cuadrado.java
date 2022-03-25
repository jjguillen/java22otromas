package Formas;

public class Cuadrado extends Rectangulo {

	Cuadrado(double lado) {
		super(lado, lado);
	}
	
	Cuadrado(Cuadrado c) {
		super(c);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cuadrado [base=");
		builder.append(base);
		builder.append(", altura=");
		builder.append(altura);
		builder.append(", id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void dibujar() {
		System.out.println("Esto es un cuadrado");
	}

	
	
	

}
