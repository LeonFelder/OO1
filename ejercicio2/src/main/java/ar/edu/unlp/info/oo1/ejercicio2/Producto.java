package ar.edu.unlp.info.oo1.ejercicio2;

public class Producto {
	
	private Double peso;
	private Double precioPorKilo;
	private String descripcion;
	
	public Producto () {
		
	}
	
	public Producto (Double peso,Double precioPorKilo, String descripcion) {
		this.peso = peso;
		this.precioPorKilo = precioPorKilo;
		this.descripcion = descripcion;
	}
	
	public Double getPrecio () {
		return precioPorKilo * peso;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getPrecioPorKilo() {
		return precioPorKilo;
	}

	public void setPrecioPorKilo(Double precioPorKilo) {
		this.precioPorKilo = precioPorKilo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
