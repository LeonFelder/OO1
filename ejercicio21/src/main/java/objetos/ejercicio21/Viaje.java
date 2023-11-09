package objetos.ejercicio21;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.ArrayList;

public class Viaje {
	private String origen;
	private String destino;
	private double costoTotal;
	private Vehiculo vehiculo;
	private LocalDate fecha;
	private int capacidadDisponible;
	private List<Usuario> viajeros;
	
	public Viaje (String origen, String destino, double costoTotal, Vehiculo vehiculo, LocalDate fecha) {
		this.origen = origen;
		this.destino = destino;
		this.costoTotal = costoTotal;
		this.vehiculo = vehiculo;
		this.fecha = fecha;
		capacidadDisponible = vehiculo.getCapacidadPasajeros();
		viajeros = new ArrayList<>();
		this.registrarPasajero(vehiculo.getDuenio());
	}
	
	public boolean diaSiguiente () {
		return LocalDate.now().plusDays(1).equals(fecha);
	}
	
	public void procesar () {
		double costoIndividual = costoTotal / (this.vehiculo.getCapacidadPasajeros()-capacidadDisponible);
		viajeros.forEach(v -> v.descontarSaldo(costoIndividual));
	}
	
	public boolean antiguo () {
		return LocalDate.now().isAfter(fecha);
	}
	
	public boolean ultimosTreinta () {
		return fecha.until(LocalDate.now(),ChronoUnit.DAYS) < 30;
	}
	
	public boolean registrarPasajero (Usuario pasajero) {
		boolean registrado = false;
		if (capacidadDisponible > 0 && (LocalDate.now().until(fecha,ChronoUnit.DAYS) > 2)) {
			viajeros.add(pasajero);
			capacidadDisponible -= 1;
			registrado = true;
		}
		return registrado;
	}
}
