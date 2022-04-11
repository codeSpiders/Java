package cn.hengyan.day14;

public class SingleTest {
	public static void main(String[] args) {
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);
		
		Single2 s3 = Single2.getInstance();
		Single2 s4 = Single2.getInstance();
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3 == s4);
		
	}
}
