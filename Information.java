/*
 *  - Create get ans set (X)
 *  - Don't need all this atributes 
 *  - Remove operations of constructor (X )  
 *  - do again the method ShowInfo (X )
 *  - Create other logic to set another email or others things ( X) 
 *  - In the code  has things that is not necessary get some value,instead this  just set the value  before ( X) 
 *  - Create Array to save email and password ( ) 
 * 	- Create a method that include generate e email and add in the same method 
 * */

package emailapp;


public class Information {

	 
	 private String firstName; 
	 private String lastName;  
	 private String department; 
	 
	
	 //Remove operations of constructor 
	 public Information(String firstName, String lastName, String department) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.department = department;
		}
	  
	
	 
	 public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

		
	
}
