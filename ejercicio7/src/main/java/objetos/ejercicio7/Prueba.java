package objetos.ejercicio7;

public class Prueba {

	public static void main(String[] args) {
		Gerente alan = new Gerente("Alan Turing");
		double aportesDeAlan = alan.aportes();
		
		alan = new Gerente("Alan Turing");
		double sueldoBasicoDeAlan = alan.sueldoBasico();
		
		System.out.println("1_ Solo aportes de la clase Gerente");
		System.out.println("Sueldo basico de la clase EmpleadoJerarquico que llama a "
				+ "sueldoBasico de la clase Empleado y bonoPorCategoria de este metodo."
				+ "A su vez sueldoBasico llama a montoBasico de Gerente y aportes de Gerente");
		
		System.out.println(aportesDeAlan + "= 2850");
		System.out.println(sueldoBasicoDeAlan + "= 675850");
	}

}
