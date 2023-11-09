package objetos.ejercicio16;

import java.time.LocalDate;

public class Estricta implements PoliticaCancelacion {

	@Override
	public double calcularDevolucion(LocalDate fechaCancelacion, Reserva reserva) {
		return 0;
	}

}
