package cn.hengyan.day14;

public class Single {//饿汉模式
	
	private static Single single=new Single();//第二步，
	//饿汉模式新建属性的时候，就初始化一个对象//single也可以跟类同名
	//（Single），只是命名习惯要求属性首字母小写
	//注意采用static
	
	private Single() {//private 修饰构造方法//第一步		
	}
	
	public static Single getInstance() {//第三步，注意采用static
		return single;
	}//对外提供获取本类的方法
	
}
