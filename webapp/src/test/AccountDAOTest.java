package test;

import dao.AccountDAO;
import model.Account;
import model.Login;

public class AccountDAOTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		testFindByLogin1();
		testFindByLogin2();
	}

	public static void testFindByLogin1() {
		Login login = new Login("minato", "1234");
		AccountDAO dao = new AccountDAO();
		Account result = dao.findbyLogin(login);
		if(result != null &&
				result.getUserId().equals("minato") &&
				result.getPass().equals("1234") &&
				result.getMail().equals("minato@sukkiri.com") &&
				result.getName().equals("湊 雄輔") &&
				result.getAge() == 23) {
			System.out.println("test1成功");


		}else{
			System.out.println("test1失敗");

		}
	}
	public static void testFindByLogin2() {
		Login login = new Login("minato", "12345");
		AccountDAO dao = new AccountDAO();
		Account result = dao.findbyLogin(login);
		if(result == null) {
			System.out.println("test2成功");

		}else{
			System.out.println("test2失敗");

		}
	}



}
