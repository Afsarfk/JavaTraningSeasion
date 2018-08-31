import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		
		
		ar.add(100);	//0
		ar.add(200);	//1
		ar.add(300);	//2		
		
		
		System.out.println(ar.size());
		
		ar.add(400);	//3
		ar.add(500);	//4
		
		System.out.println(ar.size());
		
		ar.add("Tom");	//5
		ar.add("Hello");	//6		
		ar.add(12.33);	//7
		ar.add('M');	//8
		
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(4));
		
		//System.out.println(ar.get(9));	// It will give error bcoz 9 index  dosen't exgist 
		
		// How to print all value of Array list?
		
		//Ans: we have to use for loop
		
		
		for (int i =0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> ar1 =new ArrayList<Integer>();
		ar1.add(100);
		//ar1.add("Tom");
		
		ArrayList<String> ar2 =new ArrayList<String>();
		ar2.add("Tom");
		//ar2.add(100);
		
		
		
		
		
		
	}

}
