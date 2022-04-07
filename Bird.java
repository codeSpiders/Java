package cn.hengyan.day10;

public class Bird {
	private Animal animal;  //定义Bird的一个成员属性
	public Bird() {
		
	}
	public Bird(Animal animal) {
		this.animal = animal;  //初始化成员属性
		
	}
	public void breath() {  //定义成员方法
		 animal.breath();  //调用成员属性中的一个方法
	}
}
