package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=30;
		int calculated=0;
		int remainder;
		int original;
		original=input;
		while(original>0)
		{
			remainder= original%10;
			original=original/10;
			calculated=calculated+remainder*remainder*remainder;
			
		}
		if(calculated==input) {
		System.out.println("The given number "+ input + " is an Armstrong");	
		}
		else
		{
			System.out.println("The given number "+ input + " is not a Armstrong");
		}
		
		}

}
