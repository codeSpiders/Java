package cn.hengyan.day27;

import java.util.HashMap;
import java.util.Map;

public class ObjectTest {
	public static void main(String[] args) {
		Class cl =new ObjectTest().getClass();
		//ObjectTest��Object�����࣬ObjectTest���ø���Object��getClass����
		//�õ�һ��Class���ʵ��
		
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
		//String�����д��equals������Ҳ��д��hashcode����������������hashcode
		//����ͨ����ȡֵ��s1��s2���ڴ���λ�ò�ͬ��hashcode������ͬ������String����д��
		//hashcode����
		
		Map<Key1, value1> map2=new HashMap<>();
		Key1 k1=new Key1("Tuesday");
		Key1 k2=new Key1("Tuesday");		
		map2.put(k1,val);
		
		System.out.println(k1.equals(k2));
		System.out.println(map2.get(k1));
		System.out.println(map2.get(k2));
		//Key1��ֻ��д��equals������û����дhashcode���������ԣ�equals�ж�k1��k2
		//����ȵģ����Ǽ���������hashcodeֵΪ����ȡֵ��key1����û����дhashcode������
		//������ø���object���е�hashcode������������������ص����ɵ�ַ���ɵ�hashcode
		//����ַ��ͬ��hashcodeֵ��ͬ�������ԣ���k2��ȡ����val��ֵ��
		//���ۣ���дequals������Ҳ����ͬʱ��дhashcode������
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
		/*@Override//��дhashcode����
		public int hashCode() {
			return k.hashCode();//k�ѵ����ڳ������У���
		}
		
	}*/
	
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
