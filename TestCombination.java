package cn.hengyan.day10;

public class TestCombination {
	public static void main(String[] args) {
		Animal animal=new Animal();  //����Animal����
		Bird bird = new Bird(animal);//����Bird����
		//����ʼ����Ա����animal
		bird.breath();	//����Bird��Ա�������˷������ֵ���
		//��Ա����animal�ķ�������Animal���е�breath����
				
	}
}
