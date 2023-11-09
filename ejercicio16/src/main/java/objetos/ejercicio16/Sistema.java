package objetos.ejercicio16;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.time.LocalDate;

public class Sistema {
	private List<Usuario> usuarios;
	private List<Reserva> reservas;
	private List<Propiedad> propiedades;
	
	public Sistema () {
		usuarios = new ArrayList<>();
		reservas = new ArrayList<>();
		propiedades = new ArrayList<>();
	}
	public Usuario registrarUsuario (String nombre, String direccion, double DNI) {
		Usuario usuario = new Usuario(nombre, direccion, DNI);
		usuarios.add(usuario);
		return usuario;
	}
	
	public Propiedad registrarPropiedad (String nombre, String descripcion, double precioNoche, String direccion, Usuario propietario,PoliticaCancelacion politica) {
		Propiedad nueva = new Propiedad(nombre, descripcion,precioNoche,direccion,propietario,politica);
		propiedades.add(nueva);
		propietario.agregarPropiedad(nueva);
		return nueva;
	}
	
	public Reserva reservar (Propiedad propiedad, DateLapse1 periodo, Usuario usuario) {
		Reserva reserva= null;
		if (propiedad.disponible(periodo)) {
			reserva = new Reserva(usuario,propiedad,periodo);
			propiedad.registrarReserva(reserva);
			usuario.registrarReserva(reserva);
		}
		return reserva;
	}
	
	public List<Propiedad> buscarPropiedad (DateLapse1 periodo){
		return propiedades.stream()
				.filter(propiedad -> propiedad.disponible(periodo))
				.collect(Collectors.toList());
	}
	
	public double calcularPrecio (Reserva reserva) {
		return reserva.calcularPrecio();
	}
	
	public double eliminarReserva (Reserva reserva,LocalDate fecha) {
		double devolver = 0;
		if (reserva.posterior()) {
			reservas.remove(reserva);
			devolver = reserva.getPropiedad().eliminarReserva(reserva,fecha);
			reserva.getInquilino().eliminarReserva(reserva);
		}
		return devolver;
	}
	
	public List<Reserva> getReservas (Usuario usuario){
		return usuario.getReservas();
	}
	
	public double calcularIngresos (Usuario propietario,DateLapse1 periodo) {
		return propietario.getIngresos(periodo);
	}
}
