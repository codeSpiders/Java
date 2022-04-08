package cn.hengyan.day11;

public class TestBlock {
	public static void main(String[] args) throws ClassNotFoundException {
		
		/*Class.forName("cn.hengyan.day11.test");//作用就是将test类加载到JVM
		new test();//匿名调用//创建对象时隐式调用
		new test();
		new test();*/
		
		Class.forName("cn.hengyan.day11.test2");
		new test2();		
	}
}

class test{
	int a = 0;
	static int b = 0;
	test(){
		System.out.println("test的构造器");
		a=20;
		b=20;
	}
	
	{//在有对应的test类被实例化，new关键字调用它的构造器的时候，
		//new一次就会调用一次,可以执行多次
		System.out.println("test的普通初始化块");
		a=100;
		b=100;
	}
	
	static {//初始化块是在程序被加载到内存中的时候，静态的初始化块会被
		//执行，而且只会执行一次//静态初始化块优先于普通初始化块运行
		System.out.println("test的静态初始化块");
		//a=800;//静态块只能访问静态成员，普通块和构造器则都可以访问
		b=800;
	}
	
}//先执行静态块(静态属性)，再执行普通块（普通属性），最后执行构造器；

class test1 extends test{
	test1(){
		System.out.println("test1的构造器");
	}
	
	{
		System.out.println("test1的普通初始化块");
	}
	
	static {
		System.out.println("test1的静态初始化块");
	}
}

class test2 extends test1{
	test2(){
		System.out.println("test2的构造器");
	}
	
	{
		System.out.println("test2的普通初始化块");
	}
	
	static {
		System.out.println("test2的静态初始化块");
	}
}
//执行顺序：
//爷爷类的静态初始化块（属性）
//父类的静态初始化块（属性）
//子类的静态初始化块（属性）
//爷爷类的普通初始化块（属性）-->构造器
//父类的普通初始化块（属性）-->构造器
//子类的普通初始化块（属性）-->构造器