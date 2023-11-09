package ar.edu.unlp.info.oo1.figurasYCuerpos;

public class Cuadrado implements Figura{
	private Double lado;
	
	public void setLado(Double valor) {
		lado = valor;
	}
	
	public Double getLado () {
		return lado;
	}
	
	public Double getPerimetro () {
		return lado*4;
	}
	
	public Double getArea() {
		return lado*lado;
	}
}
