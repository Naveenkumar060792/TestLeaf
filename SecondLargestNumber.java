package week3.day2.weeklyAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("============================Implementing using List========================");
		int[] datalist = {3,2,11,4,6,7};
		ArrayList<Integer> numberlist= new ArrayList<Integer>();
		for (Integer integerlist : datalist) {
			numberlist.add(integerlist);
		}
		Collections.sort(numberlist);
		System.out.println(numberlist);
		int val=numberlist.size();
		System.out.println("The Second largest number is : "+ numberlist.get(val-2));

	}

}
