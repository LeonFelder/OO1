package objetos.ejercicio6;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Farola {
	private Boolean turned;
	private List<Farola> vecinas;
	private Foco foco;
	/*
	* Crear una farola. Debe inicializarla como apagada
	*/
	public Farola (String fabricante, int cantidadDeCiclos) {
		turned = false;
		vecinas = new ArrayList<>();
	}
	/*
	* Crea la relación de vecinos entre las farolas. La relación de vecinos entre las farolas es recíproca, es decir el receptor del mensaje será vecino de otraFarola, al igual que otraFarola también se convertirá en vecina del receptor del mensaje
	*/
	public void pairWithNeighbor( Farola otraFarola ) {
		if (!this.vecinas.contains(otraFarola)) {
			vecinas.add(otraFarola);
			otraFarola.pairWithNeighbor(this);
		}
	}
	/*
	* Retorna sus farolas vecinas
	*/
	public List<Farola> getNeighbors (){
		return new ArrayList<>(vecinas);
	}


	/*
	* Si la farola no está encendida, la enciende y propaga la acción.
	*/
	public void turnOn() {
		if (!isOn()) {
			turned = true;
			foco.contabilizarCiclo();
			vecinas.forEach(faro -> faro.turnOn());
		}
	}

	/*
	* Si la farola no está apagada, la apaga y propaga la acción.
	*/
	public void turnOff() {
		if (isOn()) {
			turned = false;
			vecinas.forEach(faro -> faro.turnOff());
		}
	}

	/*
	* Retorna true si la farola está encendida.
	*/
	public boolean isOn() {
		return turned;
	}
	
	public boolean estaVencida () {
		return foco.estaVencido();
	}
	
	public void recolectarFarolas (List<Farola> lista) {
		if(!lista.contains(this)) {
			lista.add(this);
			for (Farola vecina : this.getNeighbors())
				vecina.recolectarFarolas(lista);
		}
	}
	
	public List<Farola> todasLasFarolas(){
		List<Farola> todasLasFarolas = new ArrayList<Farola>();
		this.recolectarFarolas(todasLasFarolas);
		return todasLasFarolas;
	}
	/*
	* Retorna una lista con las farolas que están en la red de la farola
	receptora y que poseen focos vencidos. Incluyendo el chequeo entre las
	farolas vecinas y las vecinas de estas propagando en toda la red.
	*/
	public List<Farola> farolasConFocosVencidos(){
		return this.todasLasFarolas().stream()
				.filter(farola -> farola.estaVencida())
				.collect(Collectors.toList());
	}
}