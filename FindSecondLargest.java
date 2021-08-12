package week1.day2;

import java.util.Arrays;
import java.util.Collections;

public class FindSecondLargest  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrNum[] = {3,2,11,4,6,7};
		Arrays.sort(arrNum);
		
		System.out.println("Second Largest number is : "+ arrNum[arrNum.length-2]);
		//Collections.reverse(arrNum);
	}

}
