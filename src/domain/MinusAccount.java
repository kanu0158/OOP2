package domain;

public class MinusAccount extends Account {
	public final static String ACCOUNT_TYPE="마이너스통장";
	public int debt; // 대출금 (대출하는기능) 대출할건지 묻고
	public MinusAccount() {
		setAccountType(ACCOUNT_TYPE);
		setAccountNo();
		setCreateDate();
	}
}
