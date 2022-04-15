package cn.hengyan.day18;


public class Outer {
	
	private String name;
	
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	class Inner{//内部类写在外部类的里面，所以外部类的所有成员变量，成员方法作用域都覆盖了内部类，；
		//即内部类可以无缝调用外部类的成员变量和成员方法。
		
		public Inner() {
			//内部类可以直接访问外部类的成员变量和成员方法，尽管外部类的成员是private修饰的。
	     name = "肖牛";//好像不能写成Outer.name,因为还没有实例化？Outer还在静态区域？
	     age =19;	     
		}
		
		public void innersay() {
			System.out.println("这是内部类的非构造方法");
			System.out.println(name);
		    System.out.println(getName());	
		}
		
		public Outer getOuter() {//与外部类中的getName类似，
			return Outer.this;//表示一个外围类的一个对象的引用
		}
	}
	
	public static void main(String[] args){//注意：main方法只能定义在Outer类中
	    	 //定义在内部类中，只能run as configuraion
	    	 Outer outer =new Outer();//先实例化外部类，
	    	 Outer.Inner inner = outer.new Inner();//再实例化内部类
	    	 inner.innersay();//调用内部类方法,内部类方法再调用外部类的get方法及成员变量；
	    	 Outer out1=inner.getOuter();//调用getOuter,返回this(即outer实例)?
	    	 System.out.println(outer == out1);//out和out1指向同一个对象,想想why?
   }//内部类是个编译时的概念，一旦编译成功后，它就与外部类属于两个不同的类，有两个.class文件，即外部类名.class
	//和外部类名$内部类名.class；当然它们之间还是有联系的
		
	
}
