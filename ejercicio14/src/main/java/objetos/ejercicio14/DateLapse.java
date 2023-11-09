package objetos.ejercicio14;

import java.time.LocalDate;

public interface DateLapse {
	
	public LocalDate getFrom();
	
	public LocalDate getTo();
	
	public int sizeInDays();
	
	public boolean includesDate(LocalDate other);
}
