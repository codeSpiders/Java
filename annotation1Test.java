package cn.hengyan.day42;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE,ElementType.FIELD,ElementType.PACKAGE})

public @interface annotation1Test {
	String color();//自定义注释类的基本属性。注意，这里有个（），与一般类不一样
	String name() default "hehe";
	//有一点点特殊的属性
	String value();
}
