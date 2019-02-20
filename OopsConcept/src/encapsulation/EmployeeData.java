package encapsulation;

public class EmployeeData {
	//1. declare private variables 
	private int ssn;
	private String employee;
	private int emp_age;
	
	//generate  getter and Setter from the source
	

	public static void main(String[] args) {
		EmployeeData emp = new EmployeeData();
		emp.setEmployee("Victor");// we use the .set() method 
		emp.setSsn(12345678);
		emp.setEmp_age(28);
		
		
		System.out.println("The employee name is :- "+emp.getEmployee());
		System.out.println("The employee age is :- "+ emp.getEmp_age());
		System.out.println("The employee ssn is :- " +emp.getSsn());
		
	}
// the property of getter and setter is to get the value ,return it and then set the value 
	public int getSsn() {
		return ssn;// this will return the ssn number
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getEmployee() {
		return employee;// get employee will return the name 
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}

	public int getEmp_age() {
		return emp_age;
	}

	public void setEmp_age(int emp_age) {
		this.emp_age = emp_age;
	}

}
