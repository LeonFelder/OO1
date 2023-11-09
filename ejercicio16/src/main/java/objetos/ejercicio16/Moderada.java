package objetos.ejercicio16;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Moderada implements PoliticaCancelacion {

	@Override
	public double calcularDevolucion(LocalDate fechaCancelacion, Reserva reserva) {
		int dias = (int) fechaCancelacion.until(reserva.getPeriodo().getFrom(), ChronoUnit.DAYS);
		double devolver = reserva.calcularPrecio();
		if (dias < 7) {
			if (dias < 2) {
				devolver = 0;
			}else {
				devolver = devolver / 2;
			}
		}
		return devolver;
	}

}
