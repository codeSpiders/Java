package cn.hengyan.day29;

import java.util.Comparator;

public class PuppleComparator implements Comparator<Pupple>{

	@Override
	public int compare(Pupple o1, Pupple o2) {
		return o1.getId()-o2.getId();
	}
	
}
