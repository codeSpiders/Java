package cn.hengyan.day15;

import cn.hengyan.day13.Person;

//final����˼�ǲ��ɸı�ġ���������˼��final���ε����ǲ��ɸı�ģ�
//���Һ�������ȫ��Ҫ��д����PI;
//static��ʾ�������ֻ����һ�ݵı��������������ֵ�ǿ��Ըı�
public class FinalTest {
	
	//final���α����������εı��������ʼ�������Ҹ�ֵ�����ٸ�ֵ���߸ı�
	//�ֲ������������۷��룬�ֲ���������������÷�Χ����ʹ��public��private
	//�����Σ�һ������£�final�������ξֲ���������һ�㲻����ô����û������
	final  int a = 26;//��һ�ַ���������ʱ��ʼ����ע��finalд��intǰ�棻
	final int  b ;
	final int c;
	final static int d =68;
	
	public FinalTest(){//�ڶ��ַ������ڹ������г�ʼ����
		b = 24;
	}
	
	{//�����ַ������ڷǾ�̬���г�ʼ��
		c=56;
	}	
	
	public static void main(String[] args) {
		//d=99;//��fianl���εĻ�����������ֵ���ܸı䣻
		final Person person =new Person();
		//person =new Person();//��final���ε����ñ�����
		//��ָ��Ķѵ�ַ���ܸı䣬���Ƕ��д����ֵ���Ըı䣬���£�
		person.setAge(18);
		System.out.println(person.getAge());
		person.setAge(50);
		System.out.println(person.getAge());
		
		//final���η�������ô����������ܱ���д
		//final�����࣬��ô����಻�ܱ��̳�,���е����г�Ա��������ʽ�ر�final���Σ�
		
	}
}

class person{
	
	int ip;
	String name;
	
	public int getIp() {
		return ip;
	}
	public void setIp(int ip) {
		this.ip = ip;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "person [ip=" + ip + ", name=" + name + "]";
	}
	
}
