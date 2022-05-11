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
		//��������ʱ��
		LocalDate d1=LocalDate.now();
		System.out.println("d1="+d1);
		
		LocalTime t1=LocalTime.now();
		System.out.println("t1="+t1);
		//�ֱ�����ꡢ�¡���
		System.out.println(d1.getYear());
		System.out.println(d1.getMonth());
		System.out.println(d1.getDayOfMonth());
		System.out.println(d1.getDayOfYear());
		System.out.println(d1.getDayOfWeek());
		//�����ض�������
		LocalDate d2=LocalDate.of(2020,10,10);
		System.out.println("d2="+d2);
		LocalDate d3=LocalDate.of(2020, 10, 10);
		System.out.println("d2��d3�Ƿ���ͬһ��:"+d2.equals(d3));//�Ƚ�������
		//
		MonthDay birthday=MonthDay.from(d2);
		MonthDay today=MonthDay.from(d1);
		if(birthday.equals(today)) {
			System.out.println("Happy Birthday!");
		}else {
			System.out.println("Sorry,it not your birthday.");
		}
		
		//������2��Сʱ��ע�⣬java������һ���µ��࣬����ʾ�����ӵ�ʱ�����
		LocalTime t2=t1.plusHours(2);
		System.out.println("t2="+t2);

		LocalDate d4=d1.minusDays(20);
		System.out.println("d4="+d4);

	}
}
