package cn.hengyan.day16;

public abstract class Animal1 {//有abstract修饰，就是抽象类
	//抽象类不能实例化
	public abstract void bark();//不需要方法体，因此没有大括号
	//但是注意，要加分号;类必须也是abstract才行
	//子类继承抽象父类时，抽象方法必须重写，否则报错
	public void run() {//抽象类中可以包含普通方法
		System.out.println("run,run");
	}
	private int age;//抽象类中可以包含普通成员变量
	//public abstract String name;//抽象类中不能有抽象成员变量，不存在这个概念
	
}//1.抽象方法只能用public,protected修饰，不能被private修饰（子类或别的类无法访问）
//2.抽象类不能创建对象
//3.如果子类继承抽象类，那么子类必须要实现（重写）父类的抽象方法，否则，子类也必须
//被abstract修饰，变成一个抽象类

 class Bird extends Animal1{
	public void bark() {
		System.out.println("吉吉\n");
	}
}
  
class Cow extends Animal1{
		@Override
		public void bark() {
			System.out.println("哞哞\n");
		}
		
}

abstract class  fox extends Animal1{//子类可以不实现父类abstract方法
	//此时子类也必须加abstract关键字，子类也就成为了一个抽象类
	
}