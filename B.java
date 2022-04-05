package cn.hengyan.day08;

public class B extends A{
	public String show(B b) {
		return "B and B";		
	}
	
	public String show(A a) {
		return "B and A";
	}
}
