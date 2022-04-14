package cn.hengyan.day17;

public class InterfaceTestComputer {
	public static void main(String[] args) {
		Computer computer = new Computer();
		Phone phone = new Phone();
		Print print = new Print();
		computer.plugin(phone);
		computer.plugin(print);
	}
	
}
