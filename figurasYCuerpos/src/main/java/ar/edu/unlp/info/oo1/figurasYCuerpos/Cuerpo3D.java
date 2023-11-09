package ar.edu.unlp.info.oo1.figurasYCuerpos;

public class Cuerpo3D {
	Figura caraBasal;
	Double altura;
	
	public void setAltura (Double valor) {
		altura = valor;
	}
	
	public Double getAltura (){
		return altura;
	}
	
	public void setCaraBasal (Figura cara) {
		caraBasal = cara;
	}
	
	public Double getVolumen() {
		return caraBasal.getArea()*altura;
	}
	
	public Double getSuperficieExterior () {
		return 2*caraBasal.getArea()+caraBasal.getPerimetro()*altura;
	}
}
