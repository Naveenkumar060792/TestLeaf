package week3.day1.weeklyAssignment;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("The depostied amount in AxisBank is Rs:50,00,000/-");
	}
	
	public static void main(String[] args) {
		AxisBank bankdetails=new AxisBank();
		bankdetails.saving();
		bankdetails.fixed();
		System.out.println("The overridden value should be printed below");
		bankdetails.deposit();
		}
}

