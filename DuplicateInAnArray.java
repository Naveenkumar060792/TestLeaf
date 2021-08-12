package week1.day2;

public class DuplicateInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int duplicate[] = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		for(int i=0; i<duplicate.length;i++) {
			for (int j=i+1;j<duplicate.length;j++) {
				if (duplicate[i]==duplicate[j]) {
					System.out.println("The duplicate elements in array are : " +duplicate[j]);
				}
			}
		}
	}

}
