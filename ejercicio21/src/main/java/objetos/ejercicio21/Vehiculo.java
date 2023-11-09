package objetos.ejercicio21;

import java.time.LocalDate;

public class Vehiculo {
	private Conductor duenio;
	private String descripcion;
	private int capacidadPasajeros;
	private int anioFabricacion;
	private double valor;
	
	public Vehiculo (String descripcion, int capacidadPasajeros, int anioFabricacion, double valor) {
		this.descripcion = descripcion;
		this.capacidadPasajeros = capacidadPasajeros;
		this.anioFabricacion = anioFabricacion;
		this.valor = valor;
	}
	
	public void setDuenio (Conductor duenio) {
		this.duenio = duenio;
	}
	
	public int getAntiguedad () {
		return LocalDate.now().getYear() - anioFabricacion;
	}
	
	public int getCapacidadPasajeros () {
		return capacidadPasajeros;
	}
	
	public double getValor () {
		return valor;
	}
	
	public Usuario getDuenio () {
		return duenio;
	}
}
