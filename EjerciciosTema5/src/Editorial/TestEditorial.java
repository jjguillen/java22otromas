package Editorial;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestEditorial {

	public static void main(String[] args) {
		
		ArrayList<Publicacion> biblioteca = new ArrayList<>();
		
		//Un libro
		Autor a1 = new Autor("Mi nombre","mno@gmail.com", "554455343");
		Autor a2 = new Autor("Otro tio", "otro@gmail.com", "654456766");
		Libro libro1 = new Libro("Mi libro", "Edhasa", LocalDate.of(2021, 10, 10), 
				269, 22.85, "123456789", 3, Genero.ENSAYO);
		libro1.addAutor(a1);
		libro1.addAutor(a2);
		
		//Un libro
		Autor a3 = new Autor("Mi escritora favorita", "ella@gmail.com", "454543333");
		Libro libro2 = new Libro("Mi libro 2", "Impedimenta", LocalDate.of(2021, 10, 10), 
				369, 24.85, "123456733", 13, Genero.NOVELA);
		libro2.addAutor(a3);
		libro2.addAutor(a1);
		
		//Una revista
		Revista rev1 = new Revista("Desperta-Ferro Medieval", "Desperta-Ferro", 
				LocalDate.of(2022, 2, 1), 70, 4.5, 66, Tematica.HISTORIA);
		Articulo art1 = new Articulo("Invasión musulmana", a2, "dossier");
		Articulo art2 = new Articulo("Almogávares", a3, "normal");
		rev1.addArticulo(art1);
		rev1.addArticulo(art2);
		
		//Añado dos libros y una revista a la biblioteca
		biblioteca.add( libro1 );
		biblioteca.add( libro2 );
		biblioteca.add(rev1);
		
		for(Publicacion p: biblioteca)
			System.out.println(p);
		
		for(Publicacion p: biblioteca)
			System.out.println("Autores del libro "+p.getTitulo()+": "+p.getAutor());
		
		
		

	}

}
