
public class FunctionslnJava {
	
	
	
	// Main method is starting point of execution
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		FunctionslnJava obj = new FunctionslnJava ();
		// one object will be created, obj is the reference varible, refrering to this object
		//after creating the object, the copy of non static methods will be give to this object
		
		
		obj.test();
		
		int l = obj.pqr();
		System.out.println(l);
		 
		String s1 = obj.qa();                                 
		System.out.println(s1);
		
		int div = obj.devision(30,10);
		System.out.println(div);                                             
		

	}

	// Non Static methods 
	// Void means dose not return any value
	public void test() {		// NO input, no output
		System.out.println("test method");
	}
	
	
	// return type = int 
	public int  pqr() {		//no input some output
		System.out.println("pqr method");
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
		
	}
	// return type is string 
	public String  qa() {  // no input some output
		System.out.println("qa method ");
		String s = "selenium";
		
		return s;
		
	}
	
	// return type is int 
	// x, y --> input parameter/ arguments
	public int   devision (int x, int y) {
		
		System.out.println("divisoin method");
		
		int d = x/y;
		
		return d;
	}
	
	
	
}
