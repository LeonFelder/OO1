package objetos.ejercicio12;

import java.util.List;
import java.util.ArrayList;

public class ReporteDeConstruccion {
	public List<Pieza> piezas;
	
	public ReporteDeConstruccion () {
		piezas = new ArrayList<>();
	}
	
	public double getVolumenDeMaterial (String material) {
		return piezas.stream()
				.filter(pieza -> pieza.getMaterial().equals(material))
				.mapToDouble(pieza -> pieza.getVolumen())
				.sum();
	}
	
	public double getSuperficieDeColor (String color) {
		return piezas.stream()
				.filter(pieza -> pieza.getColor().equals(color))
				.mapToDouble(pieza -> pieza.getSuperficie())
				.sum();
	}
}
