package cn.hengyan.day21;

import cn.hengyan.day21.Outer3.Innner2;

public class Outer3Test {
	public static void main(String[] args) {
		//�Ǿ�̬�ڲ���Ĳ�����ʽ
		Outer3 outer3 = new Outer3();
		Outer3.Innner1 innner1 = outer3.new Innner1();//ע��new��λ�ã��������м�
		innner1.innneraa();
		
		//��̬�ڲ���Ĳ�����ʽ
		Innner2.twice= "once again";//ֱ���þ�̬�ڲ��������þ�̬�ĳ�Ա������Ҫͨ���ⲿ��
		Innner2.stamethod();		
		//Innner2.yypp = 20;//�Ǿ�̬������������ֱ�ӵ���
		Innner2 innner2 = new Innner2();//��̬�ڲ����еķǾ�̬��Ա����Ҫʵ�������������ã�
		innner2.yypp=84;//����ʵ��������Ҳ����Ҫͨ���ⲿ�ࣨ���һ���ڲ��಻һ����
		innner2.method();
	}
}
