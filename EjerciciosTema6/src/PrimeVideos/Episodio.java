package PrimeVideos;

public class Episodio {
	protected String titulo;
	protected int duracion;
	protected Temporada temporada;

	public Episodio() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param titulo
	 * @param duracion
	 */
	public Episodio(String titulo, String duracion) {
		super();
		this.titulo = titulo;
		this.duracion = Integer.valueOf(duracion);
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the duracion
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(String duracion) {
		this.duracion = Integer.valueOf(duracion);
	}

	/**
	 * @return the temporada
	 */
	public Temporada getTemporada() {
		return temporada;
	}

	/**
	 * @param temporada the temporada to set
	 */
	public void setTemporada(Temporada temporada) {
		this.temporada = temporada;
	}

	@Override
	public String toString() {
		return "Episodio [titulo=" + titulo + ", duracion=" + duracion + ", temporada=" + temporada + "]";
	}

}
