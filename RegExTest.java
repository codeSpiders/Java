package cn.hengyan.day34;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTest {
	public static void main(String[] args) {
		//写一个程序，验证一个表达式是否是邮箱地址
		String email="adfegrhth@163.com";
		String regEx1="^[a-zA-Z0-9_]([\\w]|#|\\$|%|&|\\*|-|=|\\+)*@[a-zA-Z0-9]([a-zA-Z0-9]|\\.)*\\.[a-zA-Z]{2,4}";
		Pattern pattern=Pattern.compile(regEx1);
		Matcher matcher=pattern.matcher(email);
		boolean rs=matcher.matches();
		boolean rs2=matcher.find();
		String s=regEx1.replace(regEx1, "aaaa");
		System.out.println(rs);
		System.out.println(rs2);
		System.out.println(s);
	}
}
