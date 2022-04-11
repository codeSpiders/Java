package cn.hengyan.day13;

public class EqualsRewrite {//equals�ľ���д��	
	private int ip ;

	public int getIp() {
		return ip;
	}

	public void setIp(int ip) {
		this.ip = ip;
	}
	
	public boolean equals (Object obj) {	
		
		if( this == obj) {//�Լ����Լ��ȣ��϶����//�Է���
			return true;
		}
		
		if(obj == null) {//�Լ���"��"�ȣ��϶������
			return false;
		}
		if(!(obj instanceof EqualsRewrite)) {//��ͬ������ȣ��϶������
		//��һ��д��������obj instanceof this.getClass()��
			//��һ��д����!(this.getClass() == obj.getClass())
			return false;
		}
		EqualsRewrite other=(EqualsRewrite)obj;
		if(this.getIp() == other.getIp()) {
			return true;
		}else {
			return false;
		}		
	}//equals��д�Ĺ���
	//1.��������x��x.equals(x)���ҪΪtrue���Է���
	//2.��������x,y,���x.equals(y)��true,��ôy.equals(x)ҲӦ����true;�Գ���
	//3.��������x,y,z,���x.equals(y)��true,y.equals(z)��true,��ôx.equals(z)ҲӦ����true;������
	//4.��������x,y,�����������ڵȼ۱Ƚϵ���Ϣδ�䣬��ô���۵��ö��ٴ�x.equals(y)������Ӧ������ͬ�ģ�Ҫô����true��Ҫô����false��һ����
	//5.�����κη�null�Ķ���x.equals(null)һ����false��
	
}
