package objetos.ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Email {
	private String titulo;
	private String cuerpo;
	private List<Archivo> adjuntos;

	public int tamaño () {
		return titulo.length() + cuerpo.length() + adjuntos.stream()
		.mapToInt(archivo -> archivo.tamaño())
		.sum();
	}

	public boolean buscar (String texto) {
		boolean encontre = false;
		if (!texto.equals("")) {
			encontre = titulo.contains(texto);
			if (!encontre) {
				encontre = cuerpo.contains(texto);
			}
		}
		return encontre;
	}

	public Email (String titulo, String cuerpo) {
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		adjuntos = new ArrayList<>();
	}

	public void agregarAdjunto (Archivo adjunto) {
		adjuntos.add(adjunto);
	}
	
	public String getTitulo () {
		return titulo;
	}
	
	public String getCuerpo () {
		return cuerpo;
	}
}
