package objetos.ejercicio14;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse2 implements DateLapse {
	private LocalDate from;
	private int sizeInDays;
	
	public DateLapse2 (LocalDate from, LocalDate to) {
		this.from = from;
		this.sizeInDays = (int) from.until(to,ChronoUnit.DAYS);
	}
	
	@Override
	public LocalDate getFrom() {
		return from;
	}

	@Override
	public LocalDate getTo() {
		return from.plus(sizeInDays,ChronoUnit.DAYS);
	}

	@Override
	public int sizeInDays() {
		return sizeInDays;
	}

	@Override
	public boolean includesDate(LocalDate other) {
		return other.isAfter(from) && other.isBefore(from.plus(sizeInDays,ChronoUnit.DAYS));
	}
}
