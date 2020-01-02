package SimpleClass;

public class SetEmployee {
	int age;
	float salary;
	String designation;

	public SetEmployee(String name) {
		System.out.println("My name is: " + name);
	}
	
	public void setAge (int myAge){
		age = myAge;
	}
	
	public void setSalary (int mySalary){
		salary = mySalary;
	}
	
	public void setDesignation (String myDesignation){
		designation = myDesignation;
	}
	
	public void printEmployee(){
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);
		System.out.println("Designation: " + designation);
	}
	
}
