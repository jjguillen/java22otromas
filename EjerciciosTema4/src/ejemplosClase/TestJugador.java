package ejemplosClase;

public class TestJugador {

	public static void main(String[] args) {
		
		Jugador player1 = new Jugador();
		System.out.println(player1);
		
		Arma espada = new Arma("Espadón",20,"fisico");
		Jugador player2 = new Jugador(50, 50, 5, 3, "Bruja del infierno","Brujo",espada,null);
		System.out.println(player2);
		
		Arma hacha = new Arma("Hacha del oscuro", 30, "magico");
		player2.setArmaIzquierda(hacha);
		player2.setArmaIzquierda(null);
		
		System.out.println(player2.getArmaDerecha());
		
		player1.golpear("magico", player2);
		player2.golpear("fisico", player1);
		
		System.out.println(player1);
		System.out.println(player2);
		
		player1.golpear("magico", player2);
		player2.golpear("fisico", player1);
		
		System.out.println(player1);
		System.out.println(player2);
		
		player1.golpear("magico", player2);
		player2.golpear("fisico", player1);
		
		System.out.println(player1);
		System.out.println(player2);
		
		player1.golpear("magico", player2);
		player2.golpear("fisico", player1);

		
		System.out.println(player1);
		System.out.println(player2);
		
	
		Jugador player3 = new Jugador();
		System.out.println(player1.numJugadores);
		System.out.println(player2.numJugadores);
	
	
	}

}
