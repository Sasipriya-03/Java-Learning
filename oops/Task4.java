package oops;
class Employee{
	private String name;
	private int id;
	private double salary;
	public String setName;
	public int setId;
	public int setSalary;
	
	public void setName(String name) {
		this.name=name;
		
	}
	public void setId(int id) {
		this.id=id;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public double getSalary() {
		return salary;
	}
	
}

public class Task4 {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setName("Sasipriya");
		emp.setId(101);
		emp.setSalary(50000);
		System.out.println("Employee Name:"+emp.getName());
		System.out.println("Employee ID:"+emp.getId());
		System.out.println("Employee Salary:"+emp.getSalary());

	}

}
