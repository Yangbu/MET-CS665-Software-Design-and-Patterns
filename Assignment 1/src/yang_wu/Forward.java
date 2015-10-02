package yang_wu;
/**
 *Forward.java
 * 
 * 
 * 
 */
public class Forward extends RobotPlayer{

	public Forward(int number){
		this.number = number;
		this.playBehavior = new ForwardPlay();
	}
	@Override
	public void display() {
		System.out.println("I'm a Forward.");
	}
}
