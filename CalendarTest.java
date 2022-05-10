package cn.hengyan.day32;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		System.out.println(c);//默认当前日期
		
		//设置日期
		Calendar c2=Calendar.getInstance();
		c2.set(2022, 5-1,8);//相比Date类，年份不用-1900，但月份仍需要-1；
		System.out.println(c2);
		//修改日期
		c2.set(Calendar.DATE,6);
		System.out.println(c2);
		//加10天
		c2.add(Calendar.DATE, 10);//传入-10，表示减10天
		System.out.println(c2);
		//输出日子
		System.out.println(c2.get(Calendar.DATE));
		
		//时间与常整型的相互转换
		Calendar c3=Calendar.getInstance();
		long l=c3.getTimeInMillis();//从GMT1970.1.1 0:00:00起的毫秒数
		System.out.println(l);
		long l1=1652056123456L;
		Calendar c4=Calendar.getInstance();
		c4.setTimeInMillis(l1);
		System.out.println(c4);
		System.out.println(c3);
		
	}
}
