package week2.day2.assignment;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		int value = 0;
		String[] splittext = text.split(" ");
		for(int i=0;i<splittext.length;i++) {
			value++;
			for(int j=i+1;j<splittext.length;j++) {
				if(splittext[i].equals(splittext[j])) {
					value++;
					splittext[j]="";
				}
			}
			if(value>=1) {
				System.out.print(splittext[i]+" ");
			}
		}
	}

}
