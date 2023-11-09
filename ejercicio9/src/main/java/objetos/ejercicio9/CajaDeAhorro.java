package objetos.ejercicio9;

public class CajaDeAhorro extends Cuenta {

	public void depositar (double monto) {
		super.depositar(monto*0.98);
	}
	
	protected void extraerSinControlar (double monto) {
		super.extraerSinControlar(monto * 1.02);
	}
	
	@Override
	protected boolean puedeExtraer(Double monto) {
		if (this.getSaldo() - (monto * 1.02) > 0)
			return true;
		return false;
	}

}
