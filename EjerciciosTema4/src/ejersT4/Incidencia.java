package ejersT4;

public class Incidencia {
	
	private String codigo;
	private String estado;
	private String problema;
	private String solucion;
	
	private static int pendientes = 0;

	/*
	 * No pongo el estado, pues cuando se crea una incidencia se supone que se crea 'abierta'
	 * No pongo la soluci�n, pues al crear la incidencia no voy a poner la soluci�n
	 */
	public Incidencia(String codigo, String problema) {
		super();
		this.codigo = codigo;
		this.estado = "abierta";
		this.problema = problema;
		
		Incidencia.pendientes++; //Cada vez que creamos una incidencia incrementamos el valor de la propiedad est�tica
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getProblema() {
		return problema;
	}

	public void setProblema(String problema) {
		this.problema = problema;
	}

	public String getSolucion() {
		return solucion;
	}

	public void setSolucion(String solucion) {
		this.solucion = solucion;
	}

	public static int getPendientes() {
		return pendientes;
	}

	public static void setPendientes(int pendientes) {
		Incidencia.pendientes = pendientes;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Incidencia [codigo=");
		builder.append(codigo);
		builder.append(", estado=");
		builder.append(estado);
		builder.append(", problema=");
		builder.append(problema);
		builder.append(", solucion=");
		builder.append(solucion);
		builder.append("]");
		return builder.toString();
	}
	
	/*
	 * Este m�todo es lo m�s complicado del ejercicio. 
	 * Seg�n la pr�ctica deber�a ser un m�todo est�tico que establece la propiedad est�tica,
	 * pero no es necesario que sea est�tico, de hecho si queremos poner la soluci�n
	 * de la incidencia en concreto (this) no podr�a ser est�tico.
	 * Luego decrementamos el valor del contador est�tico de incidencias
	 */
	public void resuelve(String solucion) {
		this.solucion = solucion;
		this.estado = "resuelta";
		Incidencia.setPendientes(Incidencia.pendientes - 1);
	}
	
	
	
	
}
