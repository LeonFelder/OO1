package objetos.ejercicio18;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Empleado {
	private List<Contrato> contratos;
	private List<Recibo> recibos;
	private String nombre;
	private String apellido;
	private String CUIL;
	private LocalDate fechaNacimiento;
	private boolean conyuge;
	private int hijos;
	private LocalDate fechaInicio;
	
	public Empleado(String nombre, String apellido, String cUIL,
			LocalDate fechaNacimiento,boolean conyuge, int hijos) {
		contratos = new ArrayList<>();
		recibos = new ArrayList<>();
		this.nombre = nombre;
		this.apellido = apellido;
		CUIL = cUIL;
		this.fechaNacimiento = fechaNacimiento;
		this.conyuge = conyuge;
		this.hijos = hijos;
		fechaInicio = LocalDate.now();
	}
	
	public void agregarContrato (Contrato contrato) {
		if (!this.tengoContratoVigente())
			contratos.add(contrato);
	}
	
	public boolean tengoContratoVigente () {
		return contratos.stream()
				.anyMatch(contrato -> contrato.estaVencido() == false);
	}
	
	public String getCUIL () {
		return CUIL;
	}
	
	public Contrato getContratoVigente () {
		return contratos.stream()
				.filter(contrato -> contrato.estaVencido())
				.findFirst().orElse(contratos.get(contratos.size()));
	}
	
	private int calcularAntiguedad () {
		return contratos.stream()
				.mapToInt(c -> c.calcularAntiguedad())
				.sum();
	}
	
	private double calcularMonto () {
		double montoACobrar = this.getContratoVigente().calcularMonto();
		int antiguedad = this.calcularAntiguedad();
		if (antiguedad > 5) 
			if (antiguedad > 10) 
				if (antiguedad > 15)
					if (antiguedad > 20)
						montoACobrar = montoACobrar * 2;
					else
						montoACobrar = montoACobrar * 1.7;
				else
					montoACobrar = montoACobrar * 1.5;
			else
				montoACobrar = montoACobrar *1.3;
		return montoACobrar;
	}
	
	public Recibo generarRecibo() {
		double montoACobrar = this.calcularMonto();
		Recibo nuevo = new Recibo (nombre, apellido, CUIL, this.calcularAntiguedad(), montoACobrar);
		recibos.add(nuevo);
		return nuevo;
	}
	
	public boolean tieneHijos () {
		return hijos > 0;
	}
	
	public boolean tieneConyuge () {
		return conyuge;
	}
}
