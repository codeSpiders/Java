package cn.hengyan.day31;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTest {
	public static void main(String[] args) {
		System.out.println(0.2+0.1);
		System.out.println(0.3-0.1);
		System.out.println(0.2*0.1);
		System.out.println(0.3/0.1);
		
		BigDecimal bg1=new BigDecimal(2);
		BigDecimal bg2=new BigDecimal(2.3);//������ת����BigDecimal����ȷ
		BigDecimal bg3=new BigDecimal("2.3");
		System.out.println(bg1);
		System.out.println(bg2);
		System.out.println(bg3);
		
		//��������ȷתBigDecimal����һ��
		BigDecimal bg4=BigDecimal.valueOf(2.3);
		System.out.println(bg4);
		
		//��������ȷתBigDecimal��������
		BigDecimal bg5=new BigDecimal(Double.toString(2.3));
		System.out.println(bg5);
		
		//��������
		BigDecimal a=new BigDecimal("4.5");
		BigDecimal b=new BigDecimal("1.5");
		BigDecimal c=new BigDecimal("1.7");
		
		System.out.println(a.add(b));
		System.out.println(a.subtract(b));
		System.out.println(a.multiply(b));
		System.out.println(a.divide(b));//��������ʱ���ᱨ����ʱӦ����3������
		System.out.println(a.divide(c,3,RoundingMode.HALF_DOWN));//��������ʱ���ᱨ����ʱӦ����3������
		
		//�Դ�С������ȡ��
		BigDecimal d=new BigDecimal("3.14156");		
		System.out.println(d.setScale(3, RoundingMode.HALF_UP));
		System.out.println(d);
 	}
}
