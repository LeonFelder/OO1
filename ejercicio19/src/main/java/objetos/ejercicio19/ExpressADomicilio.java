package objetos.ejercicio19;

public class ExpressADomicilio implements MecanismoEnvio {
	private Mapa mapa;
	
	@Override
	public double costoEnvio(String direccionCliente, String direccionVendedor) {
		return mapa.distanciaEntre(direccionCliente, direccionVendedor) * 0.5;
	}

}
