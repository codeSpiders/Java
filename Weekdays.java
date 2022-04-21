package cn.hengyan.day22;

public enum Weekdays {//枚举的名字，不能和类相同。
	//枚举类型只存在于代码这个阶段，对应Java虚拟机来说，没有枚举这个概念。枚举在虚拟机看来，就是类，
	//编译器将枚举转变成了类，所有枚举类都继承了Java.lang.Enum这个类。
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
	public static int month=1;
	
}

enum Dday{//自定义枚举，上面那个是默认的
	MONDAY("星期一",1),TUESDAY("星期二",2),WEDNESDAY("星期三",3),
	THURSDAY("星期四",4),FRIDAY("星期五",5),SATURDAY("星期六",6),SUNDAY("星期日",7);
	private String desc;
	private int index;
	private Dday(String desc,int index) {
		//私有化枚举类型的构造器，外部类无法实例化对象(防止被外部调用)
		this.desc = desc;
		this.index =index;		
	}
	
	public String getDesc() {
		return desc;
	}
	
	public int getIndex() {
		return index;
	}
	
	//定义静态方法，通过index来获取枚举对象
	public static Dday getDdayByIndex(int index) {
		Dday d=null;
		switch (index) {
		case 1: {
			d= Dday.MONDAY;	
			break;
		}//注意，有了return，可以不用break。
		
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