package TestMain;

public class TestBase {
	
	// Main method can be overloaded
	public static void main(String[] args) {
		System.out.println("main method1");
		
		main("Testing");
		main(10);
		main(10,20);

	}
	
	
	public static void main(String args) {
		System.out.println("main method2");

	}
	public static void main(int a) {
		System.out.println("main method3");

	
	}
	public static void main(int a, int b) {
		System.out.println("main method4");

	}
	
}
