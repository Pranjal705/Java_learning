package oops.inheritancePractice.question1.question2;

public class Main {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.Name = "AdarshBhusan Singh";
		e1.Age = 20;
		e1.PhoneNumber = 9815297163l;
		e1.Adress = "Duhabi, Nepal";
		e1.Salary = 5000000;
		
		Manager m1 = new Manager();
		m1.Name = "Pranjal Gupta";
		m1.Age = 20;
		m1.PhoneNumber = 9855022973l;
		m1.Adress = "Birgunj, Nepal";
		m1.Salary = 5500000;
		
		System.out.println(e1.Name);
		System.out.println(e1.Age);
		System.out.println(e1.PhoneNumber);
		System.out.println(e1.Adress);
		e1.printSalary();
		
		System.out.println(m1.Name);
		System.out.println(m1.Age);
		System.out.println(m1.PhoneNumber);
		System.out.println(m1.Adress);
		m1.printSalary();
	}

}
