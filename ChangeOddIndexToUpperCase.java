package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="testleaf";
		String value="";
		String tot="";
		String tot1="";
		String val="";
		String val2="";
		char[] charval=name.toCharArray();
		for(int i=0; i<charval.length;i++)
		{
			if(i%2==0) {
				value=tot+charval[i];
				val=value.toUpperCase();
				//System.out.println(val);
				tot1=tot1+val;
				//System.out.println(tot1);
			}
			else
			{
				val2=tot+charval[i];
				//System.out.println(val2);
				tot1=tot1+val2;
				//System.out.println(tot1);
			}
		}
		System.out.println("The ouput for the value in odd index to uppercase is : "+tot1);
	}
}
