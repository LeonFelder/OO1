package ar.edu.unlp.info.oo1.ejercicio2;
import java.util.ArrayList;
import java.util.List;

public class Balanza {
	private List<Producto> productos;

	public Balanza () {
		this.ponerEnCero();
	}
	
	public void ponerEnCero () {
		productos = new ArrayList<Producto>();
	}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
	public Ticket emitirTicket () {
		return new Ticket (this.getCantidadDeProductos(),this.getPesoTotal(),this.getPrecioTotal(),productos);
	}
	
	public List<Producto> getProductos(){
		return productos;
	}

	public Integer getCantidadDeProductos() {
		return productos.size();
	}

	public Double getPrecioTotal() {
		Double precioTotal = 0.0;
		for (Producto producto: productos) {
			precioTotal += producto.getPrecio();
		}
		return precioTotal;
	}

	public Double getPesoTotal() {
		Double pesoTotal = 0.0;
		for (Producto producto: productos) {
			pesoTotal += producto.getPeso();
		}
		return pesoTotal;
	}
	
}
