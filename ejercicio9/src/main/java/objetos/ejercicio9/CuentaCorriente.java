package objetos.ejercicio9;

public class CuentaCorriente extends Cuenta {
	Double descubierto;
	Double descubiertoD;
	
	public CuentaCorriente () {
		descubierto = 0d;
		descubiertoD = 0d;
	}
	
	public CuentaCorriente(Double descubierto) {
		this.descubierto = descubierto;
		this.descubiertoD = descubierto;
	}
	
	public Double getDescubierto () {
		return descubierto;
	}
	
	public void setDescubierto (Double descubierto) {
		this.descubierto = descubierto;
	}
	
	public Double getDescubiertoD () {
		return descubiertoD;
	}
	
	public void setDescubiertoD (Double descubierto) {
		this.descubiertoD = descubierto;
	}
	
	protected void extraerSinControlar (double monto) {
		if (this.getSaldo() - monto < 0) {
			descubiertoD += (this.getSaldo() - monto);
		}
		super.extraerSinControlar(monto);
		
	}
	
	@Override
	protected boolean puedeExtraer(Double monto) {
		if ((this.getSaldo() - monto > 0) || 
				((this.getSaldo() + this.getDescubiertoD() - monto) > 0)) {
			return true;
		}
		return false;
	}

}
