package objetos.ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Carpeta {
	private List<Email> emails;
	private String nombre;

	public Carpeta(String nombre) {
		this.nombre = nombre;
		emails = new ArrayList<>();
	}

	public int espacioOcupado () {
		return emails.stream()
				.mapToInt(email -> email.tamaño())
				.sum();
	}

	public Email buscar (String texto) {
		return emails.stream()
				.filter(email -> email.buscar(texto))
				.findFirst().orElse(null);
	}

	public void eliminarEmail(Email email) {
		emails.remove(email);
	}

	public void agregarEmail (Email email) {
		emails.add(email);
	}

	public String getNombre() {
		return nombre;
	}
}
