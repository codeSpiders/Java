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
		//YearMonth��
		YearMonth ym=YearMonth.of(2020, 12);
		System.out.println(ym.getYear());
		System.out.println(ym.lengthOfYear());
		System.out.println(ym.lengthOfMonth());
		//IsLeapYear
		LocalDate d1=LocalDate.of(2020, 2, 20);
		System.out.println(d1+"�Ƿ������꣺"+d1.isLeapYear());
		//period��
		LocalDate d2=LocalDate.of(2012, 5, 26);
		Period p1=Period.between(d2, d1);
		System.out.println(p1.getYears());
		System.out.println(p1.getMonths());
		System.out.println(p1.getYears());
		//Instant ʱ���
		Instant i=Instant.now();
		System.out.println(i);//���ʱ���Ǹ�������ʱ�䣬���������ڵ�ʱ����8��Сʱ��ʱ��
		Date date=Date.from(i);//dateʱ�����Instant����һ�������ǣ�
		System.out.println(date);//dateʱ����Ǳ���ʱ�䣬���Ѹ�������ʱ�����8��Сʱ
		Instant i2=date.toInstant();//��dateת��instant
		System.out.println(i2);
		//�ַ���תlocaldate
		String s1="20210516";
		LocalDate d3=LocalDate.parse(s1,DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(d3);
		String s2="06 13 2015"; 
		LocalDate d4=LocalDate.parse(s2,DateTimeFormatter.ofPattern("MM dd yyyy"));
		System.out.println(d4);
		//����ת�ַ���
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy��MM��dd��");
		String s3=d3.format(dtf);
		System.out.println(s3);
	}
}
