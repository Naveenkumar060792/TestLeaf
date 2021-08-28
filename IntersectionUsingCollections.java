package week3.day2.weeklyAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IntersectionUsingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1={3,2,11,4,6,7};	 
		int [] arr2={1,2,8,4,9,7};
		List<Integer> array1= new ArrayList<Integer>();
		List<Integer> array2= new ArrayList<Integer>();
		for (Integer integer1 : arr1) {
			array1.add(integer1);
		}
		for (Integer integer2 : arr2) {
			array2.add(integer2);
		}
		//System.out.println(array1);
		//System.out.println(array2);
		array1.retainAll(array2);
		System.out.println("The intersect values are : "+array1);
	}

}
