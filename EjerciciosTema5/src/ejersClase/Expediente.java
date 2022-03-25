/**
 * 
 */
package ejersClase;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

/**
 * @author profesor
 *
 */
public class Expediente {

	//TIPO ENUM definido para mi clase
	enum Modalidad {FPB, GRADOMEDIO, GRADOSUPERIOR, ESO, BACHILLERATO};
	
	//PROPIEDADES
	private static int totalAlumnado=0; //Contador de objetos de tipo Expediente
	private final int id = Expediente.totalAlumnado+1;
	private String nombre;
	private String apellidos;
	private char sexo;
	private LocalDate fechaNacimiento;
	private Modalidad modalidad;
	private int curso;
	private ArrayList<NotasCurso> notas;
	
	
	//CONSTRUCTORES
	/**
	 * 
	 */
	Expediente(String nombre, String apellidos, LocalDate fecha, int curso) {
		Expediente.totalAlumnado++; //Cada vez que creo un objeto sumo 1 al contador
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fecha;
		this.curso = curso;
		
		//Inicializar ArrayList
		this.notas = new ArrayList<>();
	}
	
	
	
	
	public int getId() {
		return this.id;
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
	 * @return the sexo
	 */
	public char getSexo() {
		return sexo;
	}


	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
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
	 * @return the modalidad
	 */
	public Modalidad getModalidad() {
		return modalidad;
	}


	/**
	 * @param modalidad the modalidad to set
	 */
	public void setModalidad(Modalidad modalidad) {
		this.modalidad = modalidad;
	}


	/**
	 * @return the curso
	 */
	public int getCurso() {
		return curso;
	}


	/**
	 * @param curso the curso to set
	 */
	public void setCurso(int curso) {
		this.curso = curso;
	}


	/**
	 * @return the totalAlumnado
	 */
	public static int getTotalAlumnado() {
		return totalAlumnado;
	}



	/**
	 * @return the notas
	 */
	public ArrayList<NotasCurso> getNotas() {
		return notas;
	}




	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Expediente [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", sexo=");
		builder.append(sexo);
		builder.append(", fechaNacimiento=");
		builder.append(fechaNacimiento);
		builder.append(", modalidad=");
		builder.append(modalidad);
		builder.append(", curso=");
		builder.append(curso);
		builder.append(", notas=");
		builder.append(notas);
		builder.append("]");
		return builder.toString();
	}




	@Override
	public int hashCode() {
		return Objects.hash(apellidos, nombre);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Expediente other = (Expediente) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(nombre, other.nombre);
	}
	
	
	
	public int getEdad() {
		return LocalDate.now().getYear() - this.fechaNacimiento.getYear(); 
	}
	
	public boolean mayorEdad() {
		if (this.getEdad() >= 18)
			return true;
		
		return false;
	}
	
	/**
	 * Calcula el número de suspenso del Expediente
	 * @return
	 */
	public int getSuspensos() {
		int contadorSusp = 0;
		//Cada NotasCurso la va a ir metiendo en 'nc'
		for(NotasCurso nc : this.getNotas()) {
			if (nc.getNotaFinal() < 5) {
				contadorSusp++;
			}
		}
		return contadorSusp;
	}
	
	/**
	 * Devuelve true si está en ESO o Bachillerato y te quedan dos o menos
	 * Devuelve true si está en Ciclo y apruebas todas
	 * Devuelve false en caso contrario
	 * @return
	 */
	public boolean titula() {
		//Ver modalidad del expediente
		if (this.modalidad == Modalidad.BACHILLERATO || this.modalidad == Modalidad.ESO) {
			//Solo puede haber dos suspensas	
			int contadorSusp = this.getSuspensos();
			if (contadorSusp <= 2)
				return true;
			else
				return false;
			
		} else {
			//Hay que aprobarlas todas
			int contadorSusp = this.getSuspensos();
			if (contadorSusp == 0)
				return true;
			else 
				return false;
		}
	}
	
	/**
	 * Devuelve la media de las notas finales de cada NotasCurso en que está matriculado
	 */
	public double mediaExpediente() {
		//Recorremos el ArrayList de NotasCurso y obtenemos la notafinal de cada
		//Devolvemos la media
		double media = 0;
		int contadorMaterias = 0;
		
		for(NotasCurso nc : this.getNotas()) {
			contadorMaterias++;			
			media += nc.getNotaFinal();
		}
		
		return media/contadorMaterias;
	}
	
	
	
	
	
}
