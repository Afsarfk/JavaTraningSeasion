
public class LoopsConcept {

	public static void main(String[] args) {
		
		
		
		//print 1 to 10
		// 1. While Loop:
		// What is disadvantage of while loop?
		// It will generate infinite loop if you don't give incremental/ decremental part
		
		int i=1; //initialization
		while(i<=10) { //conditional
			
			System.out.println(i);
			i=i+1; //incremental/decremental
		}
		
		
			System.out.println("*********");
			
		//2. For Loop:
		// j++ means j=j+1
		
		
		for(int j=1;j<=10;j++) {//initialization, conditional, incremental
			System.out.println(j);
		}
		
		
		// print 10 to 1
		// k-- means k=k-1
		for(int k=10; k>=1;k--) {//initialization, conditional, decremental
			System.out.println(k);
		}
		
		

	}

}
