package cn.hengyan.day39;

import java.util.ArrayList;
import java.util.List;

public class FTest {
	public static void main(String[] args) {
		List<String> li=new ArrayList<>();
		li.add("sss");
	//	li.add(34);//加上泛型后，就不能放整型了，只能放泛型规定的类型
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
			String s1=(String)li.get(i);
			System.out.println(s1);			
		}
		
		List<Integer> li2=new ArrayList<>();
		li2.add(100);
		li2.add(344);
		System.out.println(li.getClass().getName());
		System.out.println(li2.getClass().getName());
		
	}
}//编译后的程序会采取去泛型化的措施。即泛型在编译之后就不存在了。泛型只在编译阶段有效。在编译过程中，正确验证了
//泛型结果以后，会将泛型的相关信息擦除，并且在类型进入和离开方法的边界处，添加类型检查和类型转换的方法，也就是说，
//泛型信息不会进入到运行时阶段。
//泛型类型可以在逻辑上看成是多个不同的类型，实际上都是相同的基本类型。
