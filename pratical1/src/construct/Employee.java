package construct;

public class Employee {
	private String employeeName;
	private int employeeId;
	private String  employeeCity;
	
	public Employee(){
		System.out.println("Default Constructor...");
	}
	public Employee(String employeeName,int employeeId,String employeeCity) {
		this();
		employeeName=this.employeeName;
		employeeId=this.employeeId;
		employeeCity=this.employeeCity;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeCity() {
		return employeeCity;
	}
	public void setEmployeeCity(String employeeCity) {
		this.employeeCity = employeeCity;
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", employeeCity="
				+ employeeCity + "]";
	}
	
	
	
	
}
