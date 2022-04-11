package cn.hengyan.day14;

public class Single2 {//懒汉模式
	
	private static Single2  single2  = null;//2.定义成员属性,
	//注意没有初始化
	
	private Single2() {//1.构造器私有化		
	}
	
	public static Single2 getInstance() {
		if(single2 == null) {
			single2 =new Single2();
		}
		return single2;
	}//对外提供获取本类的方法
}
