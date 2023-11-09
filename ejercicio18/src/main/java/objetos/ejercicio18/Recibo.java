package objetos.ejercicio18;

import java.time.LocalDate;

public class Recibo {
	private String nombre;
	private String apellido;
	private String CUIL;
	private int antiguedad;
	private LocalDate fechaRecibo;
	private double montoACobrar;
	
	public Recibo(String nombre, String apellido, String CUIL, int antiguedad, double montoACobrar) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.CUIL = CUIL;
		this.antiguedad = antiguedad;
		fechaRecibo = LocalDate.now();
		this.montoACobrar = montoACobrar;
	}
	
	
}
