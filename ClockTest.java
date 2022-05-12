package cn.hengyan.day33;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class ClockTest {
	public static void main(String[] args) {
		
		System.out.println(System.currentTimeMillis());
		System.out.println(Clock.systemUTC().millis());
		
		System.out.println(TimeZone.getDefault());
		System.out.println(Clock.systemDefaultZone());
		//YearMonth类
		YearMonth ym=YearMonth.of(2020, 12);
		System.out.println(ym.getYear());
		System.out.println(ym.lengthOfYear());
		System.out.println(ym.lengthOfMonth());
		//IsLeapYear
		LocalDate d1=LocalDate.of(2020, 2, 20);
		System.out.println(d1+"是否是闰年："+d1.isLeapYear());
		//period类
		LocalDate d2=LocalDate.of(2012, 5, 26);
		Period p1=Period.between(d2, d1);
		System.out.println(p1.getYears());
		System.out.println(p1.getMonths());
		System.out.println(p1.getYears());
		//Instant 时间戳
		Instant i=Instant.now();
		System.out.println(i);//这个时间是格林威治时间，与我们现在的时间有8个小时的时差
		Date date=Date.from(i);//date时间戳与Instant基本一样，但是，
		System.out.println(date);//date时间戳是本地时间，即把格林威治时间加上8个小时
		Instant i2=date.toInstant();//将date转回instant
		System.out.println(i2);
		//字符串转localdate
		String s1="20210516";
		LocalDate d3=LocalDate.parse(s1,DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(d3);
		String s2="06 13 2015"; 
		LocalDate d4=LocalDate.parse(s2,DateTimeFormatter.ofPattern("MM dd yyyy"));
		System.out.println(d4);
		//日期转字符串
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy年MM月dd日");
		String s3=d3.format(dtf);
		System.out.println(s3);
	}
}
