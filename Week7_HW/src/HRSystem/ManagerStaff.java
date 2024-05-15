package HRSystem;

public class ManagerStaff extends GeneralStaff {

	public ManagerStaff(String name, String password, String department, String employeeId) {
		super(name, password, department, employeeId);
	}



	public void listMembers() {
		System.out.println(super.getDepartment()+"部門名單：");
		GeneralStaff[] generalStaff = Database.getGeneralStaff();
		ManagerStaff[] managerStaff = Database.getManagerStaff();
		for (int i = 0; i < 100; i++) {
			if (generalStaff[i] != null) {
				if (generalStaff[i].getDepartment().equals(super.getDepartment())) {
					System.out.println("一般員工：" + generalStaff[i].getName());
					
				}
			}
			if (managerStaff[i] != null) {
				if (managerStaff[i].getDepartment().equals(super.getDepartment())) {
					System.out.println("主管：" + managerStaff[i].getName());
					
				}
			}
		}
		
	}

}
