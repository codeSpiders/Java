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

		@Override//��Ϊ��ʾ������������һ�����Ǹ����ͬ����������ֹ��д��
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
		
		
}
