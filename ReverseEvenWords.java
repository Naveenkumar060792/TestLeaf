package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester"; 
		String[] split=test.split(" ");
		String output="";
		String val="";
		String reverse="";
		for(int i=0;i<split.length;i++) {
			if(i%2!=0) {
				char[] word=split[i].toCharArray();
				
				for(int j=word.length;j>0;j--) {
					reverse=reverse+String.valueOf(word[j-1]);
				}
			}
			else {
				 reverse=reverse+split[i];
			}
			reverse=reverse+" ";
		}
		System.out.println("The Reverse word of "+test+" a Even word in a string is :"+ reverse);
	}

}