package week1.day2;

import java.util.Arrays;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="welcome to chennai";
		int count=0;
		char[] strChar=str.toCharArray();
		for(int i=0;i<strChar.length;i++) {
				if(strChar[i]=='e') {
					count=count+1;
				}
		}
		System.out.println("The charcter 'e' is occured "+ count+" times in the string "+ str);
	}

}
