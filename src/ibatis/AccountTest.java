package ibatis;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.ibatis.sqlmap.client.SqlMapClient;

public class AccountTest {
	public static void main(String[] args) {
		// insert query
		Scanner sc = new Scanner(System.in);

		while (true) {
			try {
				int menu = showMenu(sc);

				switch (menu) {
				case 1:
					// System.out.println("insert member information");
					insertAccount(sc);
					break;
				case 2:
					// System.out.println("check member list");
					listAccount(sc);
					break;
				case 3:
					// 상세보기
					// System.out.println("check member list");
					detailAccount(sc);
					break;
				case 4:
					// 수정
					// System.out.println("check member list");
					updateAccount(sc);
					break;
				case 5:
					//삭제
					deleteAccount(sc);
					break;
				case 6:
					System.out.println("turn off the program");
					System.exit(1);
				default:
					System.out.println("no menu for that number");
					break;
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println("worng menu. please check the manu again");
				e.printStackTrace();
			}
		}
	}

	private static void deleteAccount(Scanner sc) throws SQLException {
		System.out.println("Type the member id > ");
		int id = Integer.parseInt(sc.nextLine());

		SqlMapClient sqlMap = QueryHandeler.getInstance();
		int result = sqlMap.delete("deleteAccount", id);
		if (result == 1) {
			System.out.println("member [id] : " + id + " is deleted");
		} else {
			System.out.println("failed");
		}
		
	}

	private static void updateAccount(Scanner sc) {
		System.out.println("Type the member id > ");
		int id = Integer.parseInt(sc.nextLine());

		SqlMapClient sqlMap = QueryHandeler.getInstance();
		try {
			AccountVO accountVO = (AccountVO) sqlMap.queryForObject("detailAccount", id);
			if (accountVO == null) {
				System.out.println("There is no such member");
			} else {
				System.out.println("Member ID : [" + accountVO.getId() + "]");
				System.out.println("old : " + accountVO.getFirstName());
				System.out.println("new : ");
				String firstName = sc.nextLine();
				
				System.out.println("old : " + accountVO.getLastName());
				System.out.println("new : ");
				String lastName = sc.nextLine();
				
				System.out.println("old : " + accountVO.getEmailAddress());
				System.out.println("new : ");
				String emailAddress = sc.nextLine();
				
				AccountVO up_accountVO = new AccountVO();
				up_accountVO.setId(id);
				up_accountVO.setFirstName(firstName);
				up_accountVO.setLastName(lastName);
				up_accountVO.setEmailAddress(emailAddress);
				
				int result = sqlMap.update("updateAccount", up_accountVO);
				if(result == 1) {
					System.out.println("update completed");
				} else {
					System.out.println("error : cannot complete your request");
				}
				//up_accountVO: 수정할 내용이 담겨있는 VO
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void detailAccount(Scanner sc) {
		System.out.println("Type the member id > ");
		int id = Integer.parseInt(sc.nextLine());

		SqlMapClient sqlMap = QueryHandeler.getInstance();
		try {
			AccountVO accountVO = (AccountVO) sqlMap.queryForObject("detailAccount", id);
			if (accountVO == null) {
				System.out.println("worng id");
			} else {
				System.out.println("member : [" + id + "]");
				System.out.println(accountVO + "\n");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void listAccount(Scanner sc) throws SQLException {
		SqlMapClient sqlMap = QueryHandeler.getInstance();

		List<AccountVO> list = sqlMap.queryForList("listAccount");

		for (AccountVO accountVO : list) {
			System.out.println(accountVO);
		}
	}

	private static void insertAccount(Scanner sc) throws SQLException {
		AccountVO accountVO = new AccountVO();

		System.out.println("\n1. Insert member");

		System.out.println("FirstName : ");
		accountVO.setFirstName(sc.nextLine());

		System.out.println("LastName : ");
		accountVO.setLastName(sc.nextLine());

		System.out.println("Email address : ");
		accountVO.setEmailAddress(sc.nextLine());
		SqlMapClient sqlMap = QueryHandeler.getInstance();
		sqlMap.insert("insertAccount", accountVO);
		System.out.println(accountVO.getLastName() + " is now our member");

	}

	private static int showMenu(Scanner sc) throws Exception {
		System.out.println();
		System.out.println("----------- menu ----------");
		System.out.println("1. Insert member          ");
		System.out.println("2. Member list            ");
		System.out.println("3. Member information     ");
		System.out.println("4. Edit member information");
		System.out.println("5. Delete member          ");
		System.out.println("6. Quit                   ");
		System.out.println("--------------------------");
		System.out.println("type menu> ");
		return Integer.parseInt(sc.nextLine().trim());
	}
}
