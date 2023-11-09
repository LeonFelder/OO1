package objetos.ejercicio6;

public class Foco {
	private String marca;
	private int cantCicloEncendido;
	
	public Foco (String marca, int cantCicloEncendido) {
		this.marca = marca;
		this.cantCicloEncendido = cantCicloEncendido;
	}
	
	public void	contabilizarCiclo(){
		cantCicloEncendido--;
	}
	
	public boolean estaVencido () {
		return cantCicloEncendido <= 0;
	}
}
