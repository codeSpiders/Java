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
}//1.����ֻ�ܴ�Ŷ���һ��int���͵����ݷ��뼯���У����Զ�ת����integer��Ķ���
//2.���ϴ�ŵ��Ƕ����������ã��������Ƿ��ڶ��ڴ���
//3.���Ͽ��Դ�Ų�ͬ���ͣ�������������������
