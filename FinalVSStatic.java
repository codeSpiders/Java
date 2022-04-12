package cn.hengyan.day15;

public class FinalVSStatic {
	public static void main(String[] args) {
		MyRandom mr1 = new MyRandom();
		MyRandom mr2 = new MyRandom();
		
		System.out.println(mr1.i);
		System.out.println(mr1.j);
		System.out.println(mr2.i);
		System.out.println(mr2.j);
	}
}

class MyRandom{
	public final double i =Math.random();
	public static double j = Math.random();
}//static 数据存在静态区，程序一加载到虚拟机中，即把static变量加载到静态区
//静态区其实就是公共区域，所有的同类对象都共有，所有，两个j的值相同，且后续可以改变
//final 数据程序运行到他们时才加载到栈或堆中，必须初始化，且初始化后不能改变
//同一类中的两个对象，分别拥有不同的内存区域，也就有两个final变量，这两个变量可以不同，但后续不能改变

//对于全局常量，一般这样定义：
//public static final int CS = 500;
//这样在静态区域创建不可更改的量，就是全局常量