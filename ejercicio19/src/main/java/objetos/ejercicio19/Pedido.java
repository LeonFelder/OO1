package objetos.ejercicio19;

public class Pedido {
	private Cliente cliente;
	private Producto producto;
	private int cantSolicitada;
	private OpcionPago opcionPago;
	private MecanismoEnvio mecanismoEnvio;
	
	public Pedido(Producto producto, int cantSolicitada, OpcionPago opcionPago, MecanismoEnvio mecanismoEnvio,Cliente cliente) {
		this.producto = producto;
		this.cantSolicitada = cantSolicitada;
		this.opcionPago = opcionPago;
		this.mecanismoEnvio = mecanismoEnvio;
		producto.actualizarUnidades(cantSolicitada);
		this.cliente = cliente;
	}

	public double calcularCosto () {
		return opcionPago.devolverPrecioFinal(producto.getPrecio()*cantSolicitada) + mecanismoEnvio.costoEnvio(cliente.getDireccion(),producto.getVendedor().getDireccion());
	}
}
