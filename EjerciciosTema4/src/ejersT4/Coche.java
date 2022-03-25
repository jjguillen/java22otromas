package ejersT4;

public class Coche {
	//Propiedades
	private int velocidad;
	
	//Propiedades estáticas
	public static int numCoches=0;
	

	public Coche() {
		velocidad = 0;
		Coche.numCoches++;
	}
	
	public Coche(int velocidad) {
		this.velocidad = velocidad;
		Coche.numCoches++;
	}
	
	public int getVelocidad() {
		return this.velocidad;
	}
	
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	public void acelera(int mas) {
		this.setVelocidad(this.getVelocidad()+mas);
		//this.velocidad++;
	}
	
	public void frena(int menos) {
		this.setVelocidad(this.getVelocidad()-menos);
	}
	
	public static void pintarNumeroCoches() {
		System.out.println(Coche.numCoches);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Coche [velocidad=");
		builder.append(velocidad);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
