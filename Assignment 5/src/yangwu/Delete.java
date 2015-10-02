package yangwu;

public class Delete extends PrivilegeDecorator{
	User user;
	//create a CreateOrEdit constructor, user as a parameter recorded in the Instance variable
	public Delete(User user) {
		this.user = user;
	}
	//use delegate method to get the original responsibility and add additional privilege:Delete
	public String getResponsibility() {
		return user.getResponsibility() + "  Delete";
	}
	//here just use the pseudo code to test the Delete privilege has been added successfully
	public void function() {
		System.out.println("Finish the operation successfully");
		
	}
}
