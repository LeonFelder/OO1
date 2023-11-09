package objetos.ejercicio16;

import java.time.LocalDate;

public class Flexible implements PoliticaCancelacion {

	@Override
	public double calcularDevolucion(LocalDate fechaCancelacion, Reserva reserva) {
		return reserva.calcularPrecio();
	}

}
