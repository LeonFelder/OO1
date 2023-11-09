package objetos.ejercicio17;

import java.time.LocalDateTime;

public class LlamadaInterurbana extends Llamada {
	private int distancia;
	
	public LlamadaInterurbana(LocalDateTime comienzo, int duracion, String llama, String llamado, int distancia) {
		super(comienzo, duracion, llama, llamado);
		this.distancia = distancia;
	}
	
	public double calcularCosto () {
		double costo;
		if (distancia < 100)
			costo = 2 * duracion;
		else if (distancia <= 500)
			costo = 2.5 * duracion;
		else
			costo = 3 * duracion;
		return 5 + costo;
	}
}
