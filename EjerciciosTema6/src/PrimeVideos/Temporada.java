package PrimeVideos;

import java.util.ArrayList;

public class Temporada {
	protected int numero;
	protected ArrayList<Episodio> episodios;
	protected Serie serie;

	public Temporada() {
		this.numero = 0;
		episodios = new ArrayList<Episodio>();
	}

	/**
	 * @param numero
	 */
	public Temporada(int numero) {
		super();
		this.numero = numero;
		episodios = new ArrayList<Episodio>();
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the episodios
	 */
	public ArrayList<Episodio> getEpisodios() {
		return episodios;
	}

	/**
	 * @param episodios the episodios to set
	 */
	public void setEpisodios(ArrayList<Episodio> episodios) {
		this.episodios = episodios;
	}

	/**
	 * @return the serie
	 */
	public Serie getSerie() {
		return serie;
	}

	/**
	 * @param serie the serie to set
	 */
	public void setSerie(Serie serie) {
		this.serie = serie;
	}

	public int getNumeroEpisodios() {
		return episodios.size();
	}

	@Override
	public String toString() {
		return "Temporada [numero=" + numero + ", episodios=" + episodios + ", serie=" + serie.getTitulo() + "]";
	}

	public void addEpisodio(Episodio episodio) {
		episodio.setTemporada(this);
		this.episodios.add(episodio);
	}

	public void delEpisodio(Episodio episodio) {
		episodio.setTemporada(null);
		this.episodios.remove(episodios.indexOf(episodio));
	}

}
