package week1.day2;

public class InterSection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {3,2,11,4,6,7};
		int arr2[] = {1,2,8,4,9,7};

		for (int i = 0; i <= arr1.length - 1; i++) {
			int a = arr1[i];
			for (int j = 0; j <= arr2.length - 1; j++) {
				int b = arr2[j];
				if (a == b) {
					System.out.println("The intersected values are : " + b);
				} 
			}
		}

	}

}
