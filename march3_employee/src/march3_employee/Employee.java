package march3_employee;

public class Employee {
	
	private int id;
	private String name;
	private int age;
	private String email;
	private Project project;
	private Address presentAddress;
	private Address permanentAddress;
	
	public Employee(int id, String name, int age, String email, Project project, Address presentAddress, Address permanentAddress) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.project = project;
		this.presentAddress = presentAddress;
		this.permanentAddress = permanentAddress;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", project=" + project
				+ ", presentAddress=" + presentAddress + ", permanentAddress=" + permanentAddress + "]";
	}
	
	
}
