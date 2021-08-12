package week1.day2;

public class Calculator {

	public int add() {
		
		int num1, num2, num3;
		num1= 6;
		num2= 7;
		num3=2;
		int sum= num1+num2+num3;
		return sum;
	}

	public int sub(int num1, int num2) {
		int subraction = num1 - num2;
		return subraction;
	}

	public double mul() {
		double num1 = 6;
		double num2 = 7;
		double product = num1 * num2;
		return product;
	}

	public float divide(float num1, float num2) {
		float division = num1 / num2;
		return division;
	}

}
