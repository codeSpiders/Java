package cn.hengyan.day16;

public abstract class Animal1 {//��abstract���Σ����ǳ�����
	//�����಻��ʵ����
	public abstract void bark();//����Ҫ�����壬���û�д�����
	//����ע�⣬Ҫ�ӷֺ�;�����Ҳ��abstract����
	//����̳г�����ʱ�����󷽷�������д�����򱨴�
	public void run() {//�������п��԰�����ͨ����
		System.out.println("run,run");
	}
	private int age;//�������п��԰�����ͨ��Ա����
	//public abstract String name;//�������в����г����Ա�������������������
	
}//1.���󷽷�ֻ����public,protected���Σ����ܱ�private���Σ�����������޷����ʣ�
//2.�����಻�ܴ�������
//3.�������̳г����࣬��ô�������Ҫʵ�֣���д������ĳ��󷽷�����������Ҳ����
//��abstract���Σ����һ��������

 class Bird extends Animal1{
	public void bark() {
		System.out.println("����\n");
	}
}
  
class Cow extends Animal1{
		@Override
		public void bark() {
			System.out.println("����\n");
		}
		
}

abstract class  fox extends Animal1{//������Բ�ʵ�ָ���abstract����
	//��ʱ����Ҳ�����abstract�ؼ��֣�����Ҳ�ͳ�Ϊ��һ��������
	
}