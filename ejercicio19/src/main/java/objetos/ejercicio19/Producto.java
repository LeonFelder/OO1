package objetos.ejercicio19;

public class Producto {
	private String nombre;
	private String descripcion;
	private double precio;
	private int cantUnidades;
	private Vendedor vendedor;
	
	public Producto(String nombre, String descripcion, double precio, int cantUnidades,Vendedor vendedor) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.cantUnidades = cantUnidades;
		this.vendedor = vendedor;
	}

	public boolean esSuNombre (String otroNombre) {
		return nombre.equals(otroNombre);
	}
	
	public boolean hayUnidades (int cantSolicitadas) {
		return cantUnidades >= cantSolicitadas;
	}
	
	public boolean actualizarUnidades (int cantSolicitadas) {
		if (this.hayUnidades(cantSolicitadas)) {
			this.cantUnidades -= cantSolicitadas;
			return true;
		}
		return false;
	}
	
	public double getPrecio () {
		return precio;
	}
	
	public Vendedor getVendedor() {
		return vendedor;
	}
}