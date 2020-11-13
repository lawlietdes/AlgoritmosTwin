package greedy;

import java.util.ArrayList;

public class Bulbs {
	public static void main (String args[]) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		
		A.add(0);
		A.add(1);
		A.add(0);
		A.add(1);
		System.out.println(bulbs(A));
	}
	
	public static int bulbs(ArrayList<Integer> A) {
		int minimumswitches = 0;
		for (int i = 0; i < A.size(); i++) {
			int turned = A.get(i) + minimumswitches;
			if(turned % 2 == 0) {
				minimumswitches++;
			}
		}
		
		return minimumswitches;
    }
}
