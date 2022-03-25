/**
 * 
 */
package ejersClase;

/**
 * @author sjgui
 *
 */
public class TestAlumno {

	public static void main(String[] args) {
		
		/*
		Direccion direc = new Direccion("Mi calle 1","04638","Mojacar","Almer�a");
		Alumno javi = new Alumno("Javier Guill�n", "jjavierguillen@gmail.com", 24, direc);
		
		//Clonando son objetos diferentes
		try {
			Alumno amador = (Alumno) javi.clone();
			System.out.println(javi.equals(amador)); //No son iguales, tendremos que cambiar este m�todo
			direc.setCp("11111"); //La direcci�n no ha sido copiada, es una referencia
			System.out.println(amador.getNombre());
			amador.setNombre("Amador");
			System.out.println(javi.getEdad());
			System.out.println(amador);
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		//Copiando son el mismo objeto
		Alumno cati = javi;
		javi.setEmail("jj@gmail.com");
		System.out.println(cati);
		System.out.println(javi.equals(cati));
		
		
		//Copiando con el constructor copia son objetos diferentes
		Alumno vicente = new Alumno(javi);
		System.out.println(javi.equals(vicente));
		javi.setEmail("jjotro@gmail.com");
		System.out.println(vicente);
		*/
		
		Direccion micasa = new Direccion("Av. mi casa", "04638", "Mojácar", "Almería");
		Alumno emi = new Alumno("Emi", "emi@gmail.com", 28, micasa);
		
		//Copiar objeto
		System.out.println("Copiar objetos------------------------");
		Alumno jhander = emi;
		jhander.setEdad(22);
		emi.setEmail("otro@gmail.com");
		//System.out.println(jhander);
		//System.out.println(emi);
		
		
		//Constructor copia
		System.out.println("Constructor copia------------------------");
		Alumno alex = new Alumno(emi); 
		alex.setNombre("Alex");
		System.out.println(alex);
		System.out.println(jhander);
		System.out.println(emi);		
		
		//Clonación
		try {
			System.out.println("Clonación------------------------");
			Alumno fran = alex.clone();
			System.out.println(fran);
			fran.setNombre("Fran");
			alex.setNombre("Alexander");
			System.out.println(fran);
			System.out.println(alex);
		
			//Cambiamos la direccion de fran
			fran.getDireccion().setCalle("Av Principal");
			System.out.println(fran);
			System.out.println(alex);
			
			
		} catch (CloneNotSupportedException e) {
			System.out.println("Ese objeto no se puede clonar");
			//e.printStackTrace();
		}
		
		
		//Constructor copia profundo
		System.out.println("Constructor copia profundo ---------------");
		Alumno diego = new Alumno(alex);
		diego.setNombre("Diego");
		diego.getDireccion().setCalle("Casa de Diego");
		System.out.println(diego);
		System.out.println(alex);
		
		
		//Equals
		Alumno pilar = diego;
		System.out.println(pilar.equals(diego));
		Alumno lati = new Alumno(pilar);
		lati.setNombre("Lati");
		System.out.println(pilar.equals(lati));
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
