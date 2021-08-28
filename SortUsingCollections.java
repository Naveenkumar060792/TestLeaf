package week3.day2.weeklyAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class SortUsingCollections {

	public static void main(String[] args) {
		String[] techComp={"Wipro", "HCL", "CTS", "Aspire Systems"};
		List<String> techCompany=new ArrayList<String>(Arrays.asList(techComp));
		Collections.sort(techCompany);
		Collections.reverse(techCompany);
		System.out.println(techCompany);
		

	}

}
