package objetos.ejercicio18;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ContratoPlanta extends Contrato {
	private double sueldo;
	private double montoConyuge;
	private double montoHijos;
	
	public ContratoPlanta(Empleado empleado, LocalDate fechaInicio, double sueldo, double montoConyuge, double montoHijos) {
		super(empleado, fechaInicio);
		this.sueldo = sueldo;
		this.montoConyuge = montoConyuge;
		this.montoHijos = montoHijos;
	}

	public boolean estaVencido () {
		return false;
	}
	
	public double calcularMonto () {
		double monto = sueldo;
		if (this.getEmpleado().tieneConyuge()) {
			monto += montoConyuge;
		}
		if (this.getEmpleado().tieneHijos()) {
			monto += montoHijos;
		}
		return monto;
	}
}
