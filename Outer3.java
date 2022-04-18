package cn.hengyan.day21;

public class Outer3 {
	private int ip;
	private static String once;
	
	public class Innner1{//非静态的成员内部类
		public static int iipp =36;//现在的版本，好像可以在普通成员内部类中定义静态变量
		public void innneraa() {
			//成员内部类可以访问它的外部类中静态和非静态成员
			ip = 34;
			once = "lover";
			System.out.println(ip);
			System.out.println(once);
			System.out.println(iipp);
		}		
	}
	
	public static class Innner2{//静态的成员内部类
		public int yypp;//静态的成员内部类可以有非静态的成员
		public static String twice;//静态的成员内部类可以有静态的成员
		public static void stamethod() {
			System.out.println("这是静态内部类的静态方法");
		}
		public void method() {
			System.out.println("这是静态内部类的非静态方法");
		}
		
	}
}
