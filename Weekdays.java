package cn.hengyan.day22;

public enum Weekdays {//ö�ٵ����֣����ܺ�����ͬ��
	//ö������ֻ�����ڴ�������׶Σ���ӦJava�������˵��û��ö��������ö��������������������࣬
	//��������ö��ת������࣬����ö���඼�̳���Java.lang.Enum����ࡣ
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
	public static int month=1;
	
}

enum Dday{//�Զ���ö�٣������Ǹ���Ĭ�ϵ�
	MONDAY("����һ",1),TUESDAY("���ڶ�",2),WEDNESDAY("������",3),
	THURSDAY("������",4),FRIDAY("������",5),SATURDAY("������",6),SUNDAY("������",7);
	private String desc;
	private int index;
	private Dday(String desc,int index) {
		//˽�л�ö�����͵Ĺ��������ⲿ���޷�ʵ��������(��ֹ���ⲿ����)
		this.desc = desc;
		this.index =index;		
	}
	
	public String getDesc() {
		return desc;
	}
	
	public int getIndex() {
		return index;
	}
	
	//���徲̬������ͨ��index����ȡö�ٶ���
	public static Dday getDdayByIndex(int index) {
		Dday d=null;
		switch (index) {
		case 1: {
			d= Dday.MONDAY;	
			break;
		}//ע�⣬����return�����Բ���break��
		
		case 2: {
			d= Dday.TUESDAY;
			break;
		}
		
		case 3: {
			d= Dday.WEDNESDAY;
			break;
		}
		
		case 4: {
			d= Dday.THURSDAY;
			break;
		}
		
		case 5: {
			d= Dday.FRIDAY;
			break;
		}
		
		case 6: {
			d= Dday.SATURDAY;
			break;
		}
		
		case 7: {
			d= Dday.SUNDAY;
			break;			
		}
		}
		return d;
	}
}