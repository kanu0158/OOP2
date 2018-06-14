package domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
	public final static String BANK_NAME="비트뱅크";
	public final static String ACCOUNT_TYPE="기본통장";
	public final static String WITHDRAW_SUCCESS="출금성공";
	public final static String WITHDRAW_FAIL="잔액부족";
	public final static String DEPOSIT_SUCCESS="입금성공";
	public final static String DEPOSIT_FAIL="적합한 입력값이 아님";
	protected int money;// 잔액, 계좌 랜덤
	protected String name,accountNo,uid,pass,accountType,createDate;//uid는 아이디 , createDate는 계좌생성일 블로그에서 오늘날짜 뽑는 로직 가져다쓰세요.
	// 통장 123-345-678 의 형태가 되도록 코딩 math.random()이용해서
	public void setMoney(int money) {
		this.money = money;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAccountNo() {
		String accountNo = "";
		String op = "-";
		for(int i=0;i<3;i++) {
			if(i==2) {
				op = "";
			}
			accountNo += String.format("%03d",(int)(Math.random()*1000)) + op;
		}
		this.accountNo = accountNo;
	}
	public void setUId(String uid) {
		this.uid = uid;
	}
	public void setPass(String pass) {
		this.pass = pass;
		setAccountType();
		setAccountNo();
		setCreateDate();
		
	}
	public void setAccountType() {
		this.accountType = ACCOUNT_TYPE;
	}
	public void setCreateDate() {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		createDate = sdf.format(now);
	}
	public int getMoney() {
		return money;
	}
	public String getName() {
		return name;
	}
	public String getAccountType() {
		return accountType;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public String getCreateDate() {
		return createDate;
	}
	public String toString() {
		return String.format("%s\n%s\n계좌번호: %s\n이름: %s\n생성일: %s\n잔액: %d\n",BANK_NAME, getAccountType(),getAccountNo(),getName(),getCreateDate(),getMoney());
	}
}
