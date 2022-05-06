package cn.hengyan.day30;

public class StringTest {
	public static void main(String[] args) {
		String s1="hard work!";
		String s2=new String("hard work!");
		String s3="hard work!";
		String s4=new String("hard work!");
		System.out.println(s1==s2);//存放的地址不一样
		System.out.println(s1==s3);//存放的地址一样，在常量池.常量池不会创建重复的对象
		System.out.println(s2==s4);//存放的地址不一样
		
		String st1="";
		for(int i=0;i<100;i++) {
			st1 +="hello";//string这个类，它在做字符串改变的时候，返回了一个新对象，
			//每循环一次，new一个新对象，循环100次，new了100个新对象。
		}//效率低下且大量浪费内存资源,为克服这些缺点，创造了一个新的类，StringBuilder
		System.out.println(st1);
		
		StringBuilder sBuilder=new StringBuilder();
		for(int i=0;i<10;i++) {
			sBuilder.append("hello");//返回的是它本身，所以无论循环多少次，
			//都只在最初的时候new一个对象
		}//JDK5版及以后，拼接操作时，编译器自动把String转换成了StringBuilder
		System.out.println(sBuilder.toString());
	}
}//string，stringbuilder,stringbuffer总结：
//1.循环外拼接，用string +操作；
//2.有循环拼接的话，最后在循环体外申明StringBuilder对象，在循环体内进行手动append。
//3.如果采用了多线程的话，建议使用StringBuffer;
