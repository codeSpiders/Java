package cn.hengyan.day32;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		System.out.println(c);//Ĭ�ϵ�ǰ����
		
		//��������
		Calendar c2=Calendar.getInstance();
		c2.set(2022, 5-1,8);//���Date�࣬��ݲ���-1900�����·�����Ҫ-1��
		System.out.println(c2);
		//�޸�����
		c2.set(Calendar.DATE,6);
		System.out.println(c2);
		//��10��
		c2.add(Calendar.DATE, 10);//����-10����ʾ��10��
		System.out.println(c2);
		//�������
		System.out.println(c2.get(Calendar.DATE));
		
		//ʱ���볣���͵��໥ת��
		Calendar c3=Calendar.getInstance();
		long l=c3.getTimeInMillis();//��GMT1970.1.1 0:00:00��ĺ�����
		System.out.println(l);
		long l1=1652056123456L;
		Calendar c4=Calendar.getInstance();
		c4.setTimeInMillis(l1);
		System.out.println(c4);
		System.out.println(c3);
		
	}
}
