package cn.hengyan.day21;

public class Outer3 {
	private int ip;
	private static String once;
	
	public class Innner1{//�Ǿ�̬�ĳ�Ա�ڲ���
		public static int iipp =36;//���ڵİ汾�������������ͨ��Ա�ڲ����ж��徲̬����
		public void innneraa() {
			//��Ա�ڲ�����Է��������ⲿ���о�̬�ͷǾ�̬��Ա
			ip = 34;
			once = "lover";
			System.out.println(ip);
			System.out.println(once);
			System.out.println(iipp);
		}		
	}
	
	public static class Innner2{//��̬�ĳ�Ա�ڲ���
		public int yypp;//��̬�ĳ�Ա�ڲ�������зǾ�̬�ĳ�Ա
		public static String twice;//��̬�ĳ�Ա�ڲ�������о�̬�ĳ�Ա
		public static void stamethod() {
			System.out.println("���Ǿ�̬�ڲ���ľ�̬����");
		}
		public void method() {
			System.out.println("���Ǿ�̬�ڲ���ķǾ�̬����");
		}
		
	}
}
