package yangwu;

public class CreateOrEdit extends PrivilegeDecorator {
	User user;
	//create a CreateOrEdit constructor, user as a parameter recorded in the Instance variable
	public CreateOrEdit(User user) {
		this.user = user;
	}
	//use delegate method to get the original responsibility and add additional privilege: CreateOrEdit
	public String getResponsibility() {
		return user.getResponsibility() + "  CreateOrEdit";
	}
	////here just use the pseudo code to test the CreateOrEdit privilege has been added successfully
	public void function() {
		System.out.println("Finish the operation successfully");
		
	}

}
