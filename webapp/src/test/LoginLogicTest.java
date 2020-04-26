package test;

import model.Login;
import model.LoginLogic;

public class LoginLogicTest {
	public static void main(String[] args) {
		testExecute1();
		testExecute2();

	}

	public static void testExecute1() {
		Login login = new Login("minato", "1234");
		LoginLogic bo = new LoginLogic();
		boolean result = bo.execute(login);
		if(result) {
			System.out.println("logintest1成功");
		}else {
			System.out.println("logintest1失敗");

		}
	}
	public static void testExecute2() {
		Login login = new Login("minato", "12345");
		LoginLogic bo = new LoginLogic();
		boolean result = bo.execute(login);
		if(!result) {
			System.out.println("logintest2成功");
		}else {
			System.out.println("logintest2失敗");

		}
	}
}
