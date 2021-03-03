package march3_employee;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Project p1 = new Project(66, "Death Star", "Palpatine");
		Address aPres1 = new Address(145, "Jedi Way", "Coruscant", "Corsuca", 19456);
		Address aPerm1 = new Address(689, "Moisture Row", "Mos Eisly", "Tatooine", 79654);
		Employee e1 = new Employee(100, "Luke Skywalker", 25, "LSkywalker@Jedi", p1, aPres1, aPerm1);
		
		System.out.println(e1);
	}
}
