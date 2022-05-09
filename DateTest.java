package cn.hengyan.day32;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) throws ParseException {
		Date d=new Date();//ϵͳ��ǰʱ��Ĭ�ϸ�ֵ������
		System.out.println(d);
		System.out.println(d.getYear());//��Ҫ��1900���ܵõ���ݡ��÷����ѷ���
		System.out.println(d.getYear()+1900);
		
		Date  d2=new Date(2022-1900,5-1,8);//����ʱ��ע�����+1900���·�-1
		System.out.println(d2);
		
		Date d3=new Date(123456788L);//��ʾ��GMT 1970.1.1 0:00:00��
		
		//��ʱ��ת���ɳ����ͣ������
		System.out.println(d.getTime());//������
		//��������ת����ʱ�䣬�����
		long l=1652055512345L;
		Date d4=new Date(l);
		System.out.println(d4);
		
		//Date��Calendar�໥ת��
		Date d5=new Date();
		Calendar c1=Calendar.getInstance();
		c1.setTime(d5);
		Date d6=c1.getTime();
		
		//
		SimpleDateFormat s=new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		System.out.println(s.format(d5));//�·�������
		String s1="2022-05-09 08:59:55";
		System.out.println(s.parseObject(s1));
		
	}
}
