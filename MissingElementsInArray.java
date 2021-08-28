package week3.day2.weeklyAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		List<Integer> listval= new ArrayList<Integer>();
		for (int i=0; i<arr.length; i++) {
			listval.add(arr[i]);
		}
		Collections.sort(listval);
		int iterate=1;
		for (Integer integer : listval) {
			if(iterate!=integer) {
				System.out.println("The missing number is : "+iterate );
				break;
			}
			++iterate;
		}

	}

}
