package cn.hengyan.day20;

public class Outer2 {
	public String name;
	public int age;
	
	public void outermethod() {//此方法中传递的参数，如果给内部类用，则要用final修饰，如果没有明写
		//final修饰，只要内部类用到，则默认为final修饰
//		class Inner2 implements InnerInterface{//局部内部类，作用域是方法体内；其他与内部类相同
//
//			@Override
//			public String innmethod() {				
//				return "这是局部类Inner2实现InnerInterface接口的方法";
//			}
//			
//		}
//		Inner2 inner2 = new Inner2();
//		String string= inner2.innmethod();
//		System.out.println(string);
		
		//通过接口，写一个匿名的内部类
		InnerInterface inns =new InnerInterface() {//new关键字new一个接口，接口后面就
			//必须跟上一个实现这个接口的实现类的类体，这个类体，没有看到对应的类的修饰词，也没有看到这个类对应
			//的类名，这个类，就是一个匿名的内部类；
			//子类类型（匿名内部类）的变量赋值给父类类型（InnerInterface）的变量，多态
			@Override
			public String innmethod() {				
				return "这是局部类Inner2实现InnerInterface接口的匿名方法";
			}
			
		};//1.匿名内部类没有访问修饰符
		//2.new匿名内部类，写法上new匿名内部类的实现接口，如果没有接口，编译会出错
		//3.此方法中传递的参数，如果给内部类用，则要用final修饰，因为两个类字节码，生命周期会不一样
		//4.匿名内部类没有构造方法。因为它连类名都没有，就更不用谈方法了。
		String string = inns.innmethod();
		System.out.println(string);
		
	}
}
