package cn.hengyan.day14;

public class Single2 {//����ģʽ
	
	private static Single2  single2  = null;//2.�����Ա����,
	//ע��û�г�ʼ��
	
	private Single2() {//1.������˽�л�		
	}
	
	public static Single2 getInstance() {
		if(single2 == null) {
			single2 =new Single2();
		}
		return single2;
	}//�����ṩ��ȡ����ķ���
}
