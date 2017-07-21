package api;

public class FriendVO {
	private String phone;
	private int age;
	private int gender;
		
	public FriendVO(String phone, int age, int gender) {
		super();
		this.phone = phone;
		this.age = age;
		this.gender = gender;		
	}// 전화번호, 나이, 성별을 생성자에 바로 집어넣을 수 있도록 생성함.
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "FriendVO [phone=" + phone + ", age=" + age + ", gender=" + gender + "]";
	}	
	
}
