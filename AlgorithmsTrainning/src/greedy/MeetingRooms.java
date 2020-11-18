package greedy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MeetingRooms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> A =  new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> B= new ArrayList<Integer>();
		
		Integer array[] = {0, 30};
		Integer array1[] = {5, 10};
		Integer array2[] = {15, 20};
		
		/*
		Integer array[] = {1,23};
		Integer array1[] = {1, 3};
		Integer array2[] = {22, 23};
		Integer array3[] = {8, 25};
		Integer array4[] = {14, 27};
		Integer array5[] = {4, 24};
		*/
		
		//4
		/*
		Integer array[] = {1,18};
		Integer array1[] = {2, 11};
		Integer array2[] = {4, 15};
		Integer array3[] = {5, 13};
		Integer array4[] = {15, 20};
		Integer array5[] = {18, 23};
		*/
		
		//3
		/*Integer array[] = {7, 10};
		Integer array1[] = {4, 19};
		Integer array2[] = {19, 26};
		Integer array3[] = {14, 16};
		Integer array4[] = {13, 18};
		Integer array5[] = {16, 21};
		*/
	
		
		
		/*Integer array[] = {6,28};
		Integer array1[] = {25, 20};
		Integer array2[] = {12, 20};*/
		
		A.add(new ArrayList<Integer>(Arrays.asList(array)));
		A.add(new ArrayList<Integer>(Arrays.asList(array1)));
		A.add(new ArrayList<Integer>(Arrays.asList(array2)));
		//A.add(new ArrayList<Integer>(Arrays.asList(array3)));
		//A.add(new ArrayList<Integer>(Arrays.asList(array4)));
		//A.add(new ArrayList<Integer>(Arrays.asList(array5)));
		
		System.out.println(solve(A));

	}
	
	public static int solve(ArrayList<ArrayList<Integer>> A) {
		int rooms = 0;
		ArrayList<Integer> start = new ArrayList<Integer>();
		ArrayList<Integer> end = new ArrayList<Integer>();
		
		if (A.isEmpty()) return 0;
		if (A.size()== 1)return 1;
		for (int i = 0; i < A.size(); i++) {
			start.add(A.get(i).get(0));
			end.add(A.get(i).get(1));
		}
		
		Collections.sort(start);
		Collections.sort(end);
		System.out.println(start.toString());
		System.out.println(end.toString());
		//System.out.println(A.toString());
		/*Collections.sort(A, new Comparator<ArrayList<Integer>> () {
		    @Override
		    public int compare(ArrayList<Integer> a, ArrayList<Integer> b) {
		        return a.get(0).compareTo(b.get(0));
		    }
		});
		//System.out.println(A.toString());
		Collections.sort(A, new Comparator<ArrayList<Integer>> () {
		    @Override
		    public int compare(ArrayList<Integer> a, ArrayList<Integer> b) {
		        return a.get(1).compareTo(b.get(1));
		    }
		});*/
		
		
		//System.out.println(A.toString());
		rooms = 1 ;
		int indexboundry = 0;
		int maxboundry = end.get(indexboundry);
		
		for (int i = 0; i < A.size()-1; i++) {
			
			if (start.get(i+1) < end.get(indexboundry)) {
				System.out.println(start.get(i+1) + "  <= "+end.get(indexboundry));
				rooms ++ ;
				System.out.println(rooms);
			}else {
				indexboundry++;
				maxboundry = end.get(indexboundry);
			}
			
		}
		
		
		return rooms;
    }

}
