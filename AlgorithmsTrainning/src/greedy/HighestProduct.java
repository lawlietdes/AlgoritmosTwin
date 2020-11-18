package greedy;

import java.util.ArrayList;

import java.util.Collections;


public class HighestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int array [] = {0, -1, 3, 100, 70, 50};
		
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(0);
		A.add(-1);
		A.add(3);
		A.add(100);
		A.add(-70);
		A.add(-50);
		
		//5, 5, 5, -1, -1 
		//System.out.println(maxp3(A));
	
	}
	
	 public static int maxp3(ArrayList<Integer> A) {
		 int maximumNumber = 0;
		 int twonegativesOnepositives = 0;
		 int threelast = 0;
		 boolean flag = false;
		 if (A.size()<3)return 0;
		 
		 Collections.sort(A);
		 System.out.println(A);
		 
		 threelast =A.get(A.size()-1)*A.get(A.size()-2)*A.get(A.size()-3);
		 
		 if(A.get(0) < 0 && A.get(1) < 0) {
			 twonegativesOnepositives = A.get(0)*A.get(1)*A.get(A.size()-1);
			 flag = true;
		 }
		 if(flag) {
			 maximumNumber = Math.max(threelast, twonegativesOnepositives);
		 }else {
			 maximumNumber = threelast;
		 }
		 
		 
		 return maximumNumber;
		 
	 }

}
