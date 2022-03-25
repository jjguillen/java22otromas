package ejersClase;

import java.util.Objects;

public class Direccion {

	private String calle;
	private String cp;
	private String localidad;
	private String provincia;
	
	/**
	 * @param calle
	 * @param cp
	 * @param localidad
	 * @param provincia
	 */
	public Direccion(String calle, String cp, String localidad, String provincia) {
		super();
		this.calle = calle;
		this.cp = cp;
		this.localidad = localidad;
		this.provincia = provincia;
	}

	public Direccion(Direccion otra) {
		this.calle = otra.calle;
		this.cp = otra.cp;
		this.localidad = otra.localidad;
		this.provincia = otra.provincia;
	}
	
	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Direccion [calle=");
		builder.append(calle);
		builder.append(", cp=");
		builder.append(cp);
		builder.append(", localidad=");
		builder.append(localidad);
		builder.append(", provincia=");
		builder.append(provincia);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(calle, cp, localidad, provincia);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Direccion other = (Direccion) obj;
		return Objects.equals(calle, other.calle) && Objects.equals(cp, other.cp)
				&& Objects.equals(localidad, other.localidad) && Objects.equals(provincia, other.provincia);
	}

	
	
	
	
	
	
	
}
