package objetos.ejercicio19;

public class RetirarSucursalCorreo implements MecanismoEnvio {
	@Override
	public double costoEnvio(String direccionCliente, String direccionVendedor) {
		return 50;
	}

}
