package cn.hengyan.day26;

import java.io.IOException;

public class RunTimeTest {
	public static void main(String[] args) {
		Runtime t =Runtime.getRuntime();
		
		System.out.println(t.availableProcessors());//CPU�ں���
		
		System.out.println("��ʼ��ʱ�����ڴ�"+t.totalMemory());//������ڴ�
		System.out.println("��ʼ��ʱ�Ŀ����ڴ�"+t.freeMemory());//����������ڴ�
		
		//����JVM�����������գ�����JVM��һ����ִ�С�JVM��ʱ�Զ���������
		t.gc();//Runtime�е�gc��System�е�gc��ȫһ����ֻ��System�е�gc��static��
		//����Ҫ��������ֱ��ͨ���������ã�Runtime�е�gc��Ҫʵ��������ͨ���������
		
		System.out.println("��һ��GC������ڴ�"+t.totalMemory());//������ڴ�
		System.out.println("��һ��GC��Ŀ����ڴ�"+t.freeMemory());//����������ڴ�
		Integer arr[]= new Integer[1000000];
		for(int i =0;i<1000000;i++) {
			 arr[i]=new Integer(i);			 
		}
		System.out.println("ʹ�ú�����ڴ�"+t.totalMemory());
		System.out.println("ʹ�ú�Ŀ����ڴ�"+t.freeMemory());
		for(int i =0;i<1000000;i++) {
			 arr[i]=null;			 
		}
		t.gc();
		System.out.println("�ڶ���GC������ڴ�"+t.totalMemory());
		System.out.println("�ڶ���GC��Ŀ����ڴ�"+t.freeMemory());
		
		Process p=null;
		try {
			p=t.exec("notepad");//���õ���������			
			//p.waitFor();//�ȴ��򿪱�ĳ���ִ����֮�󣬲�ִ�к����java����.ע���wait������
			Thread.sleep(2000);//���̳߳�˯2s.
			p.destroy();//�ر��Ѵ򿪵ĵ���������
		} catch (Exception  e) {
			System.out.println("�����ⲿ����ʧ��");			
		}
		System.out.println("�����java����");
	}
}
