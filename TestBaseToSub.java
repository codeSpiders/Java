package cn.hengyan.day09;

	class Base{//����
		 public void say() {//����ķ���
			 System.out.println("Base��say����");
		 }
	}
	
	class Sub extends Base{//����
		public void say() {//������д����ķ���
			System.out.println("Sub��say����");			
		}
		
		public void listen() {//������еķ���
			System.out.println("Sub��listen����");
		}
	}
	
public class TestBaseToSub {
	public static void main(String[] args) {
		Base base = new Sub();//
		Base base2 = new Base();
		base.say();
		if( base instanceof Sub ) {//�ж�base���������Ƿ���Sub
			((Sub)base).listen();//ǿ��ת����ע��Ҫ�����ţ�
		}
		base2.say();
//		((Sub)base2).listen();// cannot be cast
	}
}
