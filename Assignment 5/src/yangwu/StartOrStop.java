package yangwu;

public class StartOrStop extends PrivilegeDecorator {
	User user;
	//create a CreateOrEdit constructor, user as a parameter recorded in the Instance variable
	public StartOrStop(User user) {
		this.user = user;
	}
	//use delegate method to get the original responsibility and add additional privilege: StartOrStop
	public String getResponsibility() {
		return user.getResponsibility() + "  StartOrStop";
	}
	////here just use the pseudo code to test the StartOrStop privilege has been added successfully
	public void function() {
		System.out.println("Finish the operation successfully");
		
	}
}
