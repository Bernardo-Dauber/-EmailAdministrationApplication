package emailapp;
import java.util.*;

public class Menu {

		private Scanner input; 
		
		//Constructor 
		public Menu() {
			
			this.input = new Scanner(System.in);
		}
		
		//Create a Menu and the options 
		public void displayMenu() {
			System.out.println("Email Company System:");
			System.out.println("1- Create Email ");
			System.out.println("2- Set other email");
			System.out.println("3- Change Password");
			System.out.println("4- Exit");
			 
		}
		
		//get the user Choice
		public int getUserChoice() {
		    int choice = input.nextInt();
		    input.nextLine(); // consume newline character
		    return choice;
		}
		
		
		
		
		public void performAction(int choice) {
			
			
			
			
			switch (choice) {
			case 1:
				
				System.out.println("You selected Option 1: Create Email");
                System.out.println("Enter your first name: ");
                String firstName = input.next();
                System.out.println("Enter your last name: ");
                String lastName = input.next();                
                System.out.println("Enter your department:\n#Development\n#Sales\n#Accounting: ");
                String department = input.next();
                Information information = new Information(firstName,lastName,department);
                SystemEmail system = new SystemEmail(); 
                system.generateEmail(information);
                system.showInfo();
                
                
                break;
            case 2:
                System.out.println("You selected Option 2: Set other Email	");
                // Add code to perform action for Option 2
                break;
            case 3:
                System.out.println("You selected Option 3");
                // Add code to perform action for Option 3
                break;
            case 4:
                System.out.println("Exiting...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
			
			
			
			
			
		}










}
	