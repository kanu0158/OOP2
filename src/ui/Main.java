package ui;

import javax.swing.JOptionPane;
import domain.BMI;
import domain.Grade;
import domain.Salary;
import domain.Lotto;

enum Butt {
	EXIT, INPUT_BMI, OUTPUT_BMI, INPUT_GRADE, OUTPUT_GRADE, INPUT_SALARY, OUTPUT_SALARY, INPUT_LOTTO, OUTPUT_LOTTO;
}

public class Main {
	public static void main(String[] args) {
		Butt[] buttons = { Butt.EXIT, Butt.INPUT_BMI, Butt.OUTPUT_BMI, Butt.INPUT_GRADE, Butt.OUTPUT_GRADE,
				Butt.INPUT_SALARY, Butt.OUTPUT_SALARY, Butt.INPUT_LOTTO, Butt.OUTPUT_LOTTO };
		BMI[] bmi = new BMI[3];
		BMI bmiTmp = null;
		Grade[] grade = new Grade[3];
		Grade gradeTmp = null;
		Salary[] salary = new Salary[3];
		Salary salaryTemp = null;
		Lotto[] lotto = new Lotto[5];
		Lotto lottoTmp = null;
		int bmiCount = 0;
		int gradeCount = 0;
		int salaryCount = 0;
		int lottoCount = 0;
		while (true) {
			switch ((Butt) JOptionPane.showInputDialog(null, "MAIN PAGE", "SELECT MENU", JOptionPane.QUESTION_MESSAGE,
					null, buttons, null)) {
			case EXIT:
				return;
			case INPUT_BMI:
				bmiTmp = new BMI();
				bmiTmp.setName(JOptionPane.showInputDialog("이름"));
				bmiTmp.setHeight(Double.parseDouble(JOptionPane.showInputDialog("키")));
				bmiTmp.setWeight(Double.parseDouble(JOptionPane.showInputDialog("무게")));
				bmiTmp.setResult();
				bmi[bmiCount++] = bmiTmp;
				break;
			case OUTPUT_BMI:
				String result = "";
				for (int i = 0; i < bmiCount; i++) {
					result += bmi[i].toString() + "\n";
				}
				JOptionPane.showMessageDialog(null, result);
				break;
			case INPUT_GRADE:
				gradeTmp = new Grade();
				gradeTmp.setName(JOptionPane.showInputDialog("이름"));
				gradeTmp.setKor(Integer.parseInt(JOptionPane.showInputDialog("국어점수")));
				gradeTmp.setEng(Integer.parseInt(JOptionPane.showInputDialog("영어점수")));
				gradeTmp.setMath(Integer.parseInt(JOptionPane.showInputDialog("수학점수")));
				gradeTmp.setTotal();
				gradeTmp.setAvg();
				gradeTmp.setGrade();
				grade[gradeCount++] = gradeTmp;
				break;
			case OUTPUT_GRADE:
				result = "이름 | 국어 | 영어 | 수학 | 총합 | 평균 | 등급 \n";
				for (int i = 0; i < gradeCount; i++) {
					result += grade[i].toString() + "\n";
				}
				JOptionPane.showMessageDialog(null, result);
				break;
			case INPUT_SALARY:
				salaryTemp = new Salary();
				salaryTemp.setDept(JOptionPane.showInputDialog("부서"));
				salaryTemp.setName(JOptionPane.showInputDialog("이름"));
				salaryTemp.setSal(Integer.parseInt(JOptionPane.showInputDialog("본봉")));
				salaryTemp.setBonus(Integer.parseInt(JOptionPane.showInputDialog("수당")));
				salaryTemp.setSum();
				salary[salaryCount++] = salaryTemp;
				break;
			case OUTPUT_SALARY:
				result = "";
				for (int i = 0; i < salaryCount; i++) {
					result += salary[i].toString();
				}
				JOptionPane.showMessageDialog(null, result);
				break;
			case INPUT_LOTTO:
				lottoTmp = new Lotto();
				lottoTmp.setCount(Integer.parseInt(JOptionPane.showInputDialog("얼마")));
				lottoCount = lottoTmp.getCount();
				break;
			case OUTPUT_LOTTO:
				result = "";
				for (int i = 0; i < lottoCount; i++) {
					lottoTmp = new Lotto();
					lottoTmp.setBall();
					lotto[i] = lottoTmp;
				}
				for (int i = 0; i < lottoCount; i++) {
					result += lotto[i].toString();
				}
				JOptionPane.showMessageDialog(null, result);
				break;
			default:
				break;
			}
		}
	}
}
