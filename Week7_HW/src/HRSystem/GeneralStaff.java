package HRSystem;

public class GeneralStaff {
	private String name;
    private String password;
    private String department;
    private String employeeId;

    public GeneralStaff(String name, String password, String department ,String employeeId) {
        this.name = name;
        this.password = password;
        this.department = department;
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }
    public String getEmployeeId() {
        return employeeId;
    }
    public boolean verify(String pwd) {
        return password.equals(pwd);
    }
    public String getName() { return name; }
}
