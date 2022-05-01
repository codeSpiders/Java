package cn.hengyan.day27;

import java.util.HashMap;
import java.util.Map;

public class ObjectTest {
	public static void main(String[] args) {
		Class cl =new ObjectTest().getClass();
		//ObjectTest是Object的子类，ObjectTest调用父类Object的getClass方法
		//得到一个Class类的实例
		
		ObjectTest obt=new ObjectTest();
		System.out.println(obt);
		System.out.println(obt.hashCode());
			
		String s1=new String("key1");
		String s2 = new String("key1");
		
		Map<String, value1> map1 = new HashMap<>();	
		value1 val = new value1(23);
		map1.put(s1,val);
		
		System.out.println(s1.equals(s2));
		System.out.println(map1.get(s1));
		System.out.println(map1.get(s2));
		//String类既重写了equals方法，也重写了hashcode方法，集合中是用hashcode
		//方法通过键取值。s1和s2在内存中位置不同，hashcode本来不同，但是String类重写了
		//hashcode方法
		
		Map<Key1, value1> map2=new HashMap<>();
		Key1 k1=new Key1("Tuesday");
		Key1 k2=new Key1("Tuesday");		
		map2.put(k1,val);
		
		System.out.println(k1.equals(k2));
		System.out.println(map2.get(k1));
		System.out.println(map2.get(k2));
		//Key1类只重写了equals方法，没有重写hashcode方法。所以，equals判断k1和k2
		//是相等的，但是集合中是以hashcode值为依据取值。key1类中没有重写hashcode方法，
		//它会调用父类object类中的hashcode方法。而这个方法返回的是由地址生成的hashcode
		//（地址不同，hashcode值不同）。所以，用k2就取不到val的值。
		//结论：重写equals方法，也必须同时重写hashcode方法。
	}
	
	static class Key1{
		private String k;
		public Key1(String k) {
			this.k=k;
		}		
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Key1) {
				Key1 k2=(Key1)obj;
				return k2.k.equals(this.k);
			}else {
				return false;
			}			
		}
		/*@Override//重写hashcode方法
		public int hashCode() {
			return k.hashCode();//k难道放在常量池中？？
		}*/
		
	}
	
	static class value1{
		private int v;
		public value1(int v) {
			this.v=v;
		}
		@Override
		public String toString() {
			return "value1 [v=" + v + "]";
		}
		
	}
	
}
