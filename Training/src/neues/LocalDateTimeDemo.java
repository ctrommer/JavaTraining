package neues;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		
		LocalDateTime localDateTime = LocalDateTime.now();		
		System.out.println(localDateTime);
		
		LocalDate localDate = LocalDate.now().plusMonths(3);
		System.out.println(localDate);
		
	}

}
