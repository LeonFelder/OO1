package objetos.ejercicio13;

import java.util.List;
import java.util.ArrayList;

public class ClienteDeCorreo {
	private Carpeta inbox;
	private List<Carpeta> carpetas;

	public ClienteDeCorreo (Carpeta inbox) {
		carpetas = new ArrayList<>();
		carpetas.add(inbox);
	}
	
	public void recibir (Email email) {
		inbox.agregarEmail(email);
	}

	public void mover (Email email, Carpeta origen, Carpeta destino) {
		destino.agregarEmail(email);
		origen.eliminarEmail(email);
	}

	public Email buscar (String texto) {
		return carpetas.stream()
				.map(carpeta -> carpeta.buscar(texto))
				.findFirst().orElse(null);
	}

	public int espacioOcupado() {
		return carpetas.stream()
				.mapToInt(carpeta -> carpeta.espacioOcupado())
				.sum();
	}
}