package domain;

public class OwnerSalary extends StaffSalary{
	public static final String DEPT = "이사회";
	protected int share;//(sal + bonus) * 10
	public OwnerSalary(String name, int sal) {
		super(name, sal);
		//setDept(DEPT);
		super.dept = DEPT;
		//super.setBonus();
		//setShare();
		this.share = (super.sal + super.bonus)*10;
	}
	/*public void setShare() {
		this.share = (super.sal + super.bonus)*10;
	}*/
	public String toString() {
		return String.format("%s이사 | %d | \n", name.substring(0,1),share);
	}

}
