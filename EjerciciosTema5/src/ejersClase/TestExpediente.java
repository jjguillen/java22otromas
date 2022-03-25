package ejersClase;

import java.time.LocalDate;

import ejersClase.Expediente.Modalidad;

public class TestExpediente {

	public static void main(String[] args) {
		Expediente alumno1 = new Expediente("Carlos","Guerrero", LocalDate.of(2000, 2,20), 1);
		alumno1.setSexo('h');
		alumno1.setModalidad(Modalidad.GRADOSUPERIOR);
		System.out.println(alumno1);
		
		alumno1.getNotas().add(new NotasCurso("Programacion",1,9,6,8));
		alumno1.getNotas().add(new NotasCurso("Bases de datos",1,5,8,8));
		alumno1.getNotas().add(new NotasCurso("SSII",1,7,9,7));
		alumno1.getNotas().add(new NotasCurso("Entornos",1,10,9,10));
		System.out.println(alumno1);
		
		System.out.println(alumno1.titula());
		System.out.println(alumno1.mediaExpediente());
		
		Expediente alumno2 = new Expediente("Ana","Soria", LocalDate.of(1998, 1,5), 1);
		alumno2.setSexo('m');
		alumno2.setModalidad(Modalidad.GRADOSUPERIOR);
		System.out.println(alumno2);
		alumno2.getNotas().add(new NotasCurso("Programacion",1,6,7,8));
		alumno2.getNotas().add(new NotasCurso("Bases de datos",1,5,8,9));
		System.out.println(alumno2.titula());
		System.out.println(alumno2.mediaExpediente());


	}

}
