package week1.day2;

import java.util.Arrays;

import org.w3c.dom.Text;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String val1="stops";
		String val2="posts";
		if(val1.length()!=val2.length()) {
			System.out.println("The given value of both string not satisfies and it is not an Anagram");
		}
			else {
				char[] val3=val1.toCharArray();
				char[] val4=val2.toCharArray();
				Arrays.sort(val3);
				Arrays.sort(val4);
				if(Arrays.equals(val3, val4)){
					System.out.println("The given value of both string satisfies into an Anagram");
				}
				else {
					System.out.println("The given value of both string not satisfies and it is not an Anagram");
				}
			}
			
	}

}
