package cn.hengyan.day19;

/*��Ա�ڲ�����һ����ͨ���ڲ��࣬���ⲿ���һ����Ա�����ԣ��ڲ�����������Ƶط����ⲿ������Ժͷ����������Ƿ�
 * ��private���Σ����ⲿ��Ҫ�����ڲ���ĳ�Ա�ͷ�������ֻ��ͨ���ڲ���ʵ�������ʣ�
 * ��Ա�ڲ����в��ܴ����κ�static�ı����ͷ�����
 * ��Ա�ڲ������������ⲿ��ģ�����ֻ���ȴ������ⲿ�࣬���ܴ����ڲ���
 */
public class Outer1 {
	private String name;
	private int age;
	
	public class Inner1{//ע�ⶨ��λ�ã��������ⲿ������棬�ͳ�Ա��������Ա��������,���Խг�Ա�ڲ���
		
		public static int num;//��Ա�ڲ��������Զ���static����������涨ì�ܣ�
		
		public void innerStart() {
			name = "��ΰ";//����ֱ�ӷ����ⲿ��ĳ�Ա����
			age = 25;
			System.out.println(name);
			System.out.println(age);
			
		}
	}
	
	public Inner1 getInner1() {//��Ա�ڲ����get������
		return new Inner1();
	}
}
