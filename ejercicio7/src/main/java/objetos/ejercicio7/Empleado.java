package objetos.ejercicio7;

public class Empleado {
	private String nombre;
	
	public Empleado (String nombre) {
		this.nombre = nombre;
	}
	
	public double montoBasico() {
		return 35000;
	}
	
	public double aportes () {
		return 13500;
	}
	
	public double sueldoBasico () {
		return this.montoBasico() + this.aportes();
	}
}
