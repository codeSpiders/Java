package cn.hengyan.day25;

import java.util.Arrays;
//System类代表了当前Java程序的运行时平台，程序不能创建system类的对象，（因为它的构造方法
//是private修饰的），system类提供了一些变量和方法，都是用static来修饰的，这些变量和方法
//可以直接通过system类来调用（不需要创建实例，通过实例来调用）
public class SystemTest {
	public static void main(String[] args) {
		//用native方法拷贝数组，比循环效率高
		int a[]= {1,2,3,4,5};
		int b[] = {1,2,3,5,6,7,5};//目标数组元素个数不能增加，复制后不能超过目标数组的长度
		System.arraycopy(a,1,b,3,2);
		System.out.println(Arrays.toString(b));
		
		//获取系统时间
		System.out.println(System.currentTimeMillis());//与1970.1.1相差的毫秒
		long start = System.currentTimeMillis();
		for(int i=0;i<100000;i++) { 
			int ab = i;	
		}
		long over = System.currentTimeMillis();
		long t =over-start;
		System.out.println(t);
		
		//获取系统特性
		System.out.println(System.getProperty("java.version"));
		System.out.println(System.getProperties());
	}
	
}
