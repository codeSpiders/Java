package cn.hengyan.day19;

import cn.hengyan.day19.Outer1.Inner1;

public class Outer1Test {
	public static void main(String[] args) {
		Outer1 outer = new Outer1()	;
		//Inner1 inter =outer.new Inner1();//这样也行？应该是
		Outer1.Inner1 inter = outer.new Inner1();
		//不推荐上面这样用，推荐用getxxx方法来获取这个内部类的对象
		Outer1.Inner1 inter2 = outer.getInner1();
		inter.num =60;
		inter.innerStart();
		inter2.innerStart();		
		System.out.println(inter.num);
		inter.num=70;
		System.out.println(inter.num);
		//Inner1 inter2 =new Inner1();//这个是不行的
	}
}
