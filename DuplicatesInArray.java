package week3.day2.weeklyAssignment;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class DuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int count=0;
		LinkedHashSet<Integer> unq= new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> dup= new LinkedHashSet<Integer>();
		for (int i=0; i<arr.length; i++ ) {
			for(int j=i+1; j<arr.length; j++) {
				if (arr[i]==arr[j]) {
					count++;
				}
				unq.add(arr[i]);
				if(count>=1) {
					dup.add(arr[i]);
					count=0;
				}
			}
		}
		System.out.println("The duplicates in array are: "+dup);
	}

}
