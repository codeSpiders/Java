package cn.hengyan.day15;

public class FinalVSStatic {
	public static void main(String[] args) {
		MyRandom mr1 = new MyRandom();
		MyRandom mr2 = new MyRandom();
		
		System.out.println(mr1.i);
		System.out.println(mr1.j);
		System.out.println(mr2.i);
		System.out.println(mr2.j);
	}
}

class MyRandom{
	public final double i =Math.random();
	public static double j = Math.random();
}//static ���ݴ��ھ�̬��������һ���ص�������У�����static�������ص���̬��
//��̬����ʵ���ǹ����������е�ͬ����󶼹��У����У�����j��ֵ��ͬ���Һ������Ըı�
//final ���ݳ������е�����ʱ�ż��ص�ջ����У������ʼ�����ҳ�ʼ�����ܸı�
//ͬһ���е��������󣬷ֱ�ӵ�в�ͬ���ڴ�����Ҳ��������final�������������������Բ�ͬ�����������ܸı�

//����ȫ�ֳ�����һ���������壺
//public static final int CS = 500;
//�����ھ�̬���򴴽����ɸ��ĵ���������ȫ�ֳ���