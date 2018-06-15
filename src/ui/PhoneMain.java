package ui;

import javax.swing.JOptionPane;
import domain.*;

/**
 * 0.통화종료 1.집전화기
 */
enum PhoneButt {
	EXIT, TELEPHONE, CELLPHONE,IPHONE, GALAXYPHONE;
}
public class PhoneMain {
	public static void main(String[] args) {
		PhoneButt[] buttons = {PhoneButt.EXIT,PhoneButt.TELEPHONE,PhoneButt.CELLPHONE,PhoneButt.IPHONE,PhoneButt.GALAXYPHONE};
		Phone phone = null;
		while (true) {
			switch ((PhoneButt) JOptionPane.showInputDialog(null, "MAIN PAGE", "SELECT MENU", JOptionPane.QUESTION_MESSAGE,
					null, buttons, null)) {
			case EXIT:return;
			case TELEPHONE:
				phone = new Phone();
				//phone.name = JOptionPane.showInputDialog("이름");//이런식의 접근은 정보은닉을 할 수 없으니 지양하자
				phone.setName(JOptionPane.showInputDialog("이름"));
				phone.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				phone.setCall(JOptionPane.showInputDialog("통화내용"));
				JOptionPane.showMessageDialog(null, phone.toString());
				break;
			case CELLPHONE:
				phone = new CellPhone();
				phone.setName(JOptionPane.showInputDialog("이름"));
				phone.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				phone.setCall(JOptionPane.showInputDialog("통화내용"));
				JOptionPane.showMessageDialog(null, phone.toString());
				break;
			case IPHONE:
				phone = new IPhone();
				phone.setName(JOptionPane.showInputDialog("이름"));
				phone.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				((IPhone) phone).setData(JOptionPane.showInputDialog("통화내용"));
				JOptionPane.showMessageDialog(null, phone.toString());
				break;
			case GALAXYPHONE:
				phone = new GalaxyPhone();
				phone.setName(JOptionPane.showInputDialog("이름"));
				phone.setPhoneNum(JOptionPane.showInputDialog("전화번호"));
				((GalaxyPhone) phone).setSize();
				((IPhone) phone).setData(JOptionPane.showInputDialog("통화내용"));
				JOptionPane.showMessageDialog(null, phone.toString());
				break;
			default:
				break;
			}
		}
	}

}
