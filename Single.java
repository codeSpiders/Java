package cn.hengyan.day14;

public class Single {//����ģʽ
	
	private static Single single=new Single();//�ڶ�����
	//����ģʽ�½����Ե�ʱ�򣬾ͳ�ʼ��һ������//singleҲ���Ը���ͬ��
	//��Single����ֻ������ϰ��Ҫ����������ĸСд
	//ע�����static
	
	private Single() {//private ���ι��췽��//��һ��		
	}
	
	public static Single getInstance() {//��������ע�����static
		return single;
	}//�����ṩ��ȡ����ķ���
	
}
