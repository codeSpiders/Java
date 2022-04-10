package cn.hengyan.day13;

public class TestEqual {
	public static void main(String[] args) {
		int a = 12;
		int b = 12;
		int c = 65;
		char d = 'A';
		System.out.println(a == b);
		System.out.println(c == d);//字符可以直接与整型比较
		char ch1 = 2500;//是否放在常量池？即使不放在常量池，
		char ch2 = 2500;//也可以比较,因为他们是基本变量
		System.out.println(ch1 == ch2);		
		
		Person p1 = new Person();
		Person p2 = new Person();//p1,p2实际是地址，并不相等
		System.out.println(p1 == p2);
		p1 = p2;//此时将p2所指的地址赋给p1；这时p1,p2指向同一个对象
		System.out.println(p1 == p2);//此时为true
		
		//字符串保存在一个叫常量池的公共地方,字符串本身是引用数据类型，但是
		//常量池里的数据不重复。
		String s1 = "120";
		String s2 = "120";
		System.out.println(s1 == s2);
		String s3 = "1200bc";
		String s4 = "1200bc";
		System.out.println(s3 == s4);//此时是相等的，引用同样的地址
		String s5 =new String("1200bc");//此方法定义的字符串并
		//没有放到常量池，而是像类一样，存放在堆中
		System.out.println(s3 == s5);//false
		
		String s6 = "1200bc";
		String s7 = new String("1200bc");
		System.out.println(s7.equals(s6));//true;
		System.out.println(s6.equals(s7));//true;
		//String类中已经对Object中的equals方法进行了重写
		//equals对比的是内容
		
		
	}
	
}
