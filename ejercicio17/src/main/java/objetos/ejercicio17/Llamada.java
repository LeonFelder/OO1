package objetos.ejercicio17;

import java.time.LocalDateTime;

public abstract class Llamada {
	protected LocalDateTime comienzo;
	protected int duracion;
	private String llama;
	private String llamado;
	
	public Llamada(LocalDateTime comienzo, int duracion, String llama, String llamado) {
		this.comienzo = comienzo;
		this.duracion = duracion;
		this.llama = llama;
		this.llamado = llamado;
	}
	
	public boolean dentroDeRango (LocalDateTime desde,LocalDateTime hasta) {
		return (comienzo.isAfter(desde) && comienzo.isBefore(hasta)) || comienzo.equals(desde) || comienzo.equals(hasta);
	}
	
	public abstract double calcularCosto ();
}