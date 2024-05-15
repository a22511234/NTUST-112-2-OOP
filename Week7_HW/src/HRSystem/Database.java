package HRSystem;

public class Database {
	static GeneralStaff[] generalStaff = new GeneralStaff[100];
	static ManagerStaff[] managerStaff = new ManagerStaff[100];

	public static void addgeneralStaff(GeneralStaff staff,int index) {
		generalStaff[index]=staff;
	}

	public static void addmanagerStaff(ManagerStaff staff,int index) {
		managerStaff[index]=staff;
	}

	public static GeneralStaff[] getGeneralStaff() {
		return generalStaff;
	}


	public static ManagerStaff[] getManagerStaff() {
		return managerStaff;
	}

}
