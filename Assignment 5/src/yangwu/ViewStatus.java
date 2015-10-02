package yangwu;

public class ViewStatus extends PrivilegeDecorator{
	User user;
	//create a CreateOrEdit constructor, user as a parameter recorded in the Instance variable
	public ViewStatus(User user) {
		this.user = user;
	}
	//use delegate method to get the original responsibility and add additional privilege: ViewStatus
	public String getResponsibility() {
		return user.getResponsibility() + "  ViewStatus";
	}
	////here just use the pseudo code to test the ViewStatus privilege has been added successfully
	public void function() {
		System.out.println("Finish the operation successfully");
		
	}
}
