package cn.hengyan.day10;

public class Bird {
	private Animal animal;  //����Bird��һ����Ա����
	public Bird() {
		
	}
	public Bird(Animal animal) {
		this.animal = animal;  //��ʼ����Ա����
		
	}
	public void breath() {  //�����Ա����
		 animal.breath();  //���ó�Ա�����е�һ������
	}
}
