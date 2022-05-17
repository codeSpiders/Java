package cn.hengyan.day36;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class conTest {
	public static void main(String[] args) {
		Collection collection=new ArrayList();
		collection.add("Monday");
		collection.add("Tuesday");
		collection.add("Wendesday");
		Iterator iterator=collection.iterator();
		while(iterator.hasNext()) {
			String s=(String) iterator.next();
			System.out.println(s);			
		}
		collection.remove("Monday");
		collection.removeAll(collection);
		for (Object obj : collection) {
			System.out.println(obj);
		}
		System.out.println(collection.isEmpty());
	}
}//1.集合只能存放对象，一个int类型的数据放入集合中，会自动转换成integer类的对象
//2.集合存放的是多个对象的引用，对象本身还是放在堆内存中
//3.集合可以存放不同类型，不限数量的数据类型
