package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val=20;
		boolean flag=false;
		for(int i=2; i<=val/2; i++) {
			if (val%i ==0) {
				flag=true;
				break;
			}
		}
	
		if (flag=!flag) {
			System.out.println("The given number " + val + " is a Prime number");
		}
		else{
			System.out.println("The given number " + val + " is a not a Prime number");
		}
	}

}
