package emailapp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Menu menu = new Menu(); 
		menu.displayMenu();
		int choice = input.nextInt();
		menu.performAction(choice);
		input.close();
	}

}
