package week2.day2.assignment;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		int value=0;
		String[] splittext=text.split(" ");
		int splitLength=splittext.length;
		
		for(int i=0;i<splitLength;i++) {
			//System.out.println(splittext[i]);
			for(int j=1;j<splitLength;j++) {
				//System.out.println(splittext[j]);
				if(splittext[i]==splittext[j]) {
					String textValue=splittext[j];
				 	value++;
					if(value>1) {
						textValue.replace(textValue, "");
						System.out.println(splittext[j]);
					}
					
				}
			}
		}
	}

}
