
public class IfElseConcept {

	public static void main(String[] args) {
		
		
		//comparison operators:
		// < >, <= >=, == !=

		int a =10;
		int b=20;
		
		int x =30;
		int y = 40;
		
		//comparsion greater than and less than
		if (b>a) {
			System.out.println("true");
		}
		
		else {
			System.out.println("false");
		}
		
		
		if(x<y) {
			System.out.println("false");
		}
		
		else {
			System.out.println("true");
		}
		
		//comparsion Equal to Equal
		
		int c =40;
		int d = 40;
		
		if (c==d) {
			System.out.println("turu");
		}
		
		else {
			System.out.println("false");
		}
		
		//Nested if - else comparison
		// Find out highest number 
		
		int a1 = 100;
		int b1 = 200;
		int c1 =300;
		
		if(a1>b1 & a1>c1) {
			System.out.println("a1 is the greater");
		}
		
		else if (b1>c1) {
			System.out.println("b1 is the greter");
		}
		
		else {
			System.out.println("c1 is the grester");
			
		}
		
	}
	

}
