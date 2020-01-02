package JavaPractice;

public class JavaPractice {
	int myAge;
	
	public JavaPractice(String name) {
		System.out.println("My Name is: " + name);
	}
	
	public void setAge(int age) {
		myAge = age;
	}
	
	public int getAge(){
		System.out.println("My age is: " + myAge);
		return myAge;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello Pogi");
		JavaPractice jp = new JavaPractice("Jerome");
		jp.setAge(6);
		jp.getAge();
	}
	
}
