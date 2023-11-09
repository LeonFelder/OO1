package objetos.ejercicio21;

import java.util.List;
import java.util.stream.Collectors;
import java.time.LocalDate;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;

public class Aplicacion {
	private List<Usuario> usuarios;
	private List<Viaje> viajes;
	
	public Aplicacion () {
		usuarios = new ArrayList<>();
		viajes = new ArrayList<>();
	}
	
	public Conductor agregarConductor (String nombre, Vehiculo vehiculo) {
		Conductor conductor = new Conductor (nombre, vehiculo);
		usuarios.add(conductor);
		return conductor;
	}
	
	public Pasajero agregarPasajero (String nombre) {
		Pasajero pasajero = new Pasajero (nombre);
		usuarios.add(pasajero);
		return pasajero;
	}
	
	public void cargarSaldo (Usuario usuario, double monto) {
		usuario.cargarSaldoRecargo(monto);
	}
	
	public Viaje registrarViaje (String origen, String destino, double costoTotal, Vehiculo vehiculo, LocalDate fecha) {
		Viaje viaje = null;
		if ((LocalDate.now().until(fecha,ChronoUnit.DAYS) > 2) && (vehiculo.getDuenio().tieneSaldo())) {
			viaje = new Viaje (origen, destino, costoTotal, vehiculo, fecha);
			viajes.add(viaje);
		}
		return viaje;
	}
	
	public List<Viaje> viajesDiaSiguiente (){
		return viajes.stream()
				.filter(v -> v.diaSiguiente())
				.collect(Collectors.toList());
	}
	
	public void procesarViajes () {
		viajes.forEach(v -> v.procesar());
	}
	
	public List<Usuario> listarUsuariosSaldo(){
		return usuarios.stream()
				.sorted((u1,u2) -> Double.compare(u1.getSaldo(), u2.getSaldo()))
				.collect(Collectors.toList());
	}
	
	public void cargarMontoRegalo (double monto) {
		usuarios.forEach(v -> v.cargarSaldo(monto));
	}
	
	public boolean registrarViajePasajero (Usuario pasajero, Viaje viaje) {
		boolean registrado = false;
		if (pasajero.tieneSaldo()) {
			registrado = viaje.registrarPasajero(pasajero);
		}
		return registrado;
	}
}
