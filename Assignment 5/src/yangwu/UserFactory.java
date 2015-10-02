package yangwu;

public class UserFactory {

	public User createUser(String usertype) {
		User user = null;
		
		
		//use simple factory to decorate the user
		if (usertype.equalsIgnoreCase("A")) {
			user = new Administrator();
			user = new CreateOrEdit(user);
			user = new ViewStatus(user);
			user = new StartOrStop(user);
			user = new Delete(user);
		} else if (usertype.equalsIgnoreCase("D")) {
			user = new Developer();
			user = new CreateOrEdit(user);
		} else if (usertype.equalsIgnoreCase("O")) {
		    user = new Operator();
			user = new StartOrStop(user);
			user = new ViewStatus(user);
			user = new Delete(user);
		} else if (usertype.equalsIgnoreCase("M")) {
			user = new Monitor();
			user = new ViewStatus(user);
		}
		return user;
	}
}
