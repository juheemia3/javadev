package basic.exception;
//외부 lib(common-codec) 가져오기. 비밀변호를 변환하는 프로그램! 은행권에서 사용한다고
//실습1//main 구문안에 밑에 구문 넣으면 변환된 코드 리턴해줌!
/*String pw = "12345678"; 
System.out.println(DigestUtils.sha512Hex(pw));*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//Dynamic version: import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;
import org.apache.commons.codec.digest.DigestUtils;

public class ExceptionTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ID : "); String user_id = sc.nextLine();
		System.out.println("PW : "); String user_pw = sc.nextLine();
		MemberVO userInfo = new MemberVO();
		userInfo.setUser_id(user_id);
		userInfo.setUser_pw(user_pw);

		try {
			userInfo = login(userInfo); //login method: ID, PW가 맞으면 이름을 넣어서 리턴(redline->create method)
			System.out.println("Welcome " + userInfo.getUser_name());
		} catch (Exception e) {
			//e.printStackTrace();//에러확인
			System.out.println(e.getMessage());//Exception이라는 기본 class의 method에 getMessagedl 있나보다..! 
		}
		

	}

	private static MemberVO login(MemberVO userInfo) throws Exception { //throws를 써주는 의미?
		//실습3//JDBC
		Connection cn = null;
		PreparedStatement st = null;
		//실습4//Statement st = null;
		ResultSet rs = null;
		
		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT user_name ");
		sql.append(" FROM t_mem ");
		sql.append(" WHERE user_id =?"); //실습4// parameter query, '?'는 나중에 파라미터가 들어갈 자리로 명시한 후, 오라클 서버로 전송
		//Dynamic version: sql.append(" WHERE user_id ='"+userInfo.getUser_id()+"'");
		sql.append(" and   user_pw =?");
		//Dynamic version: sql.append(" and   user_pw ='"+userInfo.getUser_pw()+"'");
		try {
			Class.forName("oracle.jdbc.OracleDriver");// oracle driver가 존재하는지 확인. oracle.jdbc.OracleDriver는 Driver class name 
			cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "bigdata", "bigdata");
			st = cn.prepareStatement(sql.toString());
			st.setString(1, userInfo.getUser_id());
			st.setString(2, userInfo.getUser_pw());
			rs = st.executeQuery();
			//Dynamic version: st = cn.createStatement();
			//Dynamic version: rs = st.executeQuery();
			//Dynamic version: st = cn.createStatement();
			//Dynamic version: rs = st.executeQuery(sql.toString());
			if (rs.next()) {
				userInfo.setUser_name(rs.getString("user_name"));
				return userInfo;
			} else {
				throw new LoginFailException("Your ID or PW doesn't match", userInfo);
			}
		} /*catch(Exception e) {
			이 상황에서는 if/else문에서 미리 에러를 다 잡아내기 때문에 필요 없음.
		}*/ finally {// 사용했던 자원 반납: ★역순으로
			if (rs != null) try {rs.close();} catch(Exception e){}
			if (st != null) try {st.close();} catch(Exception e){}
			if (cn != null) try {cn.close();} catch(Exception e){}
		}
		
		/*if (userInfo.getUser_id().equals("multi") && 
			userInfo.getUser_pw().equals("fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff1226583e88e0996293f16bc009c652826e0fc5c706695a03cddce372f139eff4d13959da6f1f5d3eabe"))
		{
			userInfo.setUser_name("Juhee");
			return userInfo;
		} else {
			//실습1//throw new RuntimeException("Your ID or PW doesn't match");
			throw new LoginFailException("Login Failed", userInfo);//실습2//
		}*/
	}
}
