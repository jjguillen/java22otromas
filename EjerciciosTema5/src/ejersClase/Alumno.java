package ejersClase;

import java.util.Objects;

public class Alumno implements Cloneable {

	//PROPIEDADES
	private String nombre;
	private String email;
	private int edad;
	private Direccion direccion;

	
	/**
	 * Crea un nuevo alumno con su informaci�n por defecto
	 */
	public Alumno() {
		super();
	}

	/**
	 * @param nombre
	 * @param email
	 * @param edad
	 */
	public Alumno(String nombre, String email, int edad, Direccion direccion) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.edad = edad;
		this.direccion = direccion;
	}
	
	/**
	 * Constructor copia
	 * @param Alumno otro 
	 */
	public Alumno(Alumno otro) {
		this.nombre = otro.nombre;
		this.email = otro.email;
		this.edad = otro.edad;
		//Para copiar la dirección (OBJETO) llamo a su constructor copia
		//NO --> this.direccion = otra.direccion
		this.direccion = new Direccion(otro.getDireccion());
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	/**
	 * @return the direccion
	 */
	public Direccion getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	protected Alumno clone() throws CloneNotSupportedException  {
		// TODO Auto-generated method stub
		//return super.clone();
		
		//Clonación profunda
		Alumno al = new Alumno(this);
		Direccion dir = new Direccion(this.direccion);
		al.setDireccion(dir);

		return al;
	}
	
	
	/*
	 * Para no hacer casting en TestAlumno lo hago en el clone
	  @Override
		protected Alumno clone() throws CloneNotSupportedException {
			return (Alumno) super.clone();
		}
	 */
	


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Alumno [nombre=");
		builder.append(nombre);
		builder.append(", email=");
		builder.append(email);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(direccion, edad, email, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(direccion, other.direccion) && edad == other.edad && Objects.equals(email, other.email)
				&& Objects.equals(nombre, other.nombre);
	}



	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
