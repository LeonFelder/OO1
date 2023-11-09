package objetos.ejercicio15;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import objetos.ejercicio14.DateLapse1;

class SistemaTest {
	private Sistema sistema;
	private Propiedad propiedad1;
	private Propiedad propiedad2;
	private Usuario propietario;
	private Usuario inquilino;
	private Reserva reserva1;
	private Reserva reserva2;
	private DateLapse1 periodo1;
	private DateLapse1 periodo2;
	private DateLapse1 periodo3;
	private DateLapse1 periodo4;
	
	@BeforeEach
	public void setUp() {
		sistema = new Sistema();
		propietario = sistema.registrarUsuario("Roberto","Calle 400",44789123);
		propiedad1 = sistema.registrarPropiedad("Los talas","Linda",14,"Calle 8",propietario);
		propiedad2 = sistema.registrarPropiedad("Los tal","Fea",79,"Calle 618",propietario);
		inquilino = sistema.registrarUsuario("Estaban","dfs",7896554);
		periodo1 = new DateLapse1 (LocalDate.of(2022, 10, 5), LocalDate.of(2022, 10, 15));
		periodo2 = new DateLapse1 (LocalDate.of(2022, 10, 1), LocalDate.of(2022, 10, 6));
		periodo3 = new DateLapse1 (LocalDate.of(2022, 10, 1), LocalDate.of(2022, 10, 7));
		periodo4 = new DateLapse1 (LocalDate.of(2021, 10, 1), LocalDate.of(2021, 10, 7));
	}

	@Test
	public void TestCalcularPrecio() {
		reserva1 = sistema.reservar(propiedad1,periodo1,inquilino);
		reserva2 = sistema.reservar(propiedad2,periodo2,inquilino);
		assertEquals(sistema.calcularPrecio(reserva1),140d);
		assertEquals(sistema.calcularPrecio(reserva2),395d);
	}
	
	@Test
	public void TestBuscarPropiedad() {
		List<Propiedad> propiedades = new ArrayList<>();
		reserva1 = sistema.reservar(propiedad1,periodo1,inquilino);
		reserva2 = sistema.reservar(propiedad2,periodo2,inquilino);
		propiedades = new ArrayList<>();
		propiedades.add(propiedad1);
		propiedades.add(propiedad2);
		assertEquals(sistema.buscarPropiedad(periodo4),propiedades);
		assertNotEquals(sistema.buscarPropiedad(periodo3),propiedades);
	}
	
	@Test
	public void TestCalcularIngresos() {
		assertEquals(sistema.calcularIngresos(propietario, periodo1),0d);
		reserva1 = sistema.reservar(propiedad1,periodo1,inquilino);
		reserva2 = sistema.reservar(propiedad2,periodo2,inquilino);
		assertEquals(sistema.calcularIngresos(propietario, periodo3),535d);
	}
}
