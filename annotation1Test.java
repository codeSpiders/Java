package cn.hengyan.day42;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE,ElementType.FIELD,ElementType.PACKAGE})

public @interface annotation1Test {
	String color();//�Զ���ע����Ļ������ԡ�ע�⣬�����и���������һ���಻һ��
	String name() default "hehe";
	//��һ������������
	String value();
}
