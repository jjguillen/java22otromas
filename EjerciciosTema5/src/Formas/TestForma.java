package Formas;

public class TestForma {

	public static void main(String[] args) {
		Circulo f = new Circulo(5);
		Rectangulo r = new Rectangulo(20,30);
		Triangulo t = new Triangulo(5,5);
		System.out.println(f+" Area: "+f.area());
		System.out.println(r+" Area: "+r.area());
		System.out.println(t+" Area: "+t.area());
		r.dibujar();

		Cuadrado c1 = new Cuadrado(4);
		Cuadrado c2 = new Cuadrado(c1);
		System.out.println(c1+" Area: "+c1.area());
		System.out.println(c2+" Area: "+c2.area());
	}

}
