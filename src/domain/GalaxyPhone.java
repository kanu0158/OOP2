package domain;

public class GalaxyPhone extends IPhone {
	public static final String BRAND = "삼성", KIND = "갤럭시노트";
	private String size;
	public void setSize() {
		this.size = "6인치";
	}
	@Override
	public void setData(String data) {
		super.data = data + "라고 카톡했다.";
	}
	
	public String getSize() {
		return size;
	}
	
	@Override
	public String toString() {
		super.setPortable(true);
		return  String.format("%s 에게 %s 번호로 %s %s %s제품 %s를 사용해서 %s",
				super.getName(),super.getPhoneNum(),super.getMove(),getSize() ,BRAND,KIND,super.getData());
	}
}
