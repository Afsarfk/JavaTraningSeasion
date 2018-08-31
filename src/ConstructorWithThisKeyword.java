
public class ConstructorWithThisKeyword {

		
		String name1;
		int age;
		
	public ConstructorWithThisKeyword(String name, int age) {
		
		//this.name = name;
		//this.age = age;
		
		name1 = name;
		
		
		System.out.println(name);
		System.out.println(age);
		
	}
		
	
	public static void main(String[] args) {
		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Tome", 30);
		

	}

}
