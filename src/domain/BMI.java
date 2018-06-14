package domain;

public class BMI {
	String name,result;
	double height,weight;
	public void setName(String name) {
		this.name = name;
	}
	public void setResult() {
		double bmi = weight / ((height/100) * (height/100));
		if (bmi >= 35) {
			result = "3단계비만";
		} else if (bmi >= 30 && bmi < 35) {
			result = "2단계비만";
		} else if (bmi >= 25 && bmi < 30) {
			result = "1단계비만";
		} else if (bmi >= 23 && bmi < 25) {
			result = "비만전단계";
		} else if (bmi >= 18.5 && bmi < 23) {
			result = "정상";
		} else {
			result = "저체중";
		}
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public String getResult() {
		return result;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public String toString() {
		return String.format("%s | %f | %f | %s\n", name,height,weight,result);
	}
}
