package cn.hengyan.day25;

import java.util.Arrays;
//System������˵�ǰJava���������ʱƽ̨�������ܴ���system��Ķ��󣬣���Ϊ���Ĺ��췽��
//��private���εģ���system���ṩ��һЩ�����ͷ�����������static�����εģ���Щ�����ͷ���
//����ֱ��ͨ��system�������ã�����Ҫ����ʵ����ͨ��ʵ�������ã�
public class SystemTest {
	public static void main(String[] args) {
		//��native�����������飬��ѭ��Ч�ʸ�
		int a[]= {1,2,3,4,5};
		int b[] = {1,2,3,5,6,7,5};//Ŀ������Ԫ�ظ����������ӣ����ƺ��ܳ���Ŀ������ĳ���
		System.arraycopy(a,1,b,3,2);
		System.out.println(Arrays.toString(b));
		
		//��ȡϵͳʱ��
		System.out.println(System.currentTimeMillis());//��1970.1.1���ĺ���
		long start = System.currentTimeMillis();
		for(int i=0;i<100000;i++) { 
			int ab = i;	
		}
		long over = System.currentTimeMillis();
		long t =over-start;
		System.out.println(t);
		
		//��ȡϵͳ����
		System.out.println(System.getProperty("java.version"));
		System.out.println(System.getProperties());
	}
	
}
