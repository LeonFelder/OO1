package objetos.ejercicio18;

import java.util.List;
import java.util.stream.Collectors;
import java.time.LocalDate;
import java.util.ArrayList;

public class Sistema {
	private List<Empleado> empleados;
	
	public Sistema () {
		empleados = new ArrayList<>();
	}
	
	public Empleado agregarEmpleado (String nombre, String apellido, String CUIL, LocalDate fechaNacimiento,boolean conyuge, int hijos) {
		Empleado nuevo = new Empleado(nombre,apellido,CUIL,fechaNacimiento,conyuge,hijos);
		empleados.add(nuevo);
		return nuevo;
	}
	
	public Empleado buscarEmpleado (String CUIL) {
		Empleado existe = empleados.stream()
				.filter(emp -> emp.getCUIL() == CUIL)
				.findFirst().orElse(null);
		return existe;
	}
	
	public boolean borrarEmpleado (Empleado empleado) {
		return empleados.remove(empleado);
	}
	
	public Contrato agregarContrato (Empleado empleado, LocalDate fechaInicio, double valorHora, int horaMes, LocalDate fechaFin) {
		Contrato nuevo = new ContratoHoras(empleado,fechaInicio,valorHora,horaMes, fechaFin);
		empleado.agregarContrato(nuevo);
		return nuevo;
	}
	
	public Contrato agregarContrato (Empleado empleado, LocalDate fechaInicio, double sueldo, double montoConyuge, double montoHijos) {
		Contrato nuevo = new ContratoPlanta(empleado,fechaInicio,sueldo,montoConyuge, montoHijos);
		empleado.agregarContrato(nuevo);
		return nuevo;
	}
	
	public List<Empleado> obtenerEmpleadosVencidos (){
		return empleados.stream()
				.filter(emp -> !emp.tengoContratoVigente())
			    .collect(Collectors.toList());
	}
	
	public List<Recibo> generarRecibos (){
		return empleados.stream()
				.filter(emp -> emp.tengoContratoVigente())
			    .map(e -> e.generarRecibo())
			    .collect(Collectors.toList());
		
	}
}
