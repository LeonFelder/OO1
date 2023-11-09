package ar.edu.unlp.info.oo1.ejercicio2;
import java.time.LocalDate;
import java.util.List;

public class Ticket {
	private LocalDate fecha;
	private Integer cantidadDeProductos;
	private Double pesoTotal;
	private Double precioTotal;
	private List<Producto> productos;
	
	public Ticket (Integer cantidadDeProductos, Double pesoTotal, Double precioTotal,List<Producto> productos) {
		this.cantidadDeProductos = cantidadDeProductos;
		this.pesoTotal = pesoTotal;
		this.precioTotal = precioTotal;
		fecha = LocalDate.now();
		this.productos = productos;
	}
	
	public Double impuesto() {
		return precioTotal * 0.21;
	}
	
	public List<Producto> getProductos (){
		return productos;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Integer getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public void setCantidadDeProductos(Integer cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}

	public Double getPesoTotal() {
		return pesoTotal;
	}

	public void setPesoTotal(Double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}

	public Double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(Double precioTotal) {
		this.precioTotal = precioTotal;
	}
	
}
