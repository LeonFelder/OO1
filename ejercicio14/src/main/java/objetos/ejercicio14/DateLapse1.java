package objetos.ejercicio14;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse1 implements DateLapse {
	private LocalDate from;
	private LocalDate to;
	
	public DateLapse1 (LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}
	
	@Override
	public LocalDate getFrom() {
		return from;
	}

	@Override
	public LocalDate getTo() {
		return to;
	}

	@Override
	public int sizeInDays() {
		return (int) from.until(to, ChronoUnit.DAYS);
	}

	@Override
	public boolean includesDate(LocalDate other) {
		return other.isAfter(from) && other.isBefore(to);
	}

	public boolean overlaps (DateLapse anotherDateLapse) {
		return (anotherDateLapse.includesDate(from)) || (anotherDateLapse.includesDate(to));
	}
}
