package week3.day1.weeklyAssignment;

public class Students {

	void getStudentInfo(int id) {
		System.out.println("The first value in getStudentInfo with id is : "+ id);
	}
	void getStudentInfo(int id,String name) {
		System.out.println("The second value in getStudentInfo with id "+ id +" and name is : "+ name);
	}
	void getStudentInfo(String email,long phoneNumber) {
		System.out.println("The third value in getStudentInfo with email as "+ email +" and phonenumber is : "+ phoneNumber);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students getdetails=new Students();
		getdetails.getStudentInfo(123456789);
		getdetails.getStudentInfo(987654321, "Naveenkumar Baskaran");
		getdetails.getStudentInfo("nav@testleaf.com", 9630258741l);
	}

}
