package cn.hengyan.day19;

import cn.hengyan.day19.Outer1.Inner1;

public class Outer1Test {
	public static void main(String[] args) {
		Outer1 outer = new Outer1()	;
		//Inner1 inter =outer.new Inner1();//����Ҳ�У�Ӧ����
		Outer1.Inner1 inter = outer.new Inner1();
		//���Ƽ����������ã��Ƽ���getxxx��������ȡ����ڲ���Ķ���
		Outer1.Inner1 inter2 = outer.getInner1();
		inter.num =60;
		inter.innerStart();
		inter2.innerStart();		
		System.out.println(inter.num);
		inter.num=70;
		System.out.println(inter.num);
		//Inner1 inter2 =new Inner1();//����ǲ��е�
	}
}
