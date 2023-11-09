package objetos.ejercicio15;

import java.time.LocalDate;

import objetos.ejercicio14.DateLapse1;

public class Reserva {
	private Usuario inquilino;
	private Propiedad propiedad;
	private DateLapse1 periodo;
	
	public Reserva (Usuario inquilino, Propiedad propiedad, DateLapse1 periodo) {
		this.inquilino = inquilino;
		this.propiedad = propiedad;
		this.periodo = periodo;
	}
	
	public boolean posterior() {
		return this.periodo.getFrom().isAfter(LocalDate.now());
	}
	
	public boolean superpuesta (DateLapse1 otroPeriodo) {
		return periodo.overlaps(otroPeriodo);
	}
	
	public double calcularPrecio () {
		return propiedad.getPrecioNoche() * periodo.sizeInDays();
	}
	
	public Usuario getInquilino() {
		return inquilino;
	}

	public Propiedad getPropiedad() {
		return propiedad;
	}

	public DateLapse1 getPeriodo() {
		return periodo;
	}
}
