package cn.hengyan.day09;

	class Base{//父类
		 public void say() {//父类的方法
			 System.out.println("Base的say方法");
		 }
	}
	
	class Sub extends Base{//子类
		public void say() {//子类重写父类的方法
			System.out.println("Sub的say方法");			
		}
		
		public void listen() {//子类独有的方法
			System.out.println("Sub的listen方法");
		}
	}
	
public class TestBaseToSub {
	public static void main(String[] args) {
		Base base = new Sub();//
		Base base2 = new Base();
		base.say();
		if( base instanceof Sub ) {//判断base对象类型是否是Sub
			((Sub)base).listen();//强制转换，注意要打括号！
		}
		base2.say();
//		((Sub)base2).listen();// cannot be cast
	}
}
