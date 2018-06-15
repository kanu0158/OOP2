package domain;

public class MinusAccount extends Account {
	public final static String ACCOUNT_TYPE="마이너스통장";
	public int limit; // 대출한도
	public MinusAccount(String name, String uid, String pass) {
		super(name, uid, pass);
		super.setAccountType(ACCOUNT_TYPE);
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getLimit() {
		return limit;
	}
}
