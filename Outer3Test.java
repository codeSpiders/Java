package cn.hengyan.day21;

import cn.hengyan.day21.Outer3.Innner2;

public class Outer3Test {
	public static void main(String[] args) {
		//非静态内部类的操作方式
		Outer3 outer3 = new Outer3();
		Outer3.Innner1 innner1 = outer3.new Innner1();//注意new的位置，它是在中间
		innner1.innneraa();
		
		//静态内部类的操作方式
		Innner2.twice= "once again";//直接用静态内部类来调用静态的成员，不需要通过外部类
		Innner2.stamethod();		
		//Innner2.yypp = 20;//非静态方法不能这样直接调用
		Innner2 innner2 = new Innner2();//静态内部类中的非静态成员，需要实例化对象来调用，
		innner2.yypp=84;//但是实例化对象，也不需要通过外部类（这跟一般内部类不一样）
		innner2.method();
	}
}
