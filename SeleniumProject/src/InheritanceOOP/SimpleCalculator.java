package InheritanceOOP;

public class SimpleCalculator {
	protected int total; 
	
	public void addition (int num1, int num2){
		total = num1 + num2;
		System.out.println("Total sum is: " + total);
	}
	
	public void subtraction (int num1, int num2) {
		total = num1 - num2;
		System.out.println("Total difference is: " + total);
	}	
}
