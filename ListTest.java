package cn.hengyan.day37;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List li=new ArrayList();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		li.add(3, 20);
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));			
		}
		li.set(3, 40);
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		System.out.println(li.indexOf(40));
	}
}
