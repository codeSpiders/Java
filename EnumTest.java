package cn.hengyan.day22;

public class EnumTest {
	public static void main(String[] args) {
		int day1=Weekday.MONDAY;
		 day1=Weekday.TUESDAY;		
		int day2 = Weekday.month;
		Weekdays day3 = Weekdays.FRIDAY;
		 day3 = Weekdays.TUESDAY;//枚举对象赋值后，可以再次改变
		//Weekdays day4 = Weekdays.month;//非枚举类型赋值给枚举对象，报错了
		 
		 //遍历枚举类型
		 Weekdays[] d = Weekdays.values();//静态的，直接调用
		 //values方法，获取枚举类中的所有变量，并作为数组返回
		 for(Weekdays d1:d) {
			 System.out.println(d1);
		 }
		 
		 Weekdays mon = Weekdays.valueOf("MONDAY");//mon是对象
		 //valueof(String name),与Enum类中的Valueof方法类似，根据名称获取枚举变量，只是更简洁，
		 //只需要传递一个参数。但本质上，都是调用了Enum类中的Valueof方法。
		 Weekdays mon1=Weekdays.valueOf(Weekdays.class,"MONDAY");//Enum类中的Valueof方法
		System.out.println(mon);//输出的内容是MONDAY的文字描述，是字符串
		//枚举类的父类Enum定义了ordinal方法，作用是取出枚举对象的索引值
		System.out.println(mon.ordinal());
		Weekdays tus= Weekdays.valueOf("TUESDAY");
		//枚举类的父类Enum定义了compareTo方法，返回值为前面枚举对象的索引减去后面枚举对象的索引
		System.out.println(mon.compareTo(tus));
	}
}
