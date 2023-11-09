package objetos.ejercicio13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteDeCorreoTest {
	private ClienteDeCorreo cliente;
	private Email email1;
	private Carpeta carpeta;
	private Carpeta carpetaVacia;
	
	@BeforeEach
	public void setUp() {
		carpeta = new Carpeta("Inbox");
		carpetaVacia = new Carpeta("Prioridad");
		email1 = new Email("Hola","Como estas?");
		carpeta.agregarEmail( new Email("Hola","Como"));
		carpeta.agregarEmail(email1);
		cliente = new ClienteDeCorreo(carpeta);
	}

	@Test
	private void testMover() {
		cliente.mover(email1, carpeta, carpetaVacia);
		assertNotEquals(carpeta.buscar(email1.getTitulo()),email1);
		assertEquals(carpeta.buscar(email1.getTitulo()),email1);
	}
	
	@Test
	private void testBuscar() {
		assertNotEquals(carpetaVacia.buscar(email1.getTitulo()),email1);
		assertEquals(carpeta.buscar(email1.getTitulo()),email1);
	}
	
	@Test
	private void testEspacioOcupado() {
		carpetaVacia.agregarEmail(email1);
		assertEquals(cliente.espacioOcupado(),38);
	}
}
