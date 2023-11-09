package objetos.ejercicio19;

public class seisCuotas implements OpcionPago {
	@Override
	public double devolverPrecioFinal(double precio) {
		return precio * 1.2;
	}

}
