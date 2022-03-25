package tienda;

import java.time.LocalDate;
import org.apache.commons.codec.digest.DigestUtils;

public class ClienteRegistrado extends Cliente {

	private String email;
	private String password;
	private LocalDate fechaNacimiento;
	private LocalDate fechaRegistro;
	private static double descuento=5;
	
	/**
	 * Constructor copia
	 * @param unCliente
	 */
	public ClienteRegistrado(ClienteRegistrado unCliente) {
		super(unCliente);
		this.email = unCliente.email;
		this.password = unCliente.password;
		this.fechaNacimiento = unCliente.fechaNacimiento;
		this.fechaRegistro = unCliente.fechaRegistro;
	}

	/**
	 * Constructor usando todos los campos menos la fecha de registro
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param localidad
	 * @param direccion
	 * @param email
	 * @param password
	 * @param fechaNacimiento
	 */
	public ClienteRegistrado(String nombre, String apellidos, String dni, String localidad, String direccion,
			String email, String password, LocalDate fechaNacimiento) {
		super(nombre, apellidos, dni, localidad, direccion);
		this.email = email;
		this.password = DigestUtils.sha256Hex(password);
		this.fechaNacimiento = fechaNacimiento;
		this.fechaRegistro = LocalDate.now();		
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
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @return the descuento
	 */
	public static double getDescuento() {
		return descuento;
	}

	/**
	 * @param descuento the descuento to set
	 */
	public static void setDescuento(double descuento) {
		ClienteRegistrado.descuento = descuento;
	}

	/**
	 * @return the fechaRegistro
	 */
	public LocalDate getFechaRegistro() {
		return fechaRegistro;
	}

	@Override
	public double descuento() {
		return ClienteRegistrado.descuento;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ClienteRegistrado [nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", dni=");
		builder.append(dni);
		builder.append(", localidad=");
		builder.append(localidad);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append(", email=");
		builder.append(email);
		builder.append(", password=");
		builder.append(password);
		builder.append(", fechaNacimiento=");
		builder.append(fechaNacimiento);
		builder.append(", fechaRegistro=");
		builder.append(fechaRegistro);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * Comprueba que un password coincide encriptado con el que tenemos guardado (encriptado claro)
	 * @param pass
	 * @return
	 */
	public boolean checkPassword(String pass) {
		if (password.equals(DigestUtils.sha256Hex(pass)))
			return true;
		else
			return false;
	}
	
	

}
