package objetos.ejercicio17;

import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

public class Sistema {
	private List<Cliente> clientes;
	private List<String> numeros;
	
	public Sistema () {
		clientes =  new ArrayList<>();
		numeros = new ArrayList<>();
	}
	
	public void agregarNumero (String numero) {
		numeros.add(numero);
	}
	
	private String getNumero () {
		String numero = numeros.get(0);
		numeros.remove(0);
		return numero;
	}
	
	public Cliente agregarCliente (String nombre, String direccion, String DNI) {
		Cliente nuevo = null;
		if (!numeros.isEmpty()) {
			nuevo = new ClienteFisico(nombre,direccion,this.getNumero(),DNI);
			clientes.add(nuevo);
		}
		return nuevo;
	}
	
	public Cliente agregarCliente (String nombre, String direccion, String CUIT, String tipo) {
		Cliente nuevo = null;
		if (!numeros.isEmpty()) {
			nuevo = new ClienteJuridico(nombre,direccion,this.getNumero(),CUIT,tipo);
			clientes.add(nuevo);
		}
		return nuevo;
	}
	
	private Cliente encontrarCliente (String telefono) {
		return clientes.stream().filter(c -> c.esTuTelefono(telefono)).findFirst().orElse(null);
	}
	
	public Llamada registrarLlamada (LocalDateTime comienzo, int duracion, String llama, String llamado) {
		Llamada llamada = new LlamadaLocal(comienzo,duracion,llama,llamado);
		encontrarCliente(llama).registrarLlamada(llamada);
		return llamada;
	}
	
	public Llamada registrarLlamada (LocalDateTime comienzo, int duracion, String llama, String llamado, int distancia) {
		Llamada llamada = new LlamadaInterurbana(comienzo,duracion,llama,llamado,distancia);
		encontrarCliente(llama).registrarLlamada(llamada);
		return llamada;
	}
	
	public Llamada registrarLlamada (LocalDateTime comienzo, int duracion, String llama, String llamado, String origen, String destino) {
		Llamada llamada = new LlamadaInternacional(comienzo,duracion,llama,llamado,origen, destino);
		encontrarCliente(llama).registrarLlamada(llamada);
		return llamada;
	}
	
	public Factura facturarCliente (Cliente cliente, LocalDateTime comienzo, LocalDateTime fin) {
		return cliente.facturar(comienzo, fin);
	}
}
