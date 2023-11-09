package objetos.ejercicio17;

import java.time.LocalDateTime;

public class LlamadaLocal extends Llamada {

	public LlamadaLocal(LocalDateTime comienzo, int duracion, String llama, String llamado) {
		super(comienzo, duracion, llama, llamado);
	}
	
	public double calcularCosto () {
		return duracion;
	}
}
