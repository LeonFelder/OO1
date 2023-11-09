package objetos.ejercicio15;

import java.util.List;
import java.util.ArrayList;
import objetos.ejercicio14.DateLapse1;

public class Propiedad {
	private String nombre;
	private String descripcion;
	private double precioNoche;
	private String direccion;
	private Usuario propietario;
	private List<Reserva> reservas;
	
	public Propiedad(String nombre, String descripcion, double precioNoche, String direccion, Usuario propietario) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precioNoche = precioNoche;
		this.direccion = direccion;
		this.propietario = propietario;
		reservas = new ArrayList<>();
	}
	
	public boolean disponible (DateLapse1 periodo) {
		return reservas.stream()
		.noneMatch(r -> r.superpuesta(periodo));
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public double getPrecioNoche() {
		return precioNoche;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public Usuario getPropietario() {
		return propietario;
	}
	
	public void registrarReserva (Reserva reserva) {
		reservas.add(reserva);
	}
	
	public void eliminarReserva (Reserva reserva) {
		reservas.remove(reserva);
	}
	
	public List<Reserva> getReservas (){
		return new ArrayList<Reserva>(reservas);
	}
	
	public double gananciaEnPeriodo(DateLapse1 periodo) {
		return reservas.stream()
				.filter(r -> r.superpuesta(periodo))
				.mapToDouble(r -> r.calcularPrecio())
				.sum();
	}
}
