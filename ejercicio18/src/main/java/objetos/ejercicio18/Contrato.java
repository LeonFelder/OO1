package objetos.ejercicio18;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Contrato {
	private Empleado empleado;
	private LocalDate fechaInicio;
	
	public Contrato (Empleado empleado, LocalDate fechaInicio) {
		this.empleado = empleado;
		this.fechaInicio = fechaInicio;
	}
	
	public Empleado getEmpleado() {
		return empleado;
	}
	
	public abstract boolean estaVencido ();
	public abstract double calcularMonto ();
	
	public int calcularAntiguedad() {
		return (int) fechaInicio.until(LocalDate.now(),ChronoUnit.YEARS);
	}
}
