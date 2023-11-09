package objetos.ejercicio17;

import java.time.LocalDateTime;

public class LlamadaInternacional extends Llamada {
	private String origen;
	private String destino;
	
	public LlamadaInternacional(LocalDateTime comienzo, int duracion, String llama, String llamado, String origen, String destino) {
		super(comienzo, duracion, llama, llamado);
		this.origen = origen;
		this.destino = destino;
	}

	public double calcularCosto() {
		double costo;
		if ((comienzo.getHour() >= 8) && (comienzo.getHour() < 20))
			costo = duracion * 4;
		else
			costo = duracion * 3;
		return costo;
	}
}
