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
		BigDecimal bg2=new BigDecimal(2.3);//浮点数转换成BigDecimal不精确
		BigDecimal bg3=new BigDecimal("2.3");
		System.out.println(bg1);
		System.out.println(bg2);
		System.out.println(bg3);
		
		//浮点数精确转BigDecimal方法一：
		BigDecimal bg4=BigDecimal.valueOf(2.3);
		System.out.println(bg4);
		
		//浮点数精确转BigDecimal方法二：
		BigDecimal bg5=new BigDecimal(Double.toString(2.3));
		System.out.println(bg5);
		
		//四则运算
		BigDecimal a=new BigDecimal("4.5");
		BigDecimal b=new BigDecimal("1.5");
		BigDecimal c=new BigDecimal("1.7");
		
		System.out.println(a.add(b));
		System.out.println(a.subtract(b));
		System.out.println(a.multiply(b));
		System.out.println(a.divide(b));//当除不尽时，会报错。这时应传入3个参数
		System.out.println(a.divide(c,3,RoundingMode.HALF_DOWN));//当除不尽时，会报错。这时应传入3个参数
		
		//对大小数进行取舍
		BigDecimal d=new BigDecimal("3.14156");		
		System.out.println(d.setScale(3, RoundingMode.HALF_UP));
		System.out.println(d);
 	}
}
