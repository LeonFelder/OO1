package objetos.ejercicio11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion{
	LocalDate fechaDeConstitucion;
	double montoDepositado;
	double porcentajeDeInteresDiario;
	
	public PlazoFijo (double montoDepositado,double porcentajeDeInteresDiario) {
		fechaDeConstitucion = LocalDate.now();
		this.montoDepositado = montoDepositado;
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
	}
	
	public LocalDate getFechaDeConstitucion() {
		return fechaDeConstitucion;
	}


	public void setFechaDeConstitucion(LocalDate fechaDeConstitucion) {
		this.fechaDeConstitucion = fechaDeConstitucion;
	}


	public double getMontoDepositado() {
		return montoDepositado;
	}


	public void setMontoDepositado(double montoDepositado) {
		this.montoDepositado = montoDepositado;
	}


	public double getPorcentajeDeInteresDiario() {
		return porcentajeDeInteresDiario;
	}


	public void setPorcentajeDeInteresDiario(double porcentajeDeInteresDiario) {
		this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
	}


	public double valorActual() {
		double dias =ChronoUnit.DAYS.between(fechaDeConstitucion, LocalDate.now());
		return montoDepositado + (porcentajeDeInteresDiario*montoDepositado / 100) * dias;
	}
}
