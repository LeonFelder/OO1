package objetos.ejercicio8;

import java.time.LocalDate;

public class Consumo {
	private LocalDate fecha;
	private Double consumoEnergiaActiva;
	private Double consumoEnergiaReactiva;
	
	public Consumo (LocalDate fecha, Double consumoEnergiaActiva, Double consumoEnergiaReactiva) {
		this.fecha = fecha;
		this.consumoEnergiaActiva = consumoEnergiaActiva;
		this.consumoEnergiaReactiva = consumoEnergiaReactiva;
	}
	
	public Double costoEnBaseA (Double precioKWh) {
		return consumoEnergiaActiva * precioKWh;
	}
	
	public Double factorDePotencia () {
		return consumoEnergiaActiva / Math.sqrt(Math.pow(consumoEnergiaActiva,2) + Math.pow(consumoEnergiaReactiva,2)); 
	}
	
	public Double getConsumoEnergiaActiva () {
		return consumoEnergiaActiva;
	}
	
	public LocalDate getFecha () {
		return fecha;
	}
}
