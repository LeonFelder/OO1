package objetos.ejercicio8;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.HashSet;
import java.util.List;

public class Distribuidora {
	private Double precioKWh;
	private Set<Usuario> usuarios;
	
	public Distribuidora (Double precioKWh) {
		this.precioKWh = precioKWh;
		usuarios = new HashSet<>();
	}
	
	public void agregarUsuario (Usuario usuario) {
		usuarios.add(usuario);
	}
	
	public List<Factura> facturar (){
		return this.usuarios.stream().map(usuario -> usuario.facturarEnBaseA(precioKWh)).collect(Collectors.toList());
	}
	
	public Double consumoTotalActiva () {
		return usuarios.stream().mapToDouble(usuario -> usuario.ultimoConsumoActiva()).sum();
	}
	
	public void precioKWh (Double precio) {
		precioKWh = precio;
	}
	
	public Set<Usuario> getUsuarios () {
		return new HashSet<>(usuarios);
	}
	
	public Double getPrecioKW () {
		return precioKWh;
	}
}
