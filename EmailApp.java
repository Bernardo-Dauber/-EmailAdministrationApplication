package emailapp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
	    SystemEmail system = new SystemEmail(); // Crie o objeto SystemEmail aqui

	    Menu menu = new Menu(); 
	    Scanner input = new Scanner(System.in);
	    
	    while (true) {
	    	menu.displayMenu();
	        int choice = input.nextInt();
	        menu.performAction(choice, system); // Passe o objeto SystemEmail como argumento
	    }
	}

	
}
