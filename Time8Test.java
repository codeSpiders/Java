package cn.hengyan.day33;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoPeriod;
import java.time.chrono.Chronology;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;

public class Time8Test {
	public static void main(String[] args) {
		//输入现在时间
		LocalDate d1=LocalDate.now();
		System.out.println("d1="+d1);
		
		LocalTime t1=LocalTime.now();
		System.out.println("t1="+t1);
		//分别输出年、月、日
		System.out.println(d1.getYear());
		System.out.println(d1.getMonth());
		System.out.println(d1.getDayOfMonth());
		System.out.println(d1.getDayOfYear());
		System.out.println(d1.getDayOfWeek());
		//输入特定年月日
		LocalDate d2=LocalDate.of(2020,10,10);
		System.out.println("d2="+d2);
		LocalDate d3=LocalDate.of(2020, 10, 10);
		System.out.println("d2和d3是否是同一天:"+d2.equals(d3));//比较年月日
		//
		MonthDay birthday=MonthDay.from(d2);
		MonthDay today=MonthDay.from(d1);
		if(birthday.equals(today)) {
			System.out.println("Happy Birthday!");
		}else {
			System.out.println("Sorry,it not your birthday.");
		}
		
		//距现在2个小时后，注意，java会增加一个新的类，来表示新增加的时间对象
		LocalTime t2=t1.plusHours(2);
		System.out.println("t2="+t2);

		LocalDate d4=d1.minusDays(20);
		System.out.println("d4="+d4);

	}
}
