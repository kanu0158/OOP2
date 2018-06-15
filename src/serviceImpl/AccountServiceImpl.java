package serviceImpl;
import javax.swing.JOptionPane;

import domain.Account;
import service.AccountService; //비즈니스 로직
public class AccountServiceImpl implements AccountService{
	Account[] list = new Account[3]; // 주소값만 가져서 크기가 아무리 커져도 실제 크기는 주소값크기(4바이트)정도이다 
	
	public void addList(Account account) {
		list[0] = account;
	}
	public Account[] list(){
		return list;
	}
	@Override
	public Account createAccount(String name, String uid, String pass) {
		return new Account(name,uid,pass);
	}
	
	@Override
	public int deposit(int restMoney, String money) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int withdraw(int restMoney, String money) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String createAccountNum(String random) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createRandom(int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String showResult() {
		// TODO Auto-generated method stub
		return null;
	}



}
