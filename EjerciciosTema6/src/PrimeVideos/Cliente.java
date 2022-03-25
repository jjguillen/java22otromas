package PrimeVideos;

import java.util.Objects;

public abstract class Cliente {
	protected String dni;
	protected String nombre;
	protected String email;
	protected double precioMensual;

	public Cliente() {
		this.dni = "";
		this.nombre = "";
		this.email = "";
		this.precioMensual = 0;
	}

	/**
	 * @param dni
	 * @param nombre
	 * @param email
	 */
	public Cliente(String dni, String nombre, String email) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.email = email;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the precioMensual
	 */
	public abstract double getPrecioMensual();

	/**
	 * @param precioMensual the precioMensual to set
	 */
	public void setPrecioMensual(double precioMensual) {
		this.precioMensual = precioMensual;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", nombre=" + nombre + ", email=" + email + ", precioMensual=" + precioMensual
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(dni, other.dni);
	}

	public abstract boolean esPro();

}
