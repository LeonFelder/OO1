package objetos.ejercicio5;

import java.time.LocalDate;

public class Mamifero {
	private String id;
	private String especie;
	private LocalDate fecha;
	private Mamifero padre;
	private Mamifero madre;
	
	public Mamifero () {
		id = "";
		especie = "";
		fecha = LocalDate.now();
	}
	
	public Mamifero (String id) {
		this.id = id;
		especie = "";
		fecha = LocalDate.now();
	}
	
	public String getIdentificador () {
		return id;
	}
	
	public void setIdentificador (String id) {
		this.id = id;
	}
	
	public String getEspecie () {
		return especie;
	}
	
	public void setEspecie (String especie) {
		this.especie = especie;
	}
	
	public LocalDate getFechaNacimiento () {
		return fecha;
	}
	
	public void setFechaNacimiento (LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public Mamifero getPadre () {
		return padre;
	}
	
	public void setPadre (Mamifero padre) {
		this.padre = padre;
	}
	
	public Mamifero getMadre () {
		return madre;
	}
	
	public void setMadre (Mamifero madre) {
		this.madre = madre;
	}
	
	public Mamifero getAbueloMaterno () {
		Mamifero abuelo = null;
		if (this.madre != null) {
			abuelo = madre.getPadre();
		}
		return abuelo;
	}
	
	public Mamifero getAbuelaMaterna () {
		Mamifero abuela = null;
		if (this.madre != null) {
			abuela = madre.getMadre();
		}
		return abuela;
	}
	
	public Mamifero getAbueloPaterno () {
		Mamifero abuelo = null;
		if (this.padre != null) {
			abuelo = padre.getPadre();
		}
		return abuelo;
	}
	
	public Mamifero getAbuelaPaterna () {
		Mamifero abuela = null;
		if (this.padre != null) {
			abuela = padre.getMadre();
		}
		return abuela;
	}
	
	public Boolean tieneComoAncestroA (Mamifero mamifero) {
		Boolean tiene = false;
		if(((madre != null) && (madre.equals(mamifero))) || ((padre != null) &&(padre.equals(mamifero)))) {
			tiene = true;
		} else {
			if ((padre != null))
				tiene = padre.tieneComoAncestroA(mamifero);
			if ((!tiene) && (madre != null))
				tiene = madre.tieneComoAncestroA(mamifero);
		}
		return tiene;
	}
	
	public boolean equals (Mamifero otro) {
		return especie.equals(otro.getEspecie()) && 
				id.equals(otro.getIdentificador()) &&
				fecha.equals(otro.getFechaNacimiento());
	}
}
