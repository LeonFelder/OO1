package objetos.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarpetaTest {
	private Carpeta carpeta;
	private Carpeta carpetaVacia;
	private Email email1;
	
	@BeforeEach
	public void setUp() {
		carpeta = new Carpeta("Inbox");
		carpetaVacia = new Carpeta("Prioridad");
		email1 = new Email("Hola","Como estas?");
		carpeta.agregarEmail( new Email("Hola","Como"));
		carpeta.agregarEmail(email1);
	}

	@Test
	public void testEspacioOcupado() {
		assertEquals(carpeta.espacioOcupado(),23);
		assertEquals(carpetaVacia.espacioOcupado(),0);
	}
	
	@Test
	public void testBuscar() {
		assertEquals(carpeta.buscar("Como est"),email1);
		assertNotEquals(carpeta.buscar("Hola"),new Email("",""));
		assertNotEquals(carpetaVacia.buscar("Como est"),email1);
	}
}
