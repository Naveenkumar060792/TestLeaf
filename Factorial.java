package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=6;
		int fact=1;
		for(int i=1; i<=input; i++) {
			System.out.println("The value is taken is "+ i);
			
			fact=fact*i;
			
			System.out.println(fact);
			
			
		}	
	}

}
