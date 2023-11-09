package objetos.ejercicio8;

import java.time.LocalDate;
import java.util.Date;

public class Factura {
	private Double montoEnergiaActiva;
	private Double descuento;
	private LocalDate fecha;
	private Usuario usuario;
	
	public Factura (Double montoEnergiaActiva, Double descuento, Usuario usuario) {
		this.montoEnergiaActiva = montoEnergiaActiva;
		this.descuento = descuento;
		this.usuario = usuario;
		fecha = LocalDate.now();
	}
	
	public Double montoTotal () {
		return montoEnergiaActiva - (1 - descuento / 100);
	}
	
	public Usuario usuario () {
		return usuario;
	}
	
	public LocalDate fecha () {
		return LocalDate.now();
	}
	
	public Double getDescuento () {
		return descuento;
	}

	public Double getMontoEnergiaActiva() {
		return montoEnergiaActiva;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public Usuario getUsuario() {
		return usuario;
	}
}
