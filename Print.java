package cn.hengyan.day17;

public class Print implements Usb {

	@Override
	public void install() {
		System.out.println("为打印机安装驱动");
		
	}

	@Override
	public void work() {
		System.out.println("为打印机工作");
		
	}
	
}
