package ar.edu.unlp.info.oo1.figurasYCuerpos;

public class Circulo implements Figura{
	private Double radio;
	
	public Double getDiametro () {
		return radio*2;
	}
	
	public void setDiametro (Double valor) {
		radio = valor/2;
	}
	
	public Double getRadio () {
		return radio;
	}
	
	public void setRadio (Double valor) {
		radio = valor;
	}
	
	public Double getPerimetro () {
		return this.getDiametro()*Math.PI;
	}
	
	public Double getArea () {
		return radio*radio*Math.PI;
	}
}
