package objetos.ejercicio17;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Factura {
	private Cliente cliente;
	private LocalDate fecha;
	private LocalDateTime inicioPeriodo;
	private LocalDateTime finPeriodo;
	private double montoTotal;
	
	public Factura(Cliente cliente, LocalDateTime inicioPeriodo, LocalDateTime finPeriodo, double montoTotal) {
		this.cliente = cliente;
		this.fecha = LocalDate.now();
		this.inicioPeriodo = inicioPeriodo;
		this.finPeriodo = finPeriodo;
		this.montoTotal = montoTotal;
	}
}
