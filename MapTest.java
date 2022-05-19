package cn.hengyan.day38;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		Map hmp=new HashMap();
		//����Ԫ��
		hmp.put("key1", "value1");
		hmp.put("key2", "value2");
		hmp.put("key3", "value3");
		hmp.put("key4", "value4");
		hmp.put("key5", "value5");
		//ɾ��Ԫ��
		hmp.remove("key5");
		//ͨ��keyֵ���valueֵ
		System.out.println(hmp.get("key4"));
		//�޸�Ԫ��
		hmp.put("key1", "value111");
		System.out.println(hmp.get("key1"));
		//�õ�value����
		Collection values=hmp.values();
		for(Object obj:values) {
			System.out.println(obj);
		}
		//�õ�key����
		Set key=hmp.keySet();
		for(Object obj:key) {
			System.out.println(obj);
			System.out.println("value:"+hmp.get(obj));
		}
		//�õ�entry
		Set<Map.Entry<String, String>> entrySet=hmp.entrySet();
		for(Map.Entry<String,String> entry:entrySet) {
			System.out.println("key:"+entry.getKey());
			System.out.println("value:"+entry.getValue());
		}
		
	}
}
