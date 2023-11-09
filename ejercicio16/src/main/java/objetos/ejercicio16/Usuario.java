package objetos.ejercicio16;

import java.util.List;
import java.util.ArrayList;
import objetos.ejercicio14.DateLapse1;

public class Usuario {
	private String nombre;
	private String direccion;
	private double DNI;
	private List<Reserva> reservas;
	private List<Propiedad> propiedades;
	
	public Usuario (String nombre, String direccion, double DNI) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.DNI = DNI;
		reservas = new ArrayList<>();
		propiedades = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public double getDNI() {
		return DNI;
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
	
	public void agregarPropiedad (Propiedad propiedad) {
		propiedades.add(propiedad);
	}
	
	public void eliminarPropiedad (Propiedad propiedad) {
		propiedades.remove(propiedad);
	}
	
	public List<Propiedad> getPropiedades (){
		return new ArrayList<Propiedad>(propiedades);
	}
	
	public double getIngresos (DateLapse1 periodo) {
		return propiedades.stream()
			.mapToDouble(p -> p.gananciaEnPeriodo(periodo))
			.sum();
	}
}
