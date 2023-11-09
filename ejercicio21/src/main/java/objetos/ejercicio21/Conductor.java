package objetos.ejercicio21;

public class Conductor extends Usuario {
	private Vehiculo vehiculo;
	
	public Conductor (String nombre, Vehiculo vehiculo) {
		super(nombre);
		this.vehiculo = vehiculo;
		vehiculo.setDuenio(this);
	}
	
	public void cargarSaldoRecargo (double monto) {
		if (vehiculo.getAntiguedad() < 5)
			super.cargarSaldo(monto*0.99);
		else 
			super.cargarSaldo(monto*0.9);
	}
	
	public void descontarSaldo (double monto) {
		super.descontarSaldo(monto-(vehiculo.getValor()*0.01));
	}
}