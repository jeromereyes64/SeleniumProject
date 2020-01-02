package LoopClass;

public class ForLoop {

	public static void main(String[] args) {
		double [] digit = {1.5, 2.7 ,6.1 ,4.8 ,5.221, -10};
		double x = 0;
		double sum = 0;
		double max = 0;
		
		//print all elements in double array
		for (double num : digit) {
			x++;
			System.out.println(x + ". " + num);
		}
		
		//sum all elements in double array
		for (int i = 0; i < digit.length; i++) {
			sum += digit[i];
		}
		System.out.println("Total sum: " + sum);
		
		//find the max number in double array
		for (int i = 0; i < digit.length; i++) {
			if (digit[i] >= max) {
				max = digit[i];
			}
		}
		System.out.println("Maximum number: " + max);
	}
}
