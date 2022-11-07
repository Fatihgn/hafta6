package Recursive;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TarihZaman {

	public static void main(String[] args) {
		LocalDateTime tarih=LocalDateTime.now();
		//System.out.println(tarih);
		DateTimeFormatter yeniTarih=DateTimeFormatter.ofPattern("dd-MM-yyyy \n HH:mm:ss");
		String formatterDate=tarih.format(yeniTarih);
		System.out.println(formatterDate);

	}

}
