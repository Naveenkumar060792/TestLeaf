package org.system;

public class Desktop extends Computer {

	public void desktopSize() {
		// TODO Auto-generated method stub
		System.out.println("The desktop size of the system is 21.4 inches");
	}
	public static void main(String[] args) {
		Desktop config= new Desktop();
		config.desktopSize();
		config.computerModel();
	}
}
