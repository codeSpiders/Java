package cn.hengyan.day22;

public class EnumTest {
	public static void main(String[] args) {
		int day1=Weekday.MONDAY;
		 day1=Weekday.TUESDAY;		
		int day2 = Weekday.month;
		Weekdays day3 = Weekdays.FRIDAY;
		 day3 = Weekdays.TUESDAY;//ö�ٶ���ֵ�󣬿����ٴθı�
		//Weekdays day4 = Weekdays.month;//��ö�����͸�ֵ��ö�ٶ��󣬱�����
		 
		 //����ö������
		 Weekdays[] d = Weekdays.values();//��̬�ģ�ֱ�ӵ���
		 //values��������ȡö�����е����б���������Ϊ���鷵��
		 for(Weekdays d1:d) {
			 System.out.println(d1);
		 }
		 
		 Weekdays mon = Weekdays.valueOf("MONDAY");//mon�Ƕ���
		 //valueof(String name),��Enum���е�Valueof�������ƣ��������ƻ�ȡö�ٱ�����ֻ�Ǹ���࣬
		 //ֻ��Ҫ����һ���������������ϣ����ǵ�����Enum���е�Valueof������
		 Weekdays mon1=Weekdays.valueOf(Weekdays.class,"MONDAY");//Enum���е�Valueof����
		System.out.println(mon);//�����������MONDAY���������������ַ���
		//ö����ĸ���Enum������ordinal������������ȡ��ö�ٶ��������ֵ
		System.out.println(mon.ordinal());
		Weekdays tus= Weekdays.valueOf("TUESDAY");
		//ö����ĸ���Enum������compareTo����������ֵΪǰ��ö�ٶ����������ȥ����ö�ٶ��������
		System.out.println(mon.compareTo(tus));
	}
}
