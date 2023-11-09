package objetos.ejercicio17;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestLlamadaInternacional {

	private LlamadaInternacional menos20Hs;
	private LlamadaInternacional mas20Hs;
	private LlamadaInternacional menos8Hs;
	private LlamadaInternacional mas8Hs;
	private LlamadaInternacional e20Hs;
	private LlamadaInternacional e8Hs;


	@BeforeEach
	public void setUp() {
		this.mas20Hs = new LlamadaInternacional (LocalDateTime.of(2022, 10, 23, 20, 0),10,"221123123", "221452235" , "Argentina", "Arabia Saudita");
		this.menos20Hs = new LlamadaInternacional (LocalDateTime.of(2022, 10, 23, 19, 59), 10, "221123123", "221452235", "Argentina", "Arabia Saudita");
		this.menos8Hs = new LlamadaInternacional (LocalDateTime.of(2022, 10, 23, 7, 59), 10,"221123123", "221452235", "Argentina", "Arabia Saudita");
		this.mas8Hs = new LlamadaInternacional (LocalDateTime.of(2022, 10, 23, 8, 15), 10,"221123123", "221452235", "Argentina", "Arabia Saudita");
		e20Hs = new LlamadaInternacional (LocalDateTime.of(2022, 10, 23, 20, 00), 10, "221123123", "221452235", "Argentina", "Arabia Saudita");
		e8Hs = new LlamadaInternacional (LocalDateTime.of(2022, 10, 23, 8, 00), 10,"221123123", "221452235", "Argentina", "Arabia Saudita");
	}

	@Test
	public void test() {
		assertEquals(40,menos20Hs.calcularCosto());
		assertEquals(40,mas8Hs.calcularCosto());
		assertEquals(30,mas20Hs.calcularCosto());
		assertEquals(30,menos8Hs.calcularCosto());
		assertEquals(40,e8Hs.calcularCosto());
		assertEquals(30,e20Hs.calcularCosto());
		
	}
}
