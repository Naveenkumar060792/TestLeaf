package week3.day2.weeklyAssignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String val="PayPal India";
		String value="";
		char [] charval=val.toCharArray();
		Set<Character> charSet= new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
		for(int i=0;i<charval.length;i++) {
			charSet.add(charval[i]);
			//System.out.println(charSet);
			if(charSet.equals(charval[i])) {
				dupCharSet.add(charval[i]);
			}
		}
		for (Character character : charSet) {
			value=value+ character;
		}
		System.out.println("The value after duplicate character is : "+value);
	}

}
