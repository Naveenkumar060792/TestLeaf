package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String val="dad";
		String out="";
		char [] charName=val.toCharArray();
		int valLength=charName.length;
		for(int i=valLength-1;i>=0;i--) {
			out=out+charName[i];
			System.out.println(out);
		}
		System.out.println(out);
		System.out.println(val);
		
		if (out!=val){
			System.out.println("The given value is not a palindrome");
		}
		else{
			System.out.println("The given value is a palindrome");
		}
	}

}
