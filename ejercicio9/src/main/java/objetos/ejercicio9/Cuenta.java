package objetos.ejercicio9;

public abstract class Cuenta {
	private Double saldo;
	
	public Cuenta () {
		this.saldo = 0d;
	}
	
	public Double getSaldo () {
		return this.saldo;
	}
	
	public void depositar (double monto) {
		this.saldo += monto;
	}
	
	protected void extraerSinControlar (double monto) {
		this.saldo -= monto;
	}
	
	public boolean extraer (double monto) {
		if (this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			return true;
		}
		return false;
	}
	
	public boolean transferirACuenta (double monto, Cuenta cuentaDestino) {
		if (this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			cuentaDestino.depositar(monto);
			return true;
		}
		return false;
	}
	
	protected abstract boolean puedeExtraer (Double monto);
}
