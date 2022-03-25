package PrimeVideos;

import java.util.ArrayList;

public class PrimeVideo {
	protected ArrayList<Multimedia> catalogo;
	protected ArrayList<Cliente> suscriptores;
	protected double ganancias;

	public PrimeVideo() {
		this.catalogo = new ArrayList<Multimedia>();
		this.suscriptores = new ArrayList<Cliente>();
		this.ganancias = 0;
	}

	public void addSuscriptor(Cliente cliente) {
		if (suscriptores.indexOf(cliente) >= 0) {
			System.out.println(cliente + " ya es suscriptor");
		} else {
			suscriptores.add(cliente);
		}
	}

	public void addMultimedia(Multimedia multimedia) {
		if (catalogo.indexOf(multimedia) >= 0) {
			System.out.println(multimedia + " ya esta en el catalogo");
		} else {
			catalogo.add(multimedia);
		}
	}

	public void delSuscriptor(Cliente cliente) {
		int pos = suscriptores.indexOf(cliente);
		if (pos >= 0) {
			suscriptores.remove(pos);
		} else {
			System.out.println(cliente + " no es suscriptor");
		}
	}

	public void delMultimedia(Multimedia multimedia) {
		int pos = catalogo.indexOf(multimedia);
		if (pos >= 0) {
			catalogo.remove(pos);
		} else {
			System.out.println(multimedia + " no esta en el catalogo");
		}
	}

	public void ver(Multimedia multimedia, Cliente cliente) {
		if (multimedia.isPlus()) {
			if (cliente.esPro() == false) {
				this.ganancias += multimedia.getPrecio();
			}
		}

		//System.out.println("Cliente: " + cliente + " viendo " + multimedia);
	}

	public double getGanancias() {
		double totalCuotas = 0;
		for (Cliente cliente : suscriptores) {
			totalCuotas += cliente.getPrecioMensual() * 12;
		}
		return this.ganancias + totalCuotas;
	}

}
