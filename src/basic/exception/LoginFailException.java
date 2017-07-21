package basic.exception;
//RuntimeException : 수행 중 에러실행
//ExceptionTest03에서 RuntimeException을 그대로 사용하지 않고, 이렇게 새롭게 만들어서도 가능
//실습//MemberVO type의 ID, PW가 잘못된 경우 이렇게 잘못된 로그인 시도가 있었다는 것을 log 파일로 저장.

import java.io.FileWriter;
import java.io.IOException;

import basic.exception.MemberVO;

public class LoginFailException extends RuntimeException {
	public LoginFailException(String error_msg, MemberVO memberVO) {
		super(error_msg);
		try {
			FileWriter fw = new FileWriter("log.txt", true); //FileWriter: 계속 이어서 기록한 파일 생성
			fw.write("Login Attempt Log");
			fw.write(memberVO.toString() + "\n");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
