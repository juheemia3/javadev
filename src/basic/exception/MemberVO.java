package basic.exception;

import java.io.Serializable;

import org.apache.commons.codec.digest.DigestUtils;

public class MemberVO implements Serializable {
	private String user_id;
	private String user_pw;
	private String user_name;
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_pw() {
		return user_pw;
	}
	public void setUser_pw(String user_pw) {
		//this.user_pw = user_pw; //입력된 비밀번호를 그냥 member class저장
		this.user_pw = DigestUtils.sha512Hex(user_pw);//입력된 비밀번호를 변환하여 저장
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	@Override // String이라는 상위폴더가 기본으로 상속되나..?
	public String toString() {
		return "MemberVO [user_id=" + user_id + ", user_pw=" + user_pw + ", user_name=" + user_name + "]";
	}
}
