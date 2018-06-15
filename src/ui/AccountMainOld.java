package ui;

import javax.swing.JOptionPane;

import domain.*;

/**
 * 비트뱅크 기본통장 계좌번호: 123-456-789 이름: 홍길동 생성일: 2018년 6월10일 잔액: 10000원
 * (질문:입금받으시겠습니까?) 잔액: 20000원 --------------------- 비트뱅크 마이너스통장 계좌번호:
 * 123-456-789 이름: 홍길동 생성일: 2018년 6월10일 잔액: 10000원 (질문: 대출받으시겠습니까?) 잔액: -20000원
 **/
public class AccountMainOld {
	enum AccountButt {
		EXIT, ACCOUNT, MINUSAACCOUNT, DEPOSIT, WITHDRAW;
	}

	public static void main(String[] args) {
		AccountButt[] buttons = { AccountButt.EXIT, AccountButt.ACCOUNT, AccountButt.MINUSAACCOUNT, AccountButt.DEPOSIT,
				AccountButt.WITHDRAW };
		Account ac = null;
		while (true) {
			switch ((AccountButt) JOptionPane.showInputDialog(null, "MAIN PAGE", "SELECT MENU",
					JOptionPane.QUESTION_MESSAGE, null, buttons, null)) {
			case EXIT:
				return;
			case ACCOUNT:
				ac = new Account(JOptionPane.showInputDialog("이름"), JOptionPane.showInputDialog("user id"),
						JOptionPane.showInputDialog("비밀번호"));
				ac.setMoney(Integer.parseInt(JOptionPane.showInputDialog("초기입금액수")));
				JOptionPane.showMessageDialog(null, ac.toString());
				break;
			case MINUSAACCOUNT:
				ac = new MinusAccount(JOptionPane.showInputDialog("이름"), JOptionPane.showInputDialog("user id"),
						JOptionPane.showInputDialog("비밀번호"));
				ac.setMoney(Integer.parseInt(JOptionPane.showInputDialog("대출얼마")));
				((MinusAccount) ac).setLimit(Integer.parseInt(JOptionPane.showInputDialog("한도")));
				JOptionPane.showMessageDialog(null, ac.toString());
				break;
			case DEPOSIT:
				JOptionPane.showMessageDialog(null, "기존잔액:" + ac.getMoney());
				ac.setMoney(Integer.parseInt(JOptionPane.showInputDialog("얼마 입금하시겠습니까?")));
				JOptionPane.showMessageDialog(null, "잔액:" + ac.getMoney());
				break;
			case WITHDRAW:
				JOptionPane.showMessageDialog(null, "기존잔액:" + ac.getMoney());
				int money = 0;
				if (ac.getAccountType().equals("마이너스통장")) {
					if (((MinusAccount) ac).getLimit() != 0) {// 마이너스통장
						money = Integer.parseInt(JOptionPane.showInputDialog("출금액"));
						if (ac.getMoney() + money > ((MinusAccount) ac).getLimit()) {
							ac.setMoney(money);
						} else {
							JOptionPane.showMessageDialog(null, "한도초과");
						}
					}
				} else {
					money = Integer.parseInt(JOptionPane.showInputDialog("출금액"));
					if (money > ac.getMoney()) {
						JOptionPane.showMessageDialog(null, "잔액부족");
					} else {
						ac.setMoney((-1) *money);
					}
				}

				JOptionPane.showMessageDialog(null, "잔액:" + ac.getMoney());
				break;
			default:
				break;
			}
		}
	}
}
