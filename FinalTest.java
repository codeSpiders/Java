package cn.hengyan.day15;

import cn.hengyan.day13.Person;

//final的意思是不可改变的、恒量的意思，final修饰的量是不可改变的，
//而且后面名称全部要大写，如PI;
//static表示计算机中只保存一份的变量，这个变量的值是可以改变
public class FinalTest {
	
	//final修饰变量，被修饰的变量必须初始化，并且赋值后不能再赋值或者改变
	//局部变量不在讨论范畴，局部变量本身就有作用范围，不使用public，private
	//等修饰；一般情况下，final可以修饰局部变量，但一般不会这么做，没有意义
	final  int a = 26;//第一种方法，申明时初始化，注意final写在int前面；
	final int  b ;
	final int c;
	final static int d =68;
	
	public FinalTest(){//第二种方法，在构造器中初始化；
		b = 24;
	}
	
	{//第三种方法，在非静态块中初始化
		c=56;
	}	
	
	public static void main(String[] args) {
		//d=99;//被fianl修饰的基本变量，其值不能改变；
		final Person person =new Person();
		//person =new Person();//被final修饰的引用变量，
		//其指向的堆地址不能改变，但是堆中储存的值可以改变，如下：
		person.setAge(18);
		System.out.println(person.getAge());
		person.setAge(50);
		System.out.println(person.getAge());
		
		//final修饰方法，那么这个方法不能被重写
		//final修饰类，那么这个类不能被继承,类中的所有成员方法都隐式地被final修饰；
		
	}
}

class person{
	
	int ip;
	String name;
	
	public int getIp() {
		return ip;
	}
	public void setIp(int ip) {
		this.ip = ip;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "person [ip=" + ip + ", name=" + name + "]";
	}
	
}
