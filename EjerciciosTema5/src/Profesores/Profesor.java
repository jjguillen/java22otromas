package Profesores;

import java.time.LocalDate;

public abstract class Profesor {

	protected String nrp;
	protected String nombre;
	protected String apellidos;
	protected LocalDate fechaNacimiento;
	protected Double nominaBase;
	
	
	Profesor() {
		this.nrp = "no tiene";
		this.nombre = "-";
		this.apellidos = "-";
		this.fechaNacimiento = LocalDate.now();
		this.nominaBase = 0.0;
	}


	public Profesor(String nrp, String nombre, String apellidos, LocalDate fechaNacimiento, Double nominaBase) {
		super();
		this.nrp = nrp;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.nominaBase = nominaBase;
	}
	
	public Profesor(Profesor p) {
		this.nrp = p.nrp;
		this.nombre = p.nombre;
		this.apellidos = p.apellidos;
		this.fechaNacimiento = p.fechaNacimiento;
		this.nominaBase = p.nominaBase;
	}


	/**
	 * @return the nrp
	 */
	public String getNrp() {
		return nrp;
	}


	/**
	 * @param nrp the nrp to set
	 */
	public void setNrp(String nrp) {
		this.nrp = nrp;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}


	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
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
	 * @return the nominaBase
	 */
	public Double getNominaBase() {
		return nominaBase;
	}


	/**
	 * @param nominaBase the nominaBase to set
	 */
	public void setNominaBase(Double nominaBase) {
		this.nominaBase = nominaBase;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Profesor [nrp=");
		builder.append(nrp);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", fechaNacimiento=");
		builder.append(fechaNacimiento);
		builder.append(", nominaBase=");
		builder.append(nominaBase);
		builder.append("]");
		return builder.toString();
	}
	
	
	/**
	 * Calcula y devuelve la nómina de un profesor
	 * @return
	 */
	public abstract double nominaBase();
	
	
	
	
}
