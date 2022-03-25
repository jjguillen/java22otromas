package tienda;

import java.io.IOException;
import java.time.LocalDate;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import java.util.ArrayList;

public class Pedido {

	private static int incremento=1;
		
	private int codigo;
	private LocalDate fecha;
	private double total; //Calculado, no aparece en constructor, ni en setter
	private Cliente cliente; //Hay que pasarlo con setter
	private ArrayList<LineaPedido> lineas;
	

	public Pedido() {
		super();
		this.codigo = Pedido.incremento;
		Pedido.incremento++;
		this.fecha = LocalDate.now();
		this.lineas = new ArrayList<>();
		this.total = 0;
	}
	
	public Pedido(Cliente cliente) {
		super();
		this.codigo = Pedido.incremento;
		Pedido.incremento++;
		this.fecha = LocalDate.now();
		this.cliente = cliente;
		this.lineas = new ArrayList<>();
		this.total = 0;
	}
	
	/**
	 * Devuelve el precio total, sumando cada línea pedido y descontando el descuento
	 * @return
	 */
	public double total() {
		//El total se va actualizando cada vez que añado una nueva LineaPedido
		//con el método nuevaLinea
		
		return this.total - this.cliente.descuento();
	}
	
	
	public ArrayList<LineaPedido> getLineas() {
		return this.lineas;
	}
	
	
	public void nuevaLinea(LineaPedido lp) {
		//Si hay una linea de pedido ya, con el mismo producto
		//lo que hago es actualizar la cantidad de esa linea del pedido
		boolean encontrado = false;
		for(LineaPedido linea : lineas) {
			if (linea.getProducto().equals(lp.getProducto())) {
				linea.setCantidad(linea.getCantidad() + lp.getCantidad());
				encontrado = true;
				this.total += lp.subtotal();
			}
		}
		
		if (!encontrado) {
			lineas.add(lp);
			this.total += lp.subtotal();
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pedido: ");
		builder.append(codigo);
		builder.append("\n");
		for(LineaPedido linea : lineas) {
			builder.append("Prod: ");
			builder.append(linea.getProducto().getCodigo());
			builder.append(" precio: ");
			builder.append(linea.getProducto().getPrecio());
			builder.append(" cantidad: ");
			builder.append(linea.getCantidad());
			builder.append(". Subtotal= ");
			builder.append(linea.subtotal());
			builder.append("€ \n");			
		}
		builder.append("Total (iva inc.) = ");
		builder.append(total());
		builder.append("€");
		builder.append("\n");
		
		return builder.toString();
	}
	
	public void toPDF() throws IOException {
		try (PDDocument document = new PDDocument()) {
            PDPage page = new PDPage(PDRectangle.A4);
            document.addPage(page);

            PDPageContentStream contentStream = new PDPageContentStream(document, page);

            // Text
            contentStream.beginText();
            contentStream.setFont(PDType1Font.TIMES_BOLD, 32);
            contentStream.newLineAtOffset( 20, page.getMediaBox().getHeight() - 52);
            contentStream.showText("Pedido " + this.codigo);
            contentStream.endText();
            
            if (cliente != null) { //Si tiene cliente asociado pintamos los datos
            	contentStream.beginText();
                contentStream.setFont(PDType1Font.TIMES_BOLD, 12);
                contentStream.newLineAtOffset( 20, page.getMediaBox().getHeight() - 80);
                contentStream.showText("Cliente: " + cliente.getDni() + " " + cliente.getApellidos() + ", " + cliente.getNombre());
                contentStream.newLineAtOffset(0, -15);
                contentStream.showText("Direccion: " + cliente.getDireccion() + ", " + cliente.getLocalidad());
                contentStream.endText();
            }
            
            //Mejorar usando setLeading() el espaciado, y newline()
            contentStream.beginText();
            contentStream.setFont(PDType1Font.COURIER, 14);
            contentStream.newLineAtOffset( 20, 700);
            StringBuilder texto = new StringBuilder();
            for(LineaPedido lp: lineas) { 
            	texto.setLength(0); //Vaciar StringBuilder
            	texto.append("Producto: " + lp.getProducto().getCodigo() );
                texto.append(" - Precio: " + lp.getProducto().getPrecio());
                texto.append("€ - Cantidad: " + lp.getCantidad());
                texto.append(" =  " + lp.subtotal() + "€");
                contentStream.showText(texto.toString());
                contentStream.newLineAtOffset( 0, -25);
            }
            contentStream.showText("Total = "+total()+"€");
            if ( (cliente != null) && (cliente.descuento() > 0) )
            	contentStream.showText("  (descuento incluido de " + cliente.descuento() + " euros)");
            
            contentStream.endText();

            contentStream.close();

            document.save("pedido"+ this.codigo +".pdf");
        } catch (Exception ex) {
        	System.out.println("Error: "+ex.getMessage());
        }

		
	}
	
	
	
	
}
