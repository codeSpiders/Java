package cn.hengyan.day30;

public class StringTest {
	public static void main(String[] args) {
		String s1="hard work!";
		String s2=new String("hard work!");
		String s3="hard work!";
		String s4=new String("hard work!");
		System.out.println(s1==s2);//��ŵĵ�ַ��һ��
		System.out.println(s1==s3);//��ŵĵ�ַһ�����ڳ�����.�����ز��ᴴ���ظ��Ķ���
		System.out.println(s2==s4);//��ŵĵ�ַ��һ��
		
		String st1="";
		for(int i=0;i<100;i++) {
			st1 +="hello";//string����࣬�������ַ����ı��ʱ�򣬷�����һ���¶���
			//ÿѭ��һ�Σ�newһ���¶���ѭ��100�Σ�new��100���¶���
		}//Ч�ʵ����Ҵ����˷��ڴ���Դ,Ϊ�˷���Щȱ�㣬������һ���µ��࣬StringBuilder
		System.out.println(st1);
		
		StringBuilder sBuilder=new StringBuilder();
		for(int i=0;i<10;i++) {
			sBuilder.append("hello");//���ص�����������������ѭ�����ٴΣ�
			//��ֻ�������ʱ��newһ������
		}//JDK5�漰�Ժ�ƴ�Ӳ���ʱ���������Զ���Stringת������StringBuilder
		System.out.println(sBuilder.toString());
	}
}//string��stringbuilder,stringbuffer�ܽ᣺
//1.ѭ����ƴ�ӣ���string +������
//2.��ѭ��ƴ�ӵĻ��������ѭ����������StringBuilder������ѭ�����ڽ����ֶ�append��
//3.��������˶��̵߳Ļ�������ʹ��StringBuffer;
