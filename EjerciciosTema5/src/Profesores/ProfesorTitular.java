package Profesores;

import java.time.LocalDate;

public class ProfesorTitular extends Profesor {

	protected boolean esCatedratico;
	
	ProfesorTitular() {
		super();
		this.esCatedratico = false;
	}
	
	
	public ProfesorTitular(ProfesorTitular p) {
		super(p);
		this.esCatedratico = p.esCatedratico;
	}


	public ProfesorTitular(String nrp, String nombre, String apellidos, LocalDate fechaNacimiento, Double nominaBase, boolean esCatedratico) {
		super(nrp, nombre, apellidos, fechaNacimiento, nominaBase);
		this.esCatedratico = esCatedratico;
	}

	@Override
	public double nominaBase() {
		return this.nominaBase * 1.3;
	}

}
