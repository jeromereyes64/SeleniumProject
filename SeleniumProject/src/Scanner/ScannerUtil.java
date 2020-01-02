package Scanner;
import java.util.Scanner;

public class ScannerUtil {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter number_1 : ");
		int num1 = myScanner.nextInt();
		
		System.out.println("Enter number_2 : ");
		int num2 = myScanner.nextInt();
		
		myScanner.close();
		int total = num1 + num2;
		System.out.println(total);
		
	}
}
