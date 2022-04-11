package cn.hengyan.day13;

public class EqualsRewrite {//equals的经典写法	
	private int ip ;

	public int getIp() {
		return ip;
	}

	public void setIp(int ip) {
		this.ip = ip;
	}
	
	public boolean equals (Object obj) {	
		
		if( this == obj) {//自己和自己比，肯定相等//自反性
			return true;
		}
		
		if(obj == null) {//自己和"无"比，肯定不相等
			return false;
		}
		if(!(obj instanceof EqualsRewrite)) {//不同的类相比，肯定不相等
		//另一种写法：！（obj instanceof this.getClass()）
			//还一种写法：!(this.getClass() == obj.getClass())
			return false;
		}
		EqualsRewrite other=(EqualsRewrite)obj;
		if(this.getIp() == other.getIp()) {
			return true;
		}else {
			return false;
		}		
	}//equals重写的规则：
	//1.对于任意x，x.equals(x)结果要为true；自反性
	//2.对于任意x,y,如果x.equals(y)是true,那么y.equals(x)也应该是true;对称性
	//3.对于任意x,y,z,如果x.equals(y)是true,y.equals(z)是true,那么x.equals(z)也应该是true;传递性
	//4.对于任意x,y,若对象中用于等价比较的信息未变，那么无论调用多少次x.equals(y)，其结果应该是相同的，要么都是true，要么都是false；一致性
	//5.对于任何非null的对象，x.equals(null)一定是false；
	
}
