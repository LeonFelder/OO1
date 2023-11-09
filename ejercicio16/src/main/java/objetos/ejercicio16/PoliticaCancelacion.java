package objetos.ejercicio16;

import java.time.LocalDate;

public interface PoliticaCancelacion {
	public double calcularDevolucion(LocalDate fechaCancelacion,Reserva reserva);
}
