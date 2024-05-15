package HRSystem;

import java.util.Scanner;

public class MemberService {
	private GeneralStaff staff;
	static int staffCount = 0;
	static int managerCount = 0;

	public MemberService() {
	}

	GeneralStaff findStaff(String empId) {
		GeneralStaff[] generalStaff = Database.getGeneralStaff();
		ManagerStaff[] managerStaff = Database.getManagerStaff();
		for (int i = 0; i < 100; i++) {
			if (generalStaff[i] != null) {
				if (generalStaff[i].getEmployeeId().equals(empId)) {
					staff = generalStaff[i];
					break;
				}
			}
			if (managerStaff[i] != null) {
				if (managerStaff[i].getEmployeeId().equals(empId)) {
					staff = managerStaff[i];
					break;
				}
			}
		}
		return staff;

	}

	public boolean login(String empId, String pwd) {
		staff = findStaff(empId);
		if (staff == null) {
			System.out.println("查無此工號");
			return false;
		}
		if (!staff.verify(pwd)) {
			System.out.println("密碼錯誤");
			return false;
		}
		return true;
	}

	public void logout() {
		this.staff = null;
	}

	public void showProfile() {
		System.out.println("姓名：" + staff.getName());
		System.out.println("部門：" + staff.getDepartment());
		System.out.println("工號：" + staff.getEmployeeId());
		if (staff.getEmployeeId().charAt(3) == '1') {
			ManagerStaff manager = (ManagerStaff) staff;
			manager.listMembers();
		}
	}

	public static void register() {
		// 輸入區
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入姓名：");
		String name = scanner.next();
		System.out.print("請設定密碼：");
		String password = scanner.next();
		// 選擇部門
		System.out.println("1) 資訊部門");
		System.out.println("2) 人力資源");
		System.out.println("3) 行銷部門");
		
		String department = null;
		String employeeId = null;
		int departmentCode;
		do {
			System.out.print("請選擇部門：(輸入數字)");
			departmentCode = scanner.nextInt();
		} while (!isNumberInRange(departmentCode, 1, 3));

		switch (departmentCode) {
		case 1:
			department = "IT";
			employeeId = "IT-";
			break;
		case 2:
			department = "HR";
			employeeId = "HR-";
			break;
		case 3:
			department = "MA";
			employeeId = "MA-";
			break;
		}
		System.out.print("是否為管理人員 [Y/n]? ");
		String isManagerStr = scanner.next();
		GeneralStaff staff;
		if (isManagerStr.toLowerCase().equals("y")) {
			managerCount++;
			employeeId += String.format("1%05d", managerCount);
			staff = new ManagerStaff(name, password, department, employeeId);
			Database.addmanagerStaff((ManagerStaff) staff, managerCount - 1);
		} else {
			staffCount++;
			employeeId += String.format("0%05d", staffCount);
			staff = new GeneralStaff(name, password, department, employeeId);
			Database.addgeneralStaff(staff, staffCount - 1);
		}
		System.out.println("註冊成功！");
	}

	private static boolean isNumberInRange(int number, int min, int max) {
		return number >= min && number <= max;
	}
}
