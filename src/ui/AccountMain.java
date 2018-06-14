package ui;

import javax.swing.JOptionPane;

import domain.*;

/**
 * 비트뱅크 
 * 기본통장 
 * 계좌번호: 123-456-789 
 * 이름: 홍길동 
 * 생성일: 2018년 6월10일 
 * 잔액: 10000원 
 * (질문:입금받으시겠습니까?) 
 * 잔액: 20000원
 *  --------------------- 
 * 비트뱅크 
 * 마이너스통장 
 * 계좌번호: 123-456-789
 * 이름: 홍길동 
 * 생성일: 2018년 6월10일 
 * 잔액: 10000원 
 * (질문: 대출받으시겠습니까?) 
 * 잔액: -20000원
 **/
public class AccountMain {
	enum AccountButt {
		EXIT, ACCOUNT, MINUSAACCOUNT;
	}

	public static void main(String[] args) {
		AccountButt[] buttons = { AccountButt.EXIT, AccountButt.ACCOUNT, AccountButt.MINUSAACCOUNT };
		Account ac = null;
		MinusAccount ma = null;
		switch ((AccountButt) JOptionPane.showInputDialog(null, "MAIN PAGE", "SELECT MENU",
				JOptionPane.QUESTION_MESSAGE, null, buttons, null)) {
		case EXIT:
			return;
		case ACCOUNT:
			ac = new Account();
			ac.setName(JOptionPane.showInputDialog("이름"));
			ac.setUId(JOptionPane.showInputDialog("user id"));
			ac.setPass(JOptionPane.showInputDialog("비밀번호"));
			ac.setMoney(Integer.parseInt(JOptionPane.showInputDialog("초기입금액수")));
			JOptionPane.showMessageDialog(null, ac.toString());
			break;
		case MINUSAACCOUNT:
			ma = new MinusAccount();
			ma.setName(JOptionPane.showInputDialog("이름"));
			ma.setUId(JOptionPane.showInputDialog("user id"));
			ma.setPass(JOptionPane.showInputDialog("비밀번호"));
			ma.setMoney(Integer.parseInt(JOptionPane.showInputDialog("초기입금액수")));
			JOptionPane.showMessageDialog(null,ma.toString());
			break;
		default:
			break;
		}
	}

}
