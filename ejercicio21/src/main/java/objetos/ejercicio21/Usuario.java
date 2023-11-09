package objetos.ejercicio21;

import java.util.List;
import java.util.ArrayList;

public abstract class Usuario {
	private String nombre;
	private double saldo;
	protected List<Viaje> viajes;
	
	public Usuario (String nombre) {
		this.nombre = nombre;
		saldo = 0;
		viajes = new ArrayList<>();
	}
	
	public void cargarSaldo (double monto) {
		saldo += monto;
	}
	
	public void descontarSaldo (double monto) {
		saldo -= monto;
	}
	
	public boolean tieneSaldo () {
		return saldo >= 0;
	}
	
	public void agregarViaje (Viaje  viaje) {
		viajes.add(viaje);
	}
	
	public double getSaldo () {
		return saldo;
	}
	
	public abstract void cargarSaldoRecargo (double monto);
}
