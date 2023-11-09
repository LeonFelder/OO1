package objetos.ejercicio11;

import java.util.List;
import java.util.ArrayList;

public class Inversor {
	String nombre;
	List<Inversion> inversiones;
	
	public Inversor (String nombre) {
		this.nombre = nombre;
		inversiones = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Inversion> getInversiones() {
		return new ArrayList<>(inversiones);
	}

	public void agregarInversion(Inversion inversion) {
		inversiones.add(inversion);
	}
	
	public double valorActual() {
		return inversiones.stream().
		mapToDouble(inversion -> inversion.valorActual()).
		sum();
	}
}
