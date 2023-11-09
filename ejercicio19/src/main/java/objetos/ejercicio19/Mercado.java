package objetos.ejercicio19;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Mercado {

		private List<Vendedor> vendedores;
		private List<Cliente> clientes;
		
		public Mercado () {
			vendedores = new ArrayList<>();
			clientes = new ArrayList<>();
		}
		
		public Vendedor agregarVendedor (String nombre, String direccion) {
			Vendedor nuevo = new Vendedor (nombre,direccion);
			vendedores.add(nuevo);
			return nuevo;
		}
		
		public Vendedor buscarVendedor (String nombre) {
			return vendedores.stream()
					.filter(v -> v.esSuNombre(nombre))
					.findFirst().orElse(null);
		}

		public Cliente agregarCliente (String nombre, String direccion) {
			Cliente nuevo = new Cliente (nombre,direccion);
			clientes.add(nuevo);
			return nuevo;
		}
		
		public Cliente buscarCliente (String nombre) {
			return clientes.stream()
					.filter(v -> v.esSuNombre(nombre))
					.findFirst().orElse(null);
		}
		
		public Producto agregarProducto (String nombre, String descripcion, double precio, int cantUnidades, Vendedor vendedor) {
			Producto nuevo = new Producto (nombre, descripcion, precio, cantUnidades,vendedor);
			vendedor.agregarProducto(nuevo);
			return nuevo;
		}
		
		public List<Producto> buscarProducto (String nombre) {
			return vendedores.stream()
					.map(v -> v.buscarProducto(nombre))
					.collect(Collectors.toList());
		}
		
		public boolean crearPedido (Cliente cliente, Producto producto, int cantSolicitada, OpcionPago opcionPago, MecanismoEnvio mecanismoEnvio) {
			if (producto.hayUnidades(cantSolicitada)) {
				Pedido pedido = new Pedido (producto, cantSolicitada, opcionPago, mecanismoEnvio,cliente);
				cliente.agregarPedido(pedido);
			}
			return false;
		}
		
		public double calcularCostoPedido (Pedido pedido) {
			return pedido.calcularCosto();
		}
}