package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calVal= new Calculator();
		
		int sumVal=calVal.add();
		System.out.println("The sum of given input is : "+ sumVal);
		
		int subVal= calVal.sub(6, 7);
		System.out.println("The subtraction of given value is : "+subVal);
		
		double mulVal=calVal.mul();
		System.out.println("The product of given input is : "+mulVal);
		
		float divVal=calVal.divide(8, 7);
		System.out.println("The division of given input is : "+ divVal);
	}

}
