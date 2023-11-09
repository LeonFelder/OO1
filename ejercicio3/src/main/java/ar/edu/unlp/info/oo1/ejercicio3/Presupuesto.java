package ar.edu.unlp.info.oo1.ejercicio3;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List<Item> items;
	
	public Presupuesto () {
		items = new ArrayList<Item>();
	}
	
	public Presupuesto (String cliente) {
		this.cliente = cliente;
		this.fecha = LocalDate.now();
		items = new ArrayList<Item>();
	}
	
	public Presupuesto (String cliente, LocalDate fecha) {
		this.cliente = cliente;
		this.fecha = fecha;
		items = new ArrayList<Item>();
	}
	
	public void agregarItem(Item item) {
		items.add(item);
	}
	
	public Double calcularTotal () {
		Double total = 0.0;
		for (Item item : items) {
			total += item.costo();
		}
		return total;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
}
