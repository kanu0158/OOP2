package domain;

public class Salary {
	public static final String DEPT = "인턴쉽";
	protected String dept,name;
	protected int sal;
	public Salary(String name, int sal) {
		setDept(DEPT);
		this.name = name;
		this.sal = sal;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String toString() {
		return String.format("%s인턴 | %d | \n", name.substring(0,1),sal);
	}

}
