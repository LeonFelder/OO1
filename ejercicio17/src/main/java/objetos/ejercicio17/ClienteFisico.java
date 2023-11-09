package objetos.ejercicio17;

import java.time.LocalDateTime;

public class ClienteFisico extends Cliente {
	private String DNI;
	
	public ClienteFisico(String nombre, String direccion, String telefono, String DNI) {
		super(nombre, direccion, telefono);
		this.DNI = DNI;
	}

	public double calcularCostoTotal (LocalDateTime comienzo, LocalDateTime fin) {
		double costo = super.calcularCostoTotal(comienzo, fin);
		return costo * 0.9;
	}
}
