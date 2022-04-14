package cn.hengyan.day17;

public class Phone implements Usb{

	@Override
	public void install() {
		System.out.println("为手机安装驱动");
		
	}

	@Override
	public void work() {
		System.out.println("为手机工作");
		
	}	
	
}
