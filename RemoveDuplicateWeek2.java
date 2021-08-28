package week3.day2.weeklyAssignment;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWeek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String[] splittext=text.split(" ");
		String result="";
		Set<String> stringSet= new LinkedHashSet<String>(Arrays.asList(splittext));
		
		for (String text1 : stringSet) {
			result=result+" "+text1;
		}
		System.out.println("The value after removing duplicate words is: "+result);
	}

}
