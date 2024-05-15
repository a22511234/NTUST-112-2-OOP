package HRSystem;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CompanySystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberService memberService = new MemberService();
		Scanner scanner = new Scanner(System.in);
		String choice;

		while (true) {
			System.out.println("****歡迎進入公司系統****");
			System.out.println("1) 登入");
			System.out.println("2) 註冊");
			System.out.println("0) 離開");
			System.out.print("請輸入您的選擇 [1,2,0]：");
			choice = scanner.next();

			switch (choice) {
			case "1":
				System.out.print("請輸入工號 (部門-號碼)：");
				String employeeId = scanner.next();
				if (!checkEmployeeIdPattern(employeeId)) {
					System.out.println("工號格式錯誤");
					continue;
				}
				System.out.print("輸入密碼: ");
				String password = scanner.next();

				if (!memberService.login(employeeId, password)) {
					continue;
				}
				memberService.showProfile();
				memberService.logout();
				break;
			case "2":
				MemberService.register();
				break;
			case "0":
				return;
			default:
				System.out.println("無此選項");
			}
		}
	}

	public static boolean checkEmployeeIdPattern(String empId) {
		return Pattern.compile("^[A-Z]{2}-\\d{6}$").matcher(empId).find();
	}
}
