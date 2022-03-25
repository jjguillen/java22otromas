package Biblioteca;

public class Test {

	
	public static void main(String[] args) {
		Biblioteca bb = new Biblioteca();
		for(int i=0; i<10; i++) {
			bb.addUsuario(new Usuario(String.valueOf(i),"Javier"));
		}
		for(int i=0; i<10; i++) {
			bb.addDocumento(new Libro("Titulo "+String.valueOf(i),String.valueOf(i),2022));
		}
		
		bb.prestaDocumento(bb.documentos.get(3), bb.usuarios.get(5).getDni());
		bb.prestaDocumento(bb.documentos.get(3), bb.usuarios.get(6).getDni());
		bb.prestaDocumento(bb.documentos.get(4), bb.usuarios.get(8).getDni());
		
		System.out.println("Informe");
		bb.muestraInformePrestamos();
		
	}
}
