package objetos.ejercicio8;

import java.util.List;
import java.util.ArrayList;

public class Usuario {
	private String domicilio;
	private String nombre;
	private List<Factura> facturas;
	private List<Consumo> consumos;
	
	public Usuario (String nombre, String domicilio) {
		this.nombre = nombre;
		this.domicilio = domicilio;
		facturas = new ArrayList<>();
		consumos = new ArrayList<>();
	}
	
	public void agregarMedicion (Consumo medicion) {
		consumos.add(medicion);
	}
	
	public Consumo ultimoConsumo () {
		return consumos.stream()
				.max((Consumo c1, Consumo c2) -> c1.getFecha().compareTo(c2.getFecha())).orElse(null); 
	}
	
	public Double ultimoConsumoActiva() {
		Double consumo = 0d;
		Consumo ultimoConsumo = this.ultimoConsumo();
		if (ultimoConsumo != null)
			consumo = ultimoConsumo.getConsumoEnergiaActiva();
		return consumo;
	}
	
	public Factura facturarEnBaseA (Double precioKWh) {
		Consumo ultimoConsumo = this.ultimoConsumo();
		Factura factura;
		if (ultimoConsumo != null) {
			Double descuento = 0d;
			if (ultimoConsumo.factorDePotencia() > 0.8)
				descuento = 10d;
			factura = new Factura(ultimoConsumo.costoEnBaseA(precioKWh),descuento, this);
			this.agregarFactura(factura);
		} else
			factura = new Factura(0d,0d,this);
		return factura;
		
	}
	
	public List<Factura> facturas (){
		return facturas;
	}
	
	public void agregarFactura(Factura factura) {
		facturas.add(factura);
	}
}
