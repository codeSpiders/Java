package cn.hengyan.day26;

import java.io.IOException;

public class RunTimeTest {
	public static void main(String[] args) {
		Runtime t =Runtime.getRuntime();
		
		System.out.println(t.availableProcessors());//CPU内核数
		
		System.out.println("初始化时的总内存"+t.totalMemory());//输出总内存
		System.out.println("初始化时的可用内存"+t.freeMemory());//输出可用总内存
		
		//建议JVM进行垃圾回收，但是JVM不一定会执行。JVM定时自动回收垃圾
		t.gc();//Runtime中的gc与System中的gc完全一样。只是System中的gc是static，
		//不需要创建对象，直接通过类名调用；Runtime中的gc需要实例化对象，通过对象调用
		
		System.out.println("第一次GC后的总内存"+t.totalMemory());//输出总内存
		System.out.println("第一次GC后的可用内存"+t.freeMemory());//输出可用总内存
		Integer arr[]= new Integer[1000000];
		for(int i =0;i<1000000;i++) {
			 arr[i]=new Integer(i);			 
		}
		System.out.println("使用后的总内存"+t.totalMemory());
		System.out.println("使用后的可用内存"+t.freeMemory());
		for(int i =0;i<1000000;i++) {
			 arr[i]=null;			 
		}
		t.gc();
		System.out.println("第二次GC后的总内存"+t.totalMemory());
		System.out.println("第二次GC后的可用内存"+t.freeMemory());
		
		Process p=null;
		try {
			p=t.exec("notepad");//调用第三方程序			
			//p.waitFor();//等待打开别的程序执行完之后，才执行后面的java程序.注意和wait的区别
			Thread.sleep(2000);//让线程沉睡2s.
			p.destroy();//关闭已打开的第三方程序
		} catch (Exception  e) {
			System.out.println("调用外部程序失败");			
		}
		System.out.println("后面的java程序");
	}
}
