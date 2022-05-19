package cn.hengyan.day38;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		Map hmp=new HashMap();
		//增加元素
		hmp.put("key1", "value1");
		hmp.put("key2", "value2");
		hmp.put("key3", "value3");
		hmp.put("key4", "value4");
		hmp.put("key5", "value5");
		//删除元素
		hmp.remove("key5");
		//通过key值获得value值
		System.out.println(hmp.get("key4"));
		//修改元素
		hmp.put("key1", "value111");
		System.out.println(hmp.get("key1"));
		//拿到value集合
		Collection values=hmp.values();
		for(Object obj:values) {
			System.out.println(obj);
		}
		//拿到key集合
		Set key=hmp.keySet();
		for(Object obj:key) {
			System.out.println(obj);
			System.out.println("value:"+hmp.get(obj));
		}
		//拿到entry
		Set<Map.Entry<String, String>> entrySet=hmp.entrySet();
		for(Map.Entry<String,String> entry:entrySet) {
			System.out.println("key:"+entry.getKey());
			System.out.println("value:"+entry.getValue());
		}
		
	}
}
