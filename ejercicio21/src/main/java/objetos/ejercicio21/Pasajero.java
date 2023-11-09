package objetos.ejercicio21;

public class Pasajero extends Usuario{

	public Pasajero (String nombre) {
		super(nombre);
	}
	
	public void cargarSaldoRecargo (double monto) {
		if (!this.tieneViajesUltimosTreinta())
			super.cargarSaldo(monto);
			
		else
			super.cargarSaldo(monto*0.9);
	}
	
	public boolean tieneViajesUltimosTreinta () {
		return viajes.stream()
				.anyMatch(v -> v.ultimosTreinta());
	}
	
	public boolean tieneViajesPrevios () {
		return viajes.stream()
				.anyMatch(v -> v.antiguo());
	}
	
	public void descontarSaldo (double monto) {
		if (this.tieneViajesPrevios()) 
			super.descontarSaldo(monto-500);
		else
			super.descontarSaldo(monto);
	}
}
