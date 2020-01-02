package SimpleClass;
import SimpleClass.SetEmployee;
public class GetEmployee {
	public static final String NAME = "JEROME";
	public static void main(String[] args) {
		SetEmployee setEMP = new SetEmployee("Jerome");
		setEMP.setAge(22);
		setEMP.setDesignation("Automation Engineer");
		setEMP.setSalary(50000);
		setEMP.printEmployee();
		
		System.out.println(NAME);
		
	}
}

