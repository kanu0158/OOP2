package domain;

public class Phone {
	private String name,phoneNum,call;//보안이 필요하니 private으로 선언 
	public static final String BRAND = "삼성", KIND = "집전화기"; // 이게 공유하는 값이다. 상수화시킴(대문자)
	//상수는 오픈해야하니 public, 바꾸면안되니 final을 붙임
	public void setName(String name) {
		this.name = name;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public void setCall(String call) {
		this.call = call;
	}
	public String getName() {
		return name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public String getCall() {
		return call;
	}
	public String toString() {
		return String.format("%s 에게 %s 번호로 %s 제품 %s를 사용해서 %s 라고 통화했다",name,phoneNum,BRAND,KIND,call);
	}
}
