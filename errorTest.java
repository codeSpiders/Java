package cn.hengyan.day43;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class errorTest {
	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("E://a.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("文件没有找到");;
		}
	}
}
