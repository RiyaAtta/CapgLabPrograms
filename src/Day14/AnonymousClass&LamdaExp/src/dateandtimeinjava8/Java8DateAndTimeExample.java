package dateandtimeinjava8;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Java8DateAndTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2021-06-04
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		//time
		LocalTime ltime = LocalTime.of(12, 20);
		System.out.println(ltime);
		
		//date and time
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		OffsetDateTime odt = OffsetDateTime.now();
		System.out.println(odt);
		
		ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println(zdt);
		
		Instant instant = Instant.now();
		System.out.println(instant);
		Instant instant1 = instant.plus(Duration.ofMillis(5000));
		System.out.println(instant1);
		
		Duration dur = Duration.ofMillis(5000);
		System.out.println(dur);
		
		Period p = Period.between(LocalDate.now(), localDate.now().plusDays(368));
		System.out.println(p);
		int noofDays = p.getDays();
		System.out.println(noofDays);
		
		Period p1 = Period.of(8,5,25);
		System.out.println(p1.getDays());
		System.out.println(p1.getYears());
		System.out.println(p1.getMonths());
		
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.now().minusDays(50);
		long daysBetween = ChronoUnit.DAYS.between(date2, date1);
		System.out.println(daysBetween);
		
		long noOfMonths=ChronoUnit.MONTHS.between(date2, date1);
		System.out.println(noOfMonths);
	}

}