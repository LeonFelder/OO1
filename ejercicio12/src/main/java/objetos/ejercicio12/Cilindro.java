package objetos.ejercicio12;

public class Cilindro extends Pieza {
	private int radio;
	private int altura;
	
	public double getVolumen() {
		return Math.PI * Math.pow(radio, 2) * altura;
	}
	
	public double getSuperficie () {
		return 2 * Math.PI * radio * altura + 2 * Math.PI * Math.pow(radio, 2);
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
}
