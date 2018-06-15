package domain;

public class StaffSalary extends Salary{
	public static final String DEPT = "정직원";
	protected int bonus;//기본급의 10프로
	public StaffSalary(String name, int sal) {
		super(name,sal);
		setDept(DEPT);
		//setBonus();
		this.bonus = super.sal * 10/100;
	}
	/*public void setBonus() {
		this.bonus = super.sal * 10/100;
	}*/
	@Override
	public String toString() {
		return String.format("%s직원 | %d | \n", name.substring(0,1),(super.sal+bonus));
	}
	
	
}
