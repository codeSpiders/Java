package cn.hengyan.day18;


public class Outer {
	
	private String name;
	
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	class Inner{//�ڲ���д���ⲿ������棬�����ⲿ������г�Ա��������Ա���������򶼸������ڲ��࣬��
		//���ڲ�������޷�����ⲿ��ĳ�Ա�����ͳ�Ա������
		
		public Inner() {
			//�ڲ������ֱ�ӷ����ⲿ��ĳ�Ա�����ͳ�Ա�����������ⲿ��ĳ�Ա��private���εġ�
	     name = "Фţ";//������д��Outer.name,��Ϊ��û��ʵ������Outer���ھ�̬����
	     age =19;	     
		}
		
		public void innersay() {
			System.out.println("�����ڲ���ķǹ��췽��");
			System.out.println(name);
		    System.out.println(getName());	
		}
		
		public Outer getOuter() {//���ⲿ���е�getName���ƣ�
			return Outer.this;//��ʾһ����Χ���һ�����������
		}
	}
	
	public static void main(String[] args){//ע�⣺main����ֻ�ܶ�����Outer����
	    	 //�������ڲ����У�ֻ��run as configuraion
	    	 Outer outer =new Outer();//��ʵ�����ⲿ�࣬
	    	 Outer.Inner inner = outer.new Inner();//��ʵ�����ڲ���
	    	 inner.innersay();//�����ڲ��෽��,�ڲ��෽���ٵ����ⲿ���get��������Ա������
	    	 Outer out1=inner.getOuter();//����getOuter,����this(��outerʵ��)?
	    	 System.out.println(outer == out1);//out��out1ָ��ͬһ������,����why?
   }//�ڲ����Ǹ�����ʱ�ĸ��һ������ɹ����������ⲿ������������ͬ���࣬������.class�ļ������ⲿ����.class
	//���ⲿ����$�ڲ�����.class����Ȼ����֮�仹������ϵ��
		
	
}
