package objetos.ejercicio17;

import java.util.List;
import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class Cliente {
	private String nombre;
	private String direccion;
	private String telefono;
	private List<Llamada> llamadas;
	private List<Factura> facturas;
	
	public Cliente (String nombre, String direccion, String telefono) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		llamadas = new ArrayList<>();
		facturas = new ArrayList<>();
	}
	
	public void registrarLlamada (Llamada llamada) {
		llamadas.add(llamada);
	}
	
	public String getTelefono () {
		return telefono;
	}
	
	public boolean esTuTelefono (String otroTelefono) {
		return telefono.equals(otroTelefono);
	}
	
	protected double calcularCostoTotal (LocalDateTime comienzo, LocalDateTime fin) {
		return llamadas.stream()
				.filter(llamada -> llamada.dentroDeRango(comienzo,fin))
				.mapToDouble(llamada -> llamada.calcularCosto())
				.sum();
	}
	
	public Factura facturar (LocalDateTime comienzo, LocalDateTime fin) {
		double costo = this.calcularCostoTotal(comienzo,fin);
		Factura factura = new Factura(this,comienzo,fin,costo);
		facturas.add(factura);
		return factura;
	}
}
