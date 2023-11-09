package objetos.ejercicio17;

public class ClienteJuridico extends Cliente {
	private String CUIT;
	private String tipo;
	
	public ClienteJuridico (String nombre, String direccion, String telefono, String CUIT, String tipo) {
		super(nombre,direccion,telefono);
		this.CUIT = CUIT;
		this.tipo = tipo;
	}
}
