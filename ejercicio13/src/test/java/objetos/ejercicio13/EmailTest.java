package objetos.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class EmailTest {
	private Email email;
	
	@BeforeEach
	public void setUp () {
		email = new Email("Hola","Como estas?");
	}
	
	@Test
	public void testTamaño() {
		Email emailVacio = new Email("","");
		Archivo arch1 = new Archivo ("Archi");
		Archivo arch2 = new Archivo ("Archivito");
		email.agregarAdjunto(arch1);
		email.agregarAdjunto(arch2);
		assertEquals(email.tamaño(),29);
		assertEquals(emailVacio.tamaño(),0);
	}
	
	@Test
	public void testBuscar() {
		assertTrue(email.buscar("ol"));
		assertTrue(email.buscar("estas?"));
		assertFalse(email.buscar("Chau"));
		assertFalse(email.buscar(""));
	}
}
