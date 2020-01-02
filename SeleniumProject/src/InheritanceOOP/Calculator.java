package InheritanceOOP;

public class Calculator extends SimpleCalculator {
	public void multiplication (int num1, int num2) {
		total = num1 * num2;
		System.out.println("Total:  " + total);
	}
	
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.addition(2, 1);
		calc.subtraction(3, 5);
	
		double num1 = 9.89;
		int num2 = (int) num1;
		System.out.println(num1 + "," + num2);
	}

}
