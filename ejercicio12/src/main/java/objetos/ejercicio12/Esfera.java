package objetos.ejercicio12;

public class Esfera extends Pieza {
	private int radio;
	
	public double getVolumen() {
		return 4/3 * Math.PI * Math.pow(radio, 3);
	}
	
	public double getSuperficie () {
		return 4 * Math.PI * Math.pow(radio, 2);
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
}
