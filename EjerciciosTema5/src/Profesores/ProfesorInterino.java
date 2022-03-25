package Profesores;

import java.time.LocalDate;
import java.time.Period;

public class ProfesorInterino extends Profesor {

	protected LocalDate fechaComienzo;
	
	
	public ProfesorInterino() {
		super();
		this.fechaComienzo = LocalDate.now();
	}

	public ProfesorInterino(ProfesorInterino p) {
		super(p);
		this.fechaComienzo = p.fechaNacimiento;
	}

	public ProfesorInterino(String nrp, String nombre, String apellidos, LocalDate fechaNacimiento, Double nominaBase, LocalDate fechaComienzo) {
		super(nrp, nombre, apellidos, fechaNacimiento, nominaBase);
		this.fechaComienzo = fechaComienzo;
	}

	@Override
	public double nominaBase() {
		return this.nominaBase * 1.1;
	}
	
	
	public void tiempoTrabajado() {
		Period period = Period.between(this.fechaComienzo, LocalDate.now());
		System.out.print("Ha trabajado durante "+period.getYears()+" años, ");
		System.out.print(period.getMonths()+" meses y ");
		System.out.print(period.getDays()+" días.");
	}

}
