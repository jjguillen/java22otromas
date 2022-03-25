package PrimeVideos;

import java.util.ArrayList;

public class Serie extends Multimedia {
	protected ArrayList<Temporada> temporadas;

	/**
	 * @param titulo
	 * @param plus
	 * @param precio
	 */
	public Serie(String titulo, boolean plus, double precio) {
		super(titulo, plus, precio);
		temporadas = new ArrayList<Temporada>();
	}

	/**
	 * @return the temporadas
	 */
	public ArrayList<Temporada> getTemporadas() {
		return temporadas;
	}

	/**
	 * @param temporadas the temporadas to set
	 */
	public void setTemporadas(ArrayList<Temporada> temporadas) {
		this.temporadas = temporadas;
	}

	@Override
	public String toString() {
		return "Serie [temporadas=" + temporadas + ", codigo=" + codigo + ", titulo=" + titulo + ", plus=" + plus
				+ ", precio=" + precio + ", genero=" + genero + "]";
	}

	public int getNumeroTemporadas() {
		return temporadas.size();
	}

	public void addTemporada(Temporada temporada) {
		temporada.setSerie(this);
		this.temporadas.add(temporada);
	}

	public void delTemporada(Temporada temporada) {
		temporada.setSerie(null);
		this.temporadas.remove(temporadas.indexOf(temporada));
	}

}
