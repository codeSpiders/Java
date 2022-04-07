package cn.hengyan.day10;

public class TestCombination {
	public static void main(String[] args) {
		Animal animal=new Animal();  //创建Animal对象
		Bird bird = new Bird(animal);//创建Bird对象，
		//并初始化成员属性animal
		bird.breath();	//调用Bird成员方法。此方法中又调用
		//成员属性animal的方法，即Animal类中的breath方法
				
	}
}
