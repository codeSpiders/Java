package cn.hengyan.day41;

import java.awt.desktop.PrintFilesEvent;
import java.security.PublicKey;

import cn.hengyan.day17.Print;

public class TTest {
		public static void main(String[] args) {
			show();
			show1();
			@SuppressWarnings("unused")
			String string="sffffege";
		}
		
		@Deprecated
		public static void show() {
			System.out.println("show");
		}
		
		public static void show1() {
			System.out.println("show1");
		}

		@Override//作为警示，提醒你这是一个覆盖父类的同名方法，防止你写错
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
		
		
}
