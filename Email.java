package emailapp;

public class Email extends SystemEmail {
	
	private String emailAddress; 
	private String password;
	public Email(String emailAddress, String password) {
		super();
		this.emailAddress = emailAddress;
		this.password = password;
	}
	public String getEmail() {
		return emailAddress;
	}
	public void setEmail(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	} 


	@Override
    public String toString() {
        return "Email address: " + emailAddress + ", Password: " + password;
    }


}
