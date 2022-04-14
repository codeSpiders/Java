package cn.hengyan.day17;

public interface Interface1 {//接口是抽象类型，是抽象方法的集合。
	public void call() ;//在接口中所有的方法都是抽象方法，
	//因此默认就是abstract方法，所有可以不加abstract
	//抽象类中可以有abstract方法，也可以有普通方法
	public abstract int read(int i);
	public int x=3;//接口中可以定义变量，但是这个变量是存放在静态区内，且必须初始化
	//在实际开发中，定义变量没有意义，因为它存放在静态区，且不可改变，相当于static final修饰
	//抽象类中可以定义变量，和普通类一样。
	public default void Practise1() {//JDK1.8以后，增加了
		//default修饰的方法，该方法可以不在实现类中实现；方便后续程序扩展。	
	};	
}//接口由于全部是抽象方法，所有没有实例化对象；
//一个实现接口的类，必须实现接口内所有的抽象方法，否则，就必须申明为抽象类。


 class InterfaceTest implements Interface1{
	//注意，关键字用implements，而不是extends；可以接多个接口
		//类似子类和父类的关系，但是本质上不是这种关系
		@Override
		public void call() {//接口中非default修饰的方法都必须重写（实现）
			// TODO Auto-generated method stub
			
		}

		@Override
		public int read(int i) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}