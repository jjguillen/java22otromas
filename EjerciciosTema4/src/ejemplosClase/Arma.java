package ejemplosClase;

public class Arma {

	private String nombre;
	private int damage;
	private String fisico;
	
	public Arma() {
		super();
	}

	public Arma(String nombre, int damage, String fisico) {
		super();
		this.nombre = nombre;
		this.damage = damage;
		this.fisico = fisico;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public String getFisico() {
		return fisico;
	}

	public void setFisico(String fisico) {
		this.fisico = fisico;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Arma [nombre=");
		builder.append(nombre);
		builder.append(", damage=");
		builder.append(damage);
		builder.append(", fisico=");
		builder.append(fisico);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
