package cn.hengyan.day29;

import java.util.Arrays;

public class ComparableTest {
	public static void main(String[] args) {
		Integer integer=1;
		String s1="acb";
		String s2="aa";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.equals(s2));
		
		Pupple p1=new Pupple();
		p1.setId(4);
		
		Pupple p2=new Pupple();
		p2.setId(3);
		
		Pupple p3=new Pupple();
		p3.setId(2);
		
		Pupple p4=new Pupple();
		p4.setId(1);
		
		Pupple[] arr= {p1,p2,p3,p4};
		System.out.println(Arrays.toString(arr));
		//Arrays.sort(arr);//Comparable�ӿ�����
		Arrays.sort(arr,new PuppleComparator());//Comparator�ӿ�����
		System.out.println(Arrays.toString(arr));
		
	}
}//Comparable��Comparator�ıȽϣ�
//1.Comparable�ȽϹ̶�����һ��������󶨣���Comparator�Ƚ���������Ӧ���ڸ�����Ҫ�Ƚ�
//   ���ܵ���ʹ�ã�
//2.Comparable������ӿڣ���һ����ʵ����Comparable�ӿڣ�����ζ�Ÿ���֧�����򣻶�Comparator
//  �ǱȽ���������Ҫ����ĳ����Ĵ���ʱ���ɽ���һ������ıȽ�������������
//3.Comparable�൱���ڲ��Ƚ�������Comparator�൱���ⲿ�Ƚ�����
//4.Comparable��ͨ�õĽӿڣ��û�����ʵ�����������ض��ıȽϣ���Comparator���Կ�����һ���㷨
//  ��ʵ�֣�����Ҫ��������ʵ�ֱȽϹ��ܵ�ʱ����ָ������Ƚ���������Կ���һ�����ģʽ�����㷨�����ݷ��룻
//5.��ʹ��Comparableʱ����Ҫ��дequals������hashcode������
