package PrimeVideos;

public class Test {

	public static void main(String[] args) {
		PrimeVideo primeVideo = new PrimeVideo();

		for (int i = 0; i < 30; i++) {
			primeVideo.addMultimedia(new Pelicula("Ejemplo Plus " + String.valueOf(i), true, 10, 90));
		}
		for (int i = 30; i < 200; i++) {
			primeVideo.addMultimedia(new Pelicula("Ejemplo " + String.valueOf(i), false, 10, 90));
		}

		for (int i = 0; i < 25000; i++) {
			primeVideo.addSuscriptor(new ClientePrimePro(String.valueOf(i), "Pro", "email"));
		}
		for (int i = 25000; i < 100000; i++) {
			primeVideo.addSuscriptor(new ClientePrime(String.valueOf(i), "Normal", "email"));
		}

		for (Cliente cliente : primeVideo.suscriptores) {
			for (int i = 0; i < 40; i++) {
				primeVideo.ver(primeVideo.catalogo.get(i), cliente);
			}
		}

		System.out.println("Ganancias: " + primeVideo.getGanancias());

		for(int k=0; k<1000; k++) {
			//Crea una serie
			Serie serie = new Serie("Breaking Bad", true, 1000);
			for(int i=0; i<10; i++) {
				Temporada t = new Temporada(i);
				for(int j=0; j<10; j++) {
					t.addEpisodio(new Episodio("Episodio "+j, String.valueOf(50)));
				}	
				serie.addTemporada(t);
			}
		}
		
		for(Multimedia m : primeVideo.catalogo) {
			if (m instanceof Serie) {
				for (Cliente cliente : primeVideo.suscriptores) {
					primeVideo.ver(m, cliente);
				}
			}
		}
		
		System.out.println("Ganancias: " + primeVideo.getGanancias());
		
		
	}

}
