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
		//Arrays.sort(arr);//Comparable接口排序
		Arrays.sort(arr,new PuppleComparator());//Comparator接口排序
		System.out.println(Arrays.toString(arr));
		
	}
}//Comparable和Comparator的比较：
//1.Comparable比较固定，和一个具体类绑定，而Comparator比较灵活，它可以应用于各个需要比较
//   功能的类使用；
//2.Comparable是排序接口，若一个类实现了Comparable接口，就意味着该类支持排序；而Comparator
//  是比较器，当需要控制某个类的次序时，可建立一个该类的比较器来进行排序；
//3.Comparable相当于内部比较器，而Comparator相当于外部比较器；
//4.Comparable是通用的接口，用户可以实现它来进行特定的比较；而Comparator可以看成是一种算法
//  的实现，在需要容器集合实现比较功能的时候，来指定这个比较器，这可以看成一种设计模式，将算法和数据分离；
//5.当使用Comparable时，需要重写equals方法和hashcode方法；
