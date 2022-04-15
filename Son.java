package cn.hengyan.day18;

public class Son extends Father{//implements Father,Mother可以继承
	//多个接口，但不能继承多个类，所以必须先继承一个，把另一个当成内部类写
	class Mother_ extends Mother{
		//在内部类里面，相当于同时继承了Father和Mother;打破了只能继承一个父类的限制
	}
}//使用内部类的好处：
//1.内部类可以用多个实例，每个实例都有自己的状态信息，并且与其外围对象的信息相互独立；
//2.在单个外围类中，可以让多个内部类以不同的方式实现同一个接口，或者继承同一个类；
//3.内部类提供了更好的封装，除了该外围类，其他类都不能访问。；
