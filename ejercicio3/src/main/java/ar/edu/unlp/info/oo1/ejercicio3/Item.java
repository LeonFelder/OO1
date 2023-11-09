package ar.edu.unlp.info.oo1.ejercicio3;

public class Item {
	private String detalle;
	private Integer cantidad;
	private Double costoUnitario;
	
	public Item () {
		
	}
	
	public Item (String detalle,Integer cantidad,Double costoUnitario) {
		this.detalle = detalle;
		this.cantidad = cantidad;
		this.costoUnitario = costoUnitario;
	}
	
	public Double costo () {
		return costoUnitario*cantidad;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getCostoUnitario() {
		return costoUnitario;
	}

	public void setCostoUnitario(Double costoUnitario) {
		this.costoUnitario = costoUnitario;
	}
}
