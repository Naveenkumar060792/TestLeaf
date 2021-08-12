package week1.day2;

public class PrintOddNumberUsingContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		for(int i=0; i<=num;i++) {
			if(i%2!=0) {
				continue;
			}
			System.out.println(i);
			}
	}

}
