package cn.hengyan.day20;

public class Outer2 {
	public String name;
	public int age;
	
	public void outermethod() {//�˷����д��ݵĲ�����������ڲ����ã���Ҫ��final���Σ����û����д
		//final���Σ�ֻҪ�ڲ����õ�����Ĭ��Ϊfinal����
//		class Inner2 implements InnerInterface{//�ֲ��ڲ��࣬�������Ƿ������ڣ��������ڲ�����ͬ
//
//			@Override
//			public String innmethod() {				
//				return "���Ǿֲ���Inner2ʵ��InnerInterface�ӿڵķ���";
//			}
//			
//		}
//		Inner2 inner2 = new Inner2();
//		String string= inner2.innmethod();
//		System.out.println(string);
		
		//ͨ���ӿڣ�дһ���������ڲ���
		InnerInterface inns =new InnerInterface() {//new�ؼ���newһ���ӿڣ��ӿں����
			//�������һ��ʵ������ӿڵ�ʵ��������壬������壬û�п�����Ӧ��������δʣ�Ҳû�п���������Ӧ
			//������������࣬����һ���������ڲ��ࣻ
			//�������ͣ������ڲ��ࣩ�ı�����ֵ���������ͣ�InnerInterface���ı�������̬
			@Override
			public String innmethod() {				
				return "���Ǿֲ���Inner2ʵ��InnerInterface�ӿڵ���������";
			}
			
		};//1.�����ڲ���û�з������η�
		//2.new�����ڲ��࣬д����new�����ڲ����ʵ�ֽӿڣ����û�нӿڣ���������
		//3.�˷����д��ݵĲ�����������ڲ����ã���Ҫ��final���Σ���Ϊ�������ֽ��룬�������ڻ᲻һ��
		//4.�����ڲ���û�й��췽������Ϊ����������û�У��͸�����̸�����ˡ�
		String string = inns.innmethod();
		System.out.println(string);
		
	}
}
