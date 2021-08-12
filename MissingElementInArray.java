package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Missing element with break;
		int[] arr= {0,1,2,3,4,7,6,8};
		Arrays.sort(arr);
		for(int i=0; i<arr.length;i++) {
			if(arr[i] !=i) {
				System.out.println("Missing Element is "+ i);
				break;
			}
		}
		
	}
	
}
