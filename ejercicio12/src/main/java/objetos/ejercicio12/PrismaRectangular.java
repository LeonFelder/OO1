package objetos.ejercicio12;

public class PrismaRectangular extends Pieza {
	private int ladoMayor;
	private int ladoMenor;
	private int altura;
	
	public double getVolumen() {
		return ladoMayor * ladoMenor * altura;
	}
	
	public double getSuperficie () {
		return 2 * (ladoMayor * ladoMenor + ladoMayor * altura + ladoMenor * altura);
	}

	public int getLadoMayor() {
		return ladoMayor;
	}

	public void setLadoMayor(int ladoMayor) {
		this.ladoMayor = ladoMayor;
	}

	public int getLadoMenor() {
		return ladoMenor;
	}

	public void setLadoMenor(int ladoMenor) {
		this.ladoMenor = ladoMenor;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
}
