package yangwu;

public abstract class User {
	String responsibility = "Unknown Command";
	
	public String getResponsibility() {
		return responsibility;
	}
	
	public abstract  void function();

}
