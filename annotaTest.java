package cn.hengyan.day42;


@annotation1Test(color = "red",value="aaaa")
public class annotaTest {
	public static void main(String[] args) {
		System.out.println(annotaTest.class.isAnnotationPresent(annotation1Test.class));
		if(annotaTest.class.isAnnotationPresent(annotation1Test.class)) {
			System.out.println("有注解");
			annotation1Test at= annotaTest.class.getAnnotation(annotation1Test.class);
			System.out.println(at);
			System.out.println(at.color());
		}else {
			System.out.println("没有注解");
		}
	}
	
}
