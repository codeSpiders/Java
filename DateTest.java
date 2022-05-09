package cn.hengyan.day32;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) throws ParseException {
		Date d=new Date();//系统当前时间默认赋值在里面
		System.out.println(d);
		System.out.println(d.getYear());//需要加1900才能得到年份。该方法已废弃
		System.out.println(d.getYear()+1900);
		
		Date  d2=new Date(2022-1900,5-1,8);//创建时，注意年份+1900，月份-1
		System.out.println(d2);
		
		Date d3=new Date(123456788L);//表示从GMT 1970.1.1 0:00:00起
		
		//将时间转换成长整型，并输出
		System.out.println(d.getTime());//毫秒数
		//将长整型转换成时间，并输出
		long l=1652055512345L;
		Date d4=new Date(l);
		System.out.println(d4);
		
		//Date与Calendar相互转换
		Date d5=new Date();
		Calendar c1=Calendar.getInstance();
		c1.setTime(d5);
		Date d6=c1.getTime();
		
		//
		SimpleDateFormat s=new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		System.out.println(s.format(d5));//月份有问题
		String s1="2022-05-09 08:59:55";
		System.out.println(s.parseObject(s1));
		
	}
}
