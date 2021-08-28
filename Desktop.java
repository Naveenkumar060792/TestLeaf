package week3.day2.weeklyAssignment;

public class Desktop implements Hardware,Software {
	
	public void softwareResources(String Os, boolean isOfficepreinstalled) {
		System.out.println("The OS installed in Desktop is: "+ Os);
		if(isOfficepreinstalled==false) {
			System.out.println("Office is not Installed");
		}
		else if (isOfficepreinstalled==true) {
			System.out.println("Office is pre installed");
		}
	}

	public boolean additionalsoftware(boolean issoftwarerequired) {
		if(issoftwarerequired==false) {
			System.out.println("Software is not required");
		}
		else if(issoftwarerequired==true) {
			System.out.println("Software is required");
		}
		return false;
	}

	public void hardwareResources(String display, String harddrive, String memory, int processorbit) {
		System.out.println("The display resoltion of the desktop is : "+ display);		
		System.out.println("The harddrive of the desktop is: "+ harddrive);
		System.out.println("The memory of the desktop is "+ memory);
		System.out.println("The processorbit of the desktop is "+ processorbit);
	}
	public void desktopModel(String desktop) {
		System.out.println("The model is "+ desktop);
	}

	
	public static void main(String[] args) {
		Desktop desk= new Desktop();
		System.out.println("==========Directly calling a destop method from Desktop class===============");
		desk.desktopModel("HP 360 Pavlion");
		System.out.println("==========Implementing Abstraction into Desktop Class of Hardware Interface===================");
		desk.hardwareResources("Crystal Display", "Intel HD HDD", "16GB", 64);
		System.out.println("==========Implementing Abstraction into Desktop Class of Software Interface===================");
		desk.softwareResources("Windows", false);
		desk.additionalsoftware(true);
		
	}


}
