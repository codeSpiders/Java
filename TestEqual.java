package cn.hengyan.day13;

public class TestEqual {
	public static void main(String[] args) {
		int a = 12;
		int b = 12;
		int c = 65;
		char d = 'A';
		System.out.println(a == b);
		System.out.println(c == d);//�ַ�����ֱ�������ͱȽ�
		char ch1 = 2500;//�Ƿ���ڳ����أ���ʹ�����ڳ����أ�
		char ch2 = 2500;//Ҳ���ԱȽ�,��Ϊ�����ǻ�������
		System.out.println(ch1 == ch2);		
		
		Person p1 = new Person();
		Person p2 = new Person();//p1,p2ʵ���ǵ�ַ���������
		System.out.println(p1 == p2);
		p1 = p2;//��ʱ��p2��ָ�ĵ�ַ����p1����ʱp1,p2ָ��ͬһ������
		System.out.println(p1 == p2);//��ʱΪtrue
		
		//�ַ���������һ���г����صĹ����ط�,�ַ��������������������ͣ�����
		//������������ݲ��ظ���
		String s1 = "120";
		String s2 = "120";
		System.out.println(s1 == s2);
		String s3 = "1200bc";
		String s4 = "1200bc";
		System.out.println(s3 == s4);//��ʱ����ȵģ�����ͬ���ĵ�ַ
		String s5 =new String("1200bc");//�˷���������ַ�����
		//û�зŵ������أ���������һ��������ڶ���
		System.out.println(s3 == s5);//false
		
		String s6 = "1200bc";
		String s7 = new String("1200bc");
		System.out.println(s7.equals(s6));//true;
		System.out.println(s6.equals(s7));//true;
		//String�����Ѿ���Object�е�equals������������д
		//equals�Աȵ�������
		
		
	}
	
}
