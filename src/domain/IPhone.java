package domain;

public class IPhone extends CellPhone{
	public static final String BRAND = "애플", KIND = "아이폰";
	protected String data;
	public void setData(String data) {
		this.data = data + "라고 문자를 전송했다.";
	}
	public String getData() {
		return data;
	}
	public String toString() {
		super.setPortable(true);
		return String.format("%s 에게 %s 번호로 %s %s제품 %s를 사용해서 %s",
				super.getName(),super.getPhoneNum(),super.getMove(),BRAND,KIND,getData());
	}
}
