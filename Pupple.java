package cn.hengyan.day29;


public class Pupple implements Comparable<Pupple>{
	private String name;
	private Integer id;
	private String sex;
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public int compareTo(Pupple o) {		
		return this.id-o.id;
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Pupple) {
			Pupple o=(Pupple)obj;
			if(o.id==this.id) {
				return true;
			}else {
				return false;
			}
		}
		return false;	
	}


	@Override
	public String toString() {
		return "Pupple [name=" + name + ", id=" + id + ", sex=" + sex + "]";
	}
	
	
}
