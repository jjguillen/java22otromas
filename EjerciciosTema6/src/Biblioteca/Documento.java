package Biblioteca;

import java.time.Duration;
import java.time.LocalDate;

public class Documento {

	protected String titulo;
	protected String codigo;
	protected Usuario prestadoA;
	protected LocalDate fechaDePrestamo;
	
	
	public Documento(String titulo, String codigo) {
		super();
		this.titulo = titulo;
		this.codigo = codigo;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @return the prestadoA
	 */
	public Usuario getPrestadoA() {
		return prestadoA;
	}
	
	public boolean estaPrestado() {
		if (this.prestadoA == null)
			return false;
		else 
			return true;
	}
	
	public void prestaAUsuario(Usuario user) {
		this.prestadoA = user;
		this.fechaDePrestamo = LocalDate.now();
	}
	
	public void devuelve() {
		this.prestadoA = null;
	}
	
	public int plazoPrestamo() {
		Duration dur = Duration.between(fechaDePrestamo, LocalDate.now());
		return (int) dur.toDays();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Documento [titulo=");
		builder.append(titulo);
		builder.append(", codigo=");
		builder.append(codigo);
		builder.append(", prestadoA=");
		builder.append(prestadoA);
		builder.append(", fechaDePrestamo=");
		builder.append(fechaDePrestamo);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
}
