package ejemplosClase;

public class TestPajaro {

	public static void main(String[] args) {
		
		Pajaro p = new Pajaro();
		/*
		p.setEdad(2);
		p.setColor('v');
		p.setNombre("Loro");
		*/
		
		p.printEdad();
		p.printColor();
		p.printNombre();
		
				
		Pajaro otroP = new Pajaro(2,'r',"Quetzal");
		otroP.printEdad();
		otroP.printColor();
		otroP.printNombre();
		
		Pajaro viejo = new Pajaro(10);
		viejo.printEdad();
		viejo.printColor();
		viejo.printNombre();
		
		//System.out.println(p.color); -> Error p.color no es accesible es "private"

	}

}
