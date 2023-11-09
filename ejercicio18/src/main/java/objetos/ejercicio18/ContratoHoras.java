package objetos.ejercicio18;

import java.time.LocalDate;

public class ContratoHoras extends Contrato {
	private double valorHora;
	private int horasMes;
	private LocalDate fechaFin;
	
	public ContratoHoras(Empleado empleado, LocalDate fechaInicio, double valorHora, int horaMes, LocalDate fechaFin) {
		super(empleado, fechaInicio);
		this.valorHora = valorHora;
		this.horasMes = horaMes;
		this.fechaFin = fechaFin;
	}
	
	public boolean estaVencido () {
		return fechaFin.isBefore(LocalDate.now());
	}
	
	public double calcularMonto () {
		return valorHora*horasMes;
	}
}
