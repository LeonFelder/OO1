package objetos.ejercicio14;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DateLapse2Test {
	private LocalDate fecha1;
	private LocalDate fecha2;
	private DateLapse lapsoCorto;
	private DateLapse lapsoLargo;
	
	@BeforeEach
	void setUp(){
		fecha1 = LocalDate.of(2013, 8, 16);
		fecha2 = LocalDate.of(2013, 8, 19);
		lapsoCorto = new DateLapse2(fecha1,fecha2);
		lapsoLargo = new DateLapse2(fecha1,LocalDate.now());
	}

	@Test
	public void testSizeInDays() {
		assertEquals(lapsoCorto.sizeInDays(),3);
		assertEquals(lapsoLargo.sizeInDays(),(int) fecha1.until(LocalDate.now(),ChronoUnit.DAYS));
	}
	
	@Test
	public void testIncludesDate () {
		assertTrue(lapsoCorto.includesDate(fecha1.plusDays(1)));
		assertFalse(lapsoCorto.includesDate(LocalDate.now()));
		assertFalse(lapsoCorto.includesDate(LocalDate.of(1988,4,25)));
	}
}
