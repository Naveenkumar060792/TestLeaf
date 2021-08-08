package week1.day1;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 6792;
		int sum = 0;
		int remainder;
		while (input > 0) {

			remainder = input % 10;

			System.out.println(remainder);

			sum = sum + remainder;
			
			input = input / 10;
		}
		System.out.println("Sum of the given value is " + sum);
	}

}
