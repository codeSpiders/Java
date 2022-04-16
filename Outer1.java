package cn.hengyan.day19;

/*成员内部类是一个普通的内部类，是外部类的一个成员，所以，内部类可以无限制地访问外部类的属性和方法，无论是否
 * 有private修饰；而外部类要访问内部类的成员和方法，则只能通过内部类实例来访问；
 * 成员内部类中不能存在任何static的变量和方法；
 * 成员内部类是依附于外部类的，所以只有先创建了外部类，才能创建内部类
 */
public class Outer1 {
	private String name;
	private int age;
	
	public class Inner1{//注意定义位置，定义在外部类的里面，和成员变量、成员方法并列,所以叫成员内部类
		
		public static int num;//成员内部类好像可以定义static变量？？与规定矛盾？
		
		public void innerStart() {
			name = "李伟";//可以直接访问外部类的成员变量
			age = 25;
			System.out.println(name);
			System.out.println(age);
			
		}
	}
	
	public Inner1 getInner1() {//成员内部类的get方法？
		return new Inner1();
	}
}
