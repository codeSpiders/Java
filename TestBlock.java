package cn.hengyan.day11;

public class TestBlock {
	public static void main(String[] args) throws ClassNotFoundException {
		
		/*Class.forName("cn.hengyan.day11.test");//���þ��ǽ�test����ص�JVM
		new test();//��������//��������ʱ��ʽ����
		new test();
		new test();*/
		
		Class.forName("cn.hengyan.day11.test2");
		new test2();		
	}
}

class test{
	int a = 0;
	static int b = 0;
	test(){
		System.out.println("test�Ĺ�����");
		a=20;
		b=20;
	}
	
	{//���ж�Ӧ��test�౻ʵ������new�ؼ��ֵ������Ĺ�������ʱ��
		//newһ�ξͻ����һ��,����ִ�ж��
		System.out.println("test����ͨ��ʼ����");
		a=100;
		b=100;
	}
	
	static {//��ʼ�������ڳ��򱻼��ص��ڴ��е�ʱ�򣬾�̬�ĳ�ʼ����ᱻ
		//ִ�У�����ֻ��ִ��һ��//��̬��ʼ������������ͨ��ʼ��������
		System.out.println("test�ľ�̬��ʼ����");
		//a=800;//��̬��ֻ�ܷ��ʾ�̬��Ա����ͨ��͹������򶼿��Է���
		b=800;
	}
	
}//��ִ�о�̬��(��̬����)����ִ����ͨ�飨��ͨ���ԣ������ִ�й�������

class test1 extends test{
	test1(){
		System.out.println("test1�Ĺ�����");
	}
	
	{
		System.out.println("test1����ͨ��ʼ����");
	}
	
	static {
		System.out.println("test1�ľ�̬��ʼ����");
	}
}

class test2 extends test1{
	test2(){
		System.out.println("test2�Ĺ�����");
	}
	
	{
		System.out.println("test2����ͨ��ʼ����");
	}
	
	static {
		System.out.println("test2�ľ�̬��ʼ����");
	}
}
//ִ��˳��
//үү��ľ�̬��ʼ���飨���ԣ�
//����ľ�̬��ʼ���飨���ԣ�
//����ľ�̬��ʼ���飨���ԣ�
//үү�����ͨ��ʼ���飨���ԣ�-->������
//�������ͨ��ʼ���飨���ԣ�-->������
//�������ͨ��ʼ���飨���ԣ�-->������